package com.ruoyi.project.mall.set.mapper;


import com.ruoyi.project.mall.set.domain.AppletSet;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author mallplus
 * @date 2020-01-03
 */
public interface AppletSetMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param storeId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public AppletSet selectAppletSetById(Long storeId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param appletSet 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<AppletSet> selectAppletSetList(AppletSet appletSet);

    /**
     * 新增【请填写功能名称】
     *
     * @param appletSet 【请填写功能名称】
     * @return 结果
     */
    public int insertAppletSet(AppletSet appletSet);

    /**
     * 修改【请填写功能名称】
     *
     * @param appletSet 【请填写功能名称】
     * @return 结果
     */
    public int updateAppletSet(AppletSet appletSet);

    /**
     * 删除【请填写功能名称】
     *
     * @param storeId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteAppletSetById(Long storeId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param storeIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteAppletSetByIds(String[] storeIds);
}
