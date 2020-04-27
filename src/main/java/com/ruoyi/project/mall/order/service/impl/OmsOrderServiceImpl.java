package com.ruoyi.project.mall.order.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.text.Convert;
import com.ruoyi.project.mall.order.domain.OmsOrder;
import com.ruoyi.project.mall.order.mapper.OmsOrderMapper;
import com.ruoyi.project.mall.order.service.IOmsOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单Service业务层处理
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Service
public class OmsOrderServiceImpl implements IOmsOrderService {
    @Autowired
    private OmsOrderMapper omsOrderMapper;

    /**
     * 查询订单
     *
     * @param id 订单ID
     * @return 订单
     */
    @Override
    public OmsOrder selectOmsOrderById(Long id) {
        return omsOrderMapper.selectOmsOrderById(id);
    }

    /**
     * 查询订单列表
     *
     * @param omsOrder 订单
     * @return 订单
     */
    @Override
    public List<OmsOrder> selectOmsOrderList(OmsOrder omsOrder) {
        return omsOrderMapper.selectOmsOrderList(omsOrder);
    }

    /**
     * 新增订单
     *
     * @param omsOrder 订单
     * @return 结果
     */
    @Override
    public int insertOmsOrder(OmsOrder omsOrder) {
        omsOrder.setCreateTime(DateUtils.getNowDate());
        return omsOrderMapper.insertOmsOrder(omsOrder);
    }

    /**
     * 修改订单
     *
     * @param omsOrder 订单
     * @return 结果
     */
    @Override
    public int updateOmsOrder(OmsOrder omsOrder) {
        omsOrder.setUpdateTime(DateUtils.getNowDate());
        return omsOrderMapper.updateOmsOrder(omsOrder);
    }

    /**
     * 删除订单对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOmsOrderByIds(String ids) {
        return omsOrderMapper.deleteOmsOrderByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除订单信息
     *
     * @param id 订单ID
     * @return 结果
     */
    public int deleteOmsOrderById(Long id) {
        return omsOrderMapper.deleteOmsOrderById(id);
    }
}
