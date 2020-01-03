package com.ruoyi.project.mall.payments.controller;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.project.mall.payments.domain.OmsPayments;
import com.ruoyi.project.mall.payments.service.IOmsPaymentsService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 支付方式Controller
 * 
 * @author mallplus
 * @date 2020-01-03
 */
@Controller
@RequestMapping("/mall/payments")
public class OmsPaymentsController extends BaseController
{
    private String prefix = "mall/payments";

    @Autowired
    private IOmsPaymentsService omsPaymentsService;

    @RequiresPermissions("mall:payments:view")
    @GetMapping()
    public String payments()
    {
        return prefix + "/payments";
    }

    /**
     * 查询支付方式列表
     */
    @RequiresPermissions("mall:payments:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OmsPayments omsPayments)
    {
        startPage();
        List<OmsPayments> list = omsPaymentsService.selectOmsPaymentsList(omsPayments);
        return getDataTable(list);
    }

    /**
     * 导出支付方式列表
     */
    @RequiresPermissions("mall:payments:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OmsPayments omsPayments)
    {
        List<OmsPayments> list = omsPaymentsService.selectOmsPaymentsList(omsPayments);
        ExcelUtil<OmsPayments> util = new ExcelUtil<OmsPayments>(OmsPayments.class);
        return util.exportExcel(list, "payments");
    }

    /**
     * 新增支付方式
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存支付方式
     */
    @RequiresPermissions("mall:payments:add")
    @Log(title = "支付方式", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OmsPayments omsPayments)
    {
        return toAjax(omsPaymentsService.insertOmsPayments(omsPayments));
    }

    /**
     * 修改支付方式
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, ModelMap mmap)
    {
        OmsPayments omsPayments = omsPaymentsService.selectOmsPaymentsById(id);
        mmap.put("omsPayments", omsPayments);
        return prefix + "/edit";
    }

    /**
     * 修改保存支付方式
     */
    @RequiresPermissions("mall:payments:edit")
    @Log(title = "支付方式", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OmsPayments omsPayments)
    {
        return toAjax(omsPaymentsService.updateOmsPayments(omsPayments));
    }

    /**
     * 删除支付方式
     */
    @RequiresPermissions("mall:payments:remove")
    @Log(title = "支付方式", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(omsPaymentsService.deleteOmsPaymentsByIds(ids));
    }
}
