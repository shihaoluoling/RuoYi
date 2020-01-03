package com.ruoyi.project.monitor.job.task;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.StringUtils;
import com.ruoyi.project.mall.member.domain.UmsMember;
import com.ruoyi.project.mall.member.service.IUmsMemberService;
import com.ruoyi.project.mall.order.domain.OmsOrder;
import com.ruoyi.project.mall.order.service.IOmsOrderService;
import com.ruoyi.project.mall.product.domain.PmsProduct;
import com.ruoyi.project.mall.product.service.IPmsProductService;
import com.ruoyi.project.mall.statics.domain.AdminDayStatics;
import com.ruoyi.project.mall.statics.service.IAdminDayStaticsService;
import com.ruoyi.project.mall.store.domain.Store;
import com.ruoyi.project.mall.store.service.IStoreService;
import com.ruoyi.project.mall.subject.domain.CmsSubject;
import com.ruoyi.project.mall.subject.service.ICmsSubjectService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.*;

/**
 * 定时任务调度测试
 *
 * @author ruoyi
 */
@Slf4j
@Component("ryTask")
public class RyTask {

    @Resource
    private IUmsMemberService memberService;
    @Resource
    private IOmsOrderService orderService;
    @Resource
    private ICmsSubjectService subjectService;
    @Resource
    private IPmsProductService pmsProductService;
    @Resource
    private IStoreService storeService;

    @Resource
    private IAdminDayStaticsService dayStaticsService;

    public static void main(String[] args) {
        Map<String, Object> params = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        params.put("endTime", calendar.getTime());
        calendar.set(Calendar.HOUR_OF_DAY, -24);
        params.put("startTime", calendar.getTime());

        System.out.println(params);
    }

    public void ryMultipleParams(String s, Boolean b, Long l, Double d, Integer i) {
        System.out.println(StringUtils.format("执行多参方法： 字符串类型{}，布尔类型{}，长整型{}，浮点型{}，整形{}", s, b, l, d, i));
    }

    public void ryParams(String params) {
        System.out.println("执行有参方法：" + params);
    }

    public void ryNoParams() {
        System.out.println("执行无参方法");
    }

    /**
     * 商户数据日统计
     */
    public void storeDayStatics() throws InterruptedException {

        List<Store> storeList = storeService.selectStoreList(null);
        log.info("商户数据日统计：{}，共{}个商户需要需要同步", DateUtils.getNowDate(), storeList.size());
        Map<String, Object> params = new HashMap<>();
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MILLISECOND, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.HOUR_OF_DAY, 0);
        params.put("endTime", DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD_HH_MM_SS, calendar.getTime()));
        calendar.set(Calendar.HOUR_OF_DAY, -24);
        params.put("beginTime", DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD_HH_MM_SS, calendar.getTime()));

        dayStaticsService.deleteAdminDayStaticsByDate(DateUtils.parseDateToStr(DateUtils.YYYY_MM_DD, calendar.getTime()));

        Thread.sleep(3*1000);
        for (Store store : storeList) {
            UmsMember member = new UmsMember();
            member.setParams(params);
            member.setStoreId(store.getId());
            List<UmsMember> memberList = memberService.selectUmsMemberList(member);

            PmsProduct product = new PmsProduct();
            product.setParams(params);
            product.setStoreId(store.getId());
            List<PmsProduct> productList = pmsProductService.selectPmsProductList(product);

            OmsOrder order = new OmsOrder();
            order.setParams(params);
            order.setStoreId(store.getId());
            List<OmsOrder> orderList = orderService.selectOmsOrderList(order);

            CmsSubject subject = new CmsSubject();
            subject.setParams(params);
            subject.setStoreId(store.getId());
            List<CmsSubject> subjectList = subjectService.selectCmsSubjectList(subject);

            AdminDayStatics dayStatics = new AdminDayStatics();
            dayStatics.setArticleCount(subjectList.size());
            dayStatics.setGoodsCount(productList.size());
            dayStatics.setMemberCount(memberList.size());

            Integer payOrderCount = 0;
            BigDecimal payAmount = BigDecimal.ZERO;
            Integer notPayOrderCount = 0;
            BigDecimal notPayAmount = BigDecimal.ZERO;
            for (OmsOrder omsOrder : orderList) {
                if (omsOrder.getPayAmount() != null) {
                    if (omsOrder.getStatus() < 9) {
                        payOrderCount++;
                        payAmount = payAmount.add(omsOrder.getPayAmount());
                    } else {
                        notPayOrderCount++;
                        notPayAmount = notPayAmount.add(omsOrder.getPayAmount());
                    }
                }
            }
            dayStatics.setPayAmount(payAmount);
            dayStatics.setPayOrderCount(payOrderCount);
            dayStatics.setNotPayAmount(notPayAmount);
            dayStatics.setNotPayOrderCount(notPayOrderCount);
            dayStatics.setStoreId(store.getId());
            dayStatics.setStoreName(store.getName());
            dayStatics.setCreateTime(calendar.getTime());
            dayStatics.setCreateBy("mallplus后台任务");
            dayStaticsService.insertAdminDayStatics(dayStatics);
            log.info("商户数据日统计end====：{}，商户ID={},商户名称={}", DateUtils.getNowDate(), store.getId(), store.getName());
        }
        log.info("商户数据日统计end====：{}", DateUtils.getNowDate());
    }

    /**
     * 商户统计
     */
    public void storeStatics() throws InterruptedException {

        List<AdminDayStatics> dayStatics = dayStaticsService.selectAdminDayStaticsGroupBySId();
        log.info("商户统计：{}，共{}个商户需要需要同步", DateUtils.getNowDate(), dayStatics.size());
        for (AdminDayStatics dayStatics1 : dayStatics){
            Store store = new Store();
            store.setMemberCount(dayStatics1.getMemberCount());
            store.setId(dayStatics1.getStoreId());
            store.setGoodsCount(dayStatics1.getGoodsCount());
            store.setArticleCount(dayStatics1.getArticleCount());
            store.setOrderCount(dayStatics1.getPayOrderCount());
            store.setPayAmount(dayStatics1.getPayAmount());
            storeService.updateStore(store);
        }
        log.info("商户统计end====：{}", DateUtils.getNowDate());
    }

}
