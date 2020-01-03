package com.ruoyi.project.mall.member.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.mall.member.domain.UmsMember;
import com.ruoyi.project.mall.member.service.IUmsMemberService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 会员Controller
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Controller
@RequestMapping("/mall/member")
public class UmsMemberController extends BaseController {
    private String prefix = "mall/member";

    @Autowired
    private IUmsMemberService umsMemberService;

    @RequiresPermissions("mall:member:view")
    @GetMapping()
    public String member() {
        return prefix + "/member";
    }

    /**
     * 查询会员列表
     */
    @RequiresPermissions("mall:member:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(UmsMember umsMember) {
        startPage();
        List<UmsMember> list = umsMemberService.selectUmsMemberList(umsMember);
        return getDataTable(list);
    }

    /**
     * 导出会员列表
     */
    @RequiresPermissions("mall:member:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(UmsMember umsMember) {
        List<UmsMember> list = umsMemberService.selectUmsMemberList(umsMember);
        ExcelUtil<UmsMember> util = new ExcelUtil<UmsMember>(UmsMember.class);
        return util.exportExcel(list, "member");
    }

    /**
     * 新增会员
     */
    @GetMapping("/add")
    public String add() {
        return prefix + "/add";
    }

    /**
     * 新增保存会员
     */
    @RequiresPermissions("mall:member:add")
    @Log(title = "会员", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(UmsMember umsMember) {
        return toAjax(umsMemberService.insertUmsMember(umsMember));
    }

    /**
     * 修改会员
     */
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap) {
        UmsMember umsMember = umsMemberService.selectUmsMemberById(id);
        mmap.put("umsMember", umsMember);
        return prefix + "/edit";
    }

    /**
     * 修改保存会员
     */
    @RequiresPermissions("mall:member:edit")
    @Log(title = "会员", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(UmsMember umsMember) {
        return toAjax(umsMemberService.updateUmsMember(umsMember));
    }

    /**
     * 删除会员
     */
    @RequiresPermissions("mall:member:remove")
    @Log(title = "会员", businessType = BusinessType.DELETE)
    @PostMapping("/remove")
    @ResponseBody
    public AjaxResult remove(String ids) {
        return toAjax(umsMemberService.deleteUmsMemberByIds(ids));
    }
}
