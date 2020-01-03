package com.ruoyi.project.mall.set.controller;

import java.util.List;

import com.ruoyi.project.mall.set.domain.AppletSet;
import com.ruoyi.project.mall.set.service.IAppletSetService;
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

import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author mallplus
 * @date 2020-01-03
 */
@Controller
@RequestMapping("/mall/set")
public class AppletSetController extends BaseController
{
    private String prefix = "mall/set";

    @Autowired
    private IAppletSetService appletSetService;

    @RequiresPermissions("mall:set:view")
    @GetMapping()
    public String set(ModelMap mmap)
    {
        AppletSet appletSet = appletSetService.selectAppletSetById(1L);
        mmap.put("appletSet", appletSet);
        return prefix + "/edit";

    }


    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("mall:set:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(AppletSet appletSet)
    {
        appletSet.setStoreId(1L);
        return toAjax(appletSetService.updateAppletSet(appletSet));
    }


}
