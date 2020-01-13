package com.ruoyi.project.mall.advertise.service;

import com.ruoyi.project.mall.advertise.domain.SmsHomeAdvertise;
import java.util.List;

/**
 * 首页轮播广告Service接口
 * 
 * @author mallplus
 * @date 2020-01-13
 */
public interface ISmsHomeAdvertiseService 
{
    /**
     * 查询首页轮播广告
     * 
     * @param id 首页轮播广告ID
     * @return 首页轮播广告
     */
    public SmsHomeAdvertise selectSmsHomeAdvertiseById(Long id);

    /**
     * 查询首页轮播广告列表
     * 
     * @param smsHomeAdvertise 首页轮播广告
     * @return 首页轮播广告集合
     */
    public List<SmsHomeAdvertise> selectSmsHomeAdvertiseList(SmsHomeAdvertise smsHomeAdvertise);

    /**
     * 新增首页轮播广告
     * 
     * @param smsHomeAdvertise 首页轮播广告
     * @return 结果
     */
    public int insertSmsHomeAdvertise(SmsHomeAdvertise smsHomeAdvertise);

    /**
     * 修改首页轮播广告
     * 
     * @param smsHomeAdvertise 首页轮播广告
     * @return 结果
     */
    public int updateSmsHomeAdvertise(SmsHomeAdvertise smsHomeAdvertise);

    /**
     * 批量删除首页轮播广告
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteSmsHomeAdvertiseByIds(String ids);

    /**
     * 删除首页轮播广告信息
     * 
     * @param id 首页轮播广告ID
     * @return 结果
     */
    public int deleteSmsHomeAdvertiseById(Long id);

    int changeStatus(SmsHomeAdvertise smsHomeAdvertise);
}
