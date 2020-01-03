package com.ruoyi.project.mall.subject.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.mall.subject.domain.CmsSubject;
import com.ruoyi.project.mall.subject.service.ICmsSubjectService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 专题Controller
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Controller
@RequestMapping("/mall/subject")
public class CmsSubjectController extends BaseController {
    private String prefix = "mall/subject";

    @Autowired
    private ICmsSubjectService cmsSubjectService;

    @RequiresPermissions("mall:subject:view")
    @GetMapping()
    public String subject() {
        return prefix + "/subject";
    }

    /**
     * 查询专题列表
     */
    @RequiresPermissions("mall:subject:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(CmsSubject cmsSubject) {
        startPage();
        List<CmsSubject> list = cmsSubjectService.selectCmsSubjectList(cmsSubject);
        return getDataTable(list);
    }

    /**
     * 导出专题列表
     */
    @RequiresPermissions("mall:subject:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(CmsSubject cmsSubject) {
        List<CmsSubject> list = cmsSubjectService.selectCmsSubjectList(cmsSubject);
        ExcelUtil<CmsSubject> util = new ExcelUtil<CmsSubject>(CmsSubject.class);
        return util.exportExcel(list, "subject");
    }

    /**
     * 新增专题
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存专题
     */
    @RequiresPermissions("mall:subject:add")
    @Log(title = "专题", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(CmsSubject cmsSubject) {
        return toAjax(cmsSubjectService.insertCmsSubject(cmsSubject));
    }

    /**
     * 修改专题
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        CmsSubject cmsSubject = cmsSubjectService.selectCmsSubjectById(id);
        mmap.put("cmsSubject", cmsSubject);
        return prefix + "/edit";
    }

    /**
     * 修改保存专题
     */
    @RequiresPermissions("mall:subject:edit")
    @Log(title = "专题", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(CmsSubject cmsSubject) {
        return toAjax(cmsSubjectService.updateCmsSubject(cmsSubject));
    }

    /**
     * 删除专题
     */
    @RequiresPermissions("mall:subject:remove")
    @Log(title = "专题", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(cmsSubjectService.deleteCmsSubjectByIds(ids));
    }
}
