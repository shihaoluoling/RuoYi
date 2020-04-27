package com.ruoyi.project.mall.statics.mapper;

import com.ruoyi.project.mall.statics.domain.AdminDayStatics;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author mallplus
 * @date 2019-09-17
 */
public interface AdminDayStaticsMapper {
    /**
     * 查询【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public AdminDayStatics selectAdminDayStaticsById(Long id);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param adminDayStatics 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<AdminDayStatics> selectAdminDayStaticsList(AdminDayStatics adminDayStatics);

    /**
     * 新增【请填写功能名称】
     *
     * @param adminDayStatics 【请填写功能名称】
     * @return 结果
     */
    public int insertAdminDayStatics(AdminDayStatics adminDayStatics);

    /**
     * 修改【请填写功能名称】
     *
     * @param adminDayStatics 【请填写功能名称】
     * @return 结果
     */
    public int updateAdminDayStatics(AdminDayStatics adminDayStatics);

    /**
     * 删除【请填写功能名称】
     *
     * @param id 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteAdminDayStaticsById(Long id);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteAdminDayStaticsByIds(String[] ids);

    void deleteAdminDayStaticsByDate(String createTime);

    List<AdminDayStatics> selectAdminDayStaticsGroupBySId();
}
