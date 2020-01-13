package com.ruoyi.project.mall.advertise.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.mall.advertise.mapper.SmsHomeAdvertiseMapper;
import com.ruoyi.project.mall.advertise.domain.SmsHomeAdvertise;
import com.ruoyi.project.mall.advertise.service.ISmsHomeAdvertiseService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 首页轮播广告Service业务层处理
 * 
 * @author mallplus
 * @date 2020-01-13
 */
@Service
public class SmsHomeAdvertiseServiceImpl implements ISmsHomeAdvertiseService 
{
    @Autowired
    private SmsHomeAdvertiseMapper smsHomeAdvertiseMapper;

    /**
     * 查询首页轮播广告
     * 
     * @param id 首页轮播广告ID
     * @return 首页轮播广告
     */
    @Override
    public SmsHomeAdvertise selectSmsHomeAdvertiseById(Long id)
    {
        return smsHomeAdvertiseMapper.selectSmsHomeAdvertiseById(id);
    }

    /**
     * 查询首页轮播广告列表
     * 
     * @param smsHomeAdvertise 首页轮播广告
     * @return 首页轮播广告
     */
    @Override
    public List<SmsHomeAdvertise> selectSmsHomeAdvertiseList(SmsHomeAdvertise smsHomeAdvertise)
    {
        return smsHomeAdvertiseMapper.selectSmsHomeAdvertiseList(smsHomeAdvertise);
    }

    /**
     * 新增首页轮播广告
     * 
     * @param smsHomeAdvertise 首页轮播广告
     * @return 结果
     */
    @Override
    public int insertSmsHomeAdvertise(SmsHomeAdvertise smsHomeAdvertise)
    {
        return smsHomeAdvertiseMapper.insertSmsHomeAdvertise(smsHomeAdvertise);
    }

    /**
     * 修改首页轮播广告
     * 
     * @param smsHomeAdvertise 首页轮播广告
     * @return 结果
     */
    @Override
    public int updateSmsHomeAdvertise(SmsHomeAdvertise smsHomeAdvertise)
    {
        return smsHomeAdvertiseMapper.updateSmsHomeAdvertise(smsHomeAdvertise);
    }

    /**
     * 删除首页轮播广告对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSmsHomeAdvertiseByIds(String ids)
    {
        return smsHomeAdvertiseMapper.deleteSmsHomeAdvertiseByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除首页轮播广告信息
     * 
     * @param id 首页轮播广告ID
     * @return 结果
     */
    public int deleteSmsHomeAdvertiseById(Long id)
    {
        return smsHomeAdvertiseMapper.deleteSmsHomeAdvertiseById(id);
    }
}
