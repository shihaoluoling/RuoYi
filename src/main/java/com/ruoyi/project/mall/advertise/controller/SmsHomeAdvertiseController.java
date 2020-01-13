package com.ruoyi.project.mall.advertise.controller;

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
import com.ruoyi.project.mall.advertise.domain.SmsHomeAdvertise;
import com.ruoyi.project.mall.advertise.service.ISmsHomeAdvertiseService;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 首页轮播广告Controller
 *
 * @author mallplus
 * @date 2020-01-13
 */
@Controller
@RequestMapping("/mall/advertise")
public class SmsHomeAdvertiseController extends BaseController
{
    private String prefix = "mall/advertise";

    @Autowired
    private ISmsHomeAdvertiseService smsHomeAdvertiseService;

    @RequiresPermissions("mall:advertise:view")
    @GetMapping()
    public String advertise()
    {
        return prefix + "/advertise";
    }

    /**
     * 查询首页轮播广告列表
     */
    @RequiresPermissions("mall:advertise:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SmsHomeAdvertise smsHomeAdvertise)
    {
        startPage();
        List<SmsHomeAdvertise> list = smsHomeAdvertiseService.selectSmsHomeAdvertiseList(smsHomeAdvertise);
        return getDataTable(list);
    }

    /**
     * 导出首页轮播广告列表
     */
    @RequiresPermissions("mall:advertise:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SmsHomeAdvertise smsHomeAdvertise)
    {
        List<SmsHomeAdvertise> list = smsHomeAdvertiseService.selectSmsHomeAdvertiseList(smsHomeAdvertise);
        ExcelUtil<SmsHomeAdvertise> util = new ExcelUtil<SmsHomeAdvertise>(SmsHomeAdvertise.class);
        return util.exportExcel(list, "advertise");
    }

    /**
     * 新增首页轮播广告
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存首页轮播广告
     */
    @RequiresPermissions("mall:advertise:add")
    @Log(title = "首页轮播广告", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SmsHomeAdvertise smsHomeAdvertise)
    {
        return toAjax(smsHomeAdvertiseService.insertSmsHomeAdvertise(smsHomeAdvertise));
    }

    /**
     * 修改首页轮播广告
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        SmsHomeAdvertise smsHomeAdvertise = smsHomeAdvertiseService.selectSmsHomeAdvertiseById(id);
        mmap.put("smsHomeAdvertise", smsHomeAdvertise);
        return prefix + "/edit";
    }

    /**
     * 修改保存首页轮播广告
     */
    @RequiresPermissions("mall:advertise:edit")
    @Log(title = "首页轮播广告", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SmsHomeAdvertise smsHomeAdvertise)
    {
        return toAjax(smsHomeAdvertiseService.updateSmsHomeAdvertise(smsHomeAdvertise));
    }

    /**
     * 删除首页轮播广告
     */
    @RequiresPermissions("mall:advertise:remove")
    @Log(title = "首页轮播广告", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(smsHomeAdvertiseService.deleteSmsHomeAdvertiseByIds(ids));
    }


}
