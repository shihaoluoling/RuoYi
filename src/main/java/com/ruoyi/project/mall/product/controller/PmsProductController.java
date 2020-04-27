package com.ruoyi.project.mall.product.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.mall.product.domain.PmsProduct;
import com.ruoyi.project.mall.product.service.IPmsProductService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 商品信息Controller
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Controller
@RequestMapping("/mall/product")
public class PmsProductController extends BaseController {
    private String prefix = "mall/product";

    @Autowired
    private IPmsProductService pmsProductService;

    @RequiresPermissions("mall:product:view")
    @GetMapping()
    public String product() {
        return prefix + "/product";
    }

    /**
     * 查询商品信息列表
     */
    @RequiresPermissions("mall:product:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(PmsProduct pmsProduct) {
        startPage();
        List<PmsProduct> list = pmsProductService.selectPmsProductList(pmsProduct);
        return getDataTable(list);
    }

    /**
     * 导出商品信息列表
     */
    @RequiresPermissions("mall:product:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(PmsProduct pmsProduct) {
        List<PmsProduct> list = pmsProductService.selectPmsProductList(pmsProduct);
        ExcelUtil<PmsProduct> util = new ExcelUtil<PmsProduct>(PmsProduct.class);
        return util.exportExcel(list, "product");
    }

    /**
     * 新增商品信息
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存商品信息
     */
    @RequiresPermissions("mall:product:add")
    @Log(title = "商品信息", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(PmsProduct pmsProduct) {
        return toAjax(pmsProductService.insertPmsProduct(pmsProduct));
    }

    /**
     * 修改商品信息
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        PmsProduct pmsProduct = pmsProductService.selectPmsProductById(id);
        mmap.put("pmsProduct", pmsProduct);
        return prefix + "/edit";
    }

    /**
     * 修改保存商品信息
     */
    @RequiresPermissions("mall:product:edit")
    @Log(title = "商品信息", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(PmsProduct pmsProduct) {
        return toAjax(pmsProductService.updatePmsProduct(pmsProduct));
    }

    /**
     * 删除商品信息
     */
    @RequiresPermissions("mall:product:remove")
    @Log(title = "商品信息", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(pmsProductService.deletePmsProductByIds(ids));
    }
}
