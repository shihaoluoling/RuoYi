package com.ruoyi.project.mall.store.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.mall.store.domain.Store;
import com.ruoyi.project.mall.store.service.IStoreService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 店铺Controller
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Controller
@RequestMapping("/mall/store")
public class StoreController extends BaseController {
    private String prefix = "mall/store";

    @Autowired
    private IStoreService storeService;

    @RequiresPermissions("mall:store:view")
    @GetMapping()
    public String store() {
        return prefix + "/store";
    }

    /**
     * 查询店铺列表
     */
    @RequiresPermissions("mall:store:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Store store) {
        startPage();
        List<Store> list = storeService.selectStoreList(store);
        return getDataTable(list);
    }


    /**
     * 导出店铺列表
     */
    @RequiresPermissions("mall:store:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Store store) {
        List<Store> list = storeService.selectStoreList(store);
        ExcelUtil<Store> util = new ExcelUtil<Store>(Store.class);
        return util.exportExcel(list, "store");
    }

    /**
     * 新增店铺
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存店铺
     */
    @RequiresPermissions("mall:store:add")
    @Log(title = "店铺", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Store store) {
        return toAjax(storeService.insertStore(store));
    }

    /**
     * 修改店铺
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        Store store = storeService.selectStoreById(id);
        mmap.put("store", store);
        return prefix + "/edit";
    }

    /**
     * 修改保存店铺
     */
    @RequiresPermissions("mall:store:edit")
    @Log(title = "店铺", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Store store) {
        return toAjax(storeService.updateStore(store));
    }

    /**
     * 删除店铺
     */
    @RequiresPermissions("mall:store:remove")
    @Log(title = "店铺", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(storeService.deleteStoreByIds(ids));
    }

    /**
     * 商户状态修改
     */
    @Log(title = "用户管理", businessType = BusinessType.UPDATE)
    @RequiresPermissions("mall:store:edit")
    @PostMapping("/changeStatus")
    @ResponseBody
    public AjaxResult changeStatus(Store user) {
        return toAjax(storeService.changeStatus(user));
    }
}
