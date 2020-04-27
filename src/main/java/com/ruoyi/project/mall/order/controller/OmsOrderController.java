package com.ruoyi.project.mall.order.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.mall.order.domain.OmsOrder;
import com.ruoyi.project.mall.order.service.IOmsOrderService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 订单Controller
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Controller
@RequestMapping("/mall/order")
public class OmsOrderController extends BaseController {
    private String prefix = "mall/order";

    @Autowired
    private IOmsOrderService omsOrderService;

    @RequiresPermissions("mall:order:view")
    @GetMapping()
    public String order() {
        return prefix + "/order";
    }

    /**
     * 查询订单列表
     */
    @RequiresPermissions("mall:order:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OmsOrder omsOrder) {
        startPage();
        List<OmsOrder> list = omsOrderService.selectOmsOrderList(omsOrder);
        return getDataTable(list);
    }

    /**
     * 导出订单列表
     */
    @RequiresPermissions("mall:order:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OmsOrder omsOrder) {
        List<OmsOrder> list = omsOrderService.selectOmsOrderList(omsOrder);
        ExcelUtil<OmsOrder> util = new ExcelUtil<OmsOrder>(OmsOrder.class);
        return util.exportExcel(list, "order");
    }

    /**
     * 新增订单
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存订单
     */
    @RequiresPermissions("mall:order:add")
    @Log(title = "订单", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OmsOrder omsOrder) {
        return toAjax(omsOrderService.insertOmsOrder(omsOrder));
    }

    /**
     * 修改订单
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        OmsOrder omsOrder = omsOrderService.selectOmsOrderById(id);
        mmap.put("omsOrder", omsOrder);
        return prefix + "/edit";
    }

    /**
     * 修改保存订单
     */
    @RequiresPermissions("mall:order:edit")
    @Log(title = "订单", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OmsOrder omsOrder) {
        return toAjax(omsOrderService.updateOmsOrder(omsOrder));
    }

    /**
     * 删除订单
     */
    @RequiresPermissions("mall:order:remove")
    @Log(title = "订单", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(omsOrderService.deleteOmsOrderByIds(ids));
    }
}
