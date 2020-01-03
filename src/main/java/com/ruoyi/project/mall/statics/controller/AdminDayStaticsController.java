package com.ruoyi.project.mall.statics.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.mall.statics.domain.AdminDayStatics;
import com.ruoyi.project.mall.statics.service.IAdminDayStaticsService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 【请填写功能名称】Controller
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Controller
@RequestMapping("/mall/statics")
public class AdminDayStaticsController extends BaseController {
    private String prefix = "mall/statics";

    @Autowired
    private IAdminDayStaticsService adminDayStaticsService;

    @RequiresPermissions("mall:statics:view")
    @GetMapping()
    public String statics() {
        return prefix + "/statics";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("mall:statics:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(AdminDayStatics adminDayStatics) {
        startPage();
        List<AdminDayStatics> list = adminDayStaticsService.selectAdminDayStaticsList(adminDayStatics);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("mall:statics:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(AdminDayStatics adminDayStatics) {
        List<AdminDayStatics> list = adminDayStaticsService.selectAdminDayStaticsList(adminDayStatics);
        ExcelUtil<AdminDayStatics> util = new ExcelUtil<AdminDayStatics>(AdminDayStatics.class);
        return util.exportExcel(list, "statics");
    }

    /**
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */
    @RequiresPermissions("mall:statics:add")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(AdminDayStatics adminDayStatics) {
        return toAjax(adminDayStaticsService.insertAdminDayStatics(adminDayStatics));
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        AdminDayStatics adminDayStatics = adminDayStaticsService.selectAdminDayStaticsById(id);
        mmap.put("adminDayStatics", adminDayStatics);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("mall:statics:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AdminDayStatics adminDayStatics) {
        return toAjax(adminDayStaticsService.updateAdminDayStatics(adminDayStatics));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("mall:statics:remove")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(adminDayStaticsService.deleteAdminDayStaticsByIds(ids));
    }
}
