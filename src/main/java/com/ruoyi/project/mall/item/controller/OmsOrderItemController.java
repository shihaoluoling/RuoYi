package com.ruoyi.project.mall.item.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.mall.item.domain.OmsOrderItem;
import com.ruoyi.project.mall.item.service.IOmsOrderItemService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 订单中所包含的商品Controller
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Controller
@RequestMapping("/mall/item")
public class OmsOrderItemController extends BaseController {
    private String prefix = "mall/item";

    @Autowired
    private IOmsOrderItemService omsOrderItemService;

    @RequiresPermissions("mall:item:view")
    @GetMapping()
    public String item() {
        return prefix + "/item";
    }

    /**
     * 查询订单中所包含的商品列表
     */
    @RequiresPermissions("mall:item:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(OmsOrderItem omsOrderItem) {
        startPage();
        List<OmsOrderItem> list = omsOrderItemService.selectOmsOrderItemList(omsOrderItem);
        return getDataTable(list);
    }

    /**
     * 导出订单中所包含的商品列表
     */
    @RequiresPermissions("mall:item:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(OmsOrderItem omsOrderItem) {
        List<OmsOrderItem> list = omsOrderItemService.selectOmsOrderItemList(omsOrderItem);
        ExcelUtil<OmsOrderItem> util = new ExcelUtil<OmsOrderItem>(OmsOrderItem.class);
        return util.exportExcel(list, "item");
    }

    /**
     * 新增订单中所包含的商品
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存订单中所包含的商品
     */
    @RequiresPermissions("mall:item:add")
    @Log(title = "订单中所包含的商品", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(OmsOrderItem omsOrderItem) {
        return toAjax(omsOrderItemService.insertOmsOrderItem(omsOrderItem));
    }

    /**
     * 修改订单中所包含的商品
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        OmsOrderItem omsOrderItem = omsOrderItemService.selectOmsOrderItemById(id);
        mmap.put("omsOrderItem", omsOrderItem);
        return prefix + "/edit";
    }

    /**
     * 修改保存订单中所包含的商品
     */
    @RequiresPermissions("mall:item:edit")
    @Log(title = "订单中所包含的商品", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(OmsOrderItem omsOrderItem) {
        return toAjax(omsOrderItemService.updateOmsOrderItem(omsOrderItem));
    }

    /**
     * 删除订单中所包含的商品
     */
    @RequiresPermissions("mall:item:remove")
    @Log(title = "订单中所包含的商品", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(omsOrderItemService.deleteOmsOrderItemByIds(ids));
    }
}
