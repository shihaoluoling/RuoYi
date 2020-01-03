package com.ruoyi.project.mall.statics.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.text.Convert;
import com.ruoyi.project.mall.statics.domain.AdminDayStatics;
import com.ruoyi.project.mall.statics.mapper.AdminDayStaticsMapper;
import com.ruoyi.project.mall.statics.service.IAdminDayStaticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Service
public class AdminDayStaticsServiceImpl implements IAdminDayStaticsService {
    @Autowired
    private AdminDayStaticsMapper adminDayStaticsMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public AdminDayStatics selectAdminDayStaticsById(Long id) {
        return adminDayStaticsMapper.selectAdminDayStaticsById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param adminDayStatics 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<AdminDayStatics> selectAdminDayStaticsList(AdminDayStatics adminDayStatics) {
        return adminDayStaticsMapper.selectAdminDayStaticsList(adminDayStatics);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param adminDayStatics 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAdminDayStatics(AdminDayStatics adminDayStatics) {
        adminDayStatics.setCreateTime(DateUtils.getNowDate());
        return adminDayStaticsMapper.insertAdminDayStatics(adminDayStatics);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param adminDayStatics 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAdminDayStatics(AdminDayStatics adminDayStatics) {
        adminDayStatics.setUpdateTime(DateUtils.getNowDate());
        return adminDayStaticsMapper.updateAdminDayStatics(adminDayStatics);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAdminDayStaticsByIds(String ids) {
        return adminDayStaticsMapper.deleteAdminDayStaticsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteAdminDayStaticsById(Long id) {
        return adminDayStaticsMapper.deleteAdminDayStaticsById(id);
    }

    @Override
    public  void deleteAdminDayStaticsByDate(String parseDateToStr){
         adminDayStaticsMapper.deleteAdminDayStaticsByDate(parseDateToStr);
    }

    @Override
    public List<AdminDayStatics> selectAdminDayStaticsGroupBySId() {
        return adminDayStaticsMapper.selectAdminDayStaticsGroupBySId();
    }
}
