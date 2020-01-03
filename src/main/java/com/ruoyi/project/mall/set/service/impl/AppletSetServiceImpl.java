package com.ruoyi.project.mall.set.service.impl;

import java.util.List;

import com.ruoyi.project.mall.set.domain.AppletSet;
import com.ruoyi.project.mall.set.mapper.AppletSetMapper;
import com.ruoyi.project.mall.set.service.IAppletSetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ruoyi.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author mallplus
 * @date 2020-01-03
 */
@Service
public class AppletSetServiceImpl implements IAppletSetService
{
    @Autowired
    private AppletSetMapper appletSetMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param storeId 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public AppletSet selectAppletSetById(Long storeId)
    {
        return appletSetMapper.selectAppletSetById(storeId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param appletSet 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<AppletSet> selectAppletSetList(AppletSet appletSet)
    {
        return appletSetMapper.selectAppletSetList(appletSet);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param appletSet 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertAppletSet(AppletSet appletSet)
    {
        return appletSetMapper.insertAppletSet(appletSet);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param appletSet 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateAppletSet(AppletSet appletSet)
    {
        return appletSetMapper.updateAppletSet(appletSet);
    }

    /**
     * 删除【请填写功能名称】对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteAppletSetByIds(String ids)
    {
        return appletSetMapper.deleteAppletSetByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param storeId 【请填写功能名称】ID
     * @return 结果
     */
    public int deleteAppletSetById(Long storeId)
    {
        return appletSetMapper.deleteAppletSetById(storeId);
    }
}
