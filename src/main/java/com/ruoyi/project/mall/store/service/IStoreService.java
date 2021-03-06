package com.ruoyi.project.mall.store.service;

import com.ruoyi.project.mall.store.domain.Store;

import java.util.List;

/**
 * 店铺Service接口
 *
 * @author mallplus
 * @date 2019-09-17
 */
public interface IStoreService {
    /**
     * 查询店铺
     *
     * @param id 店铺ID
     * @return 店铺
     */
    public Store selectStoreById(Long id);

    /**
     * 查询店铺列表
     *
     * @param store 店铺
     * @return 店铺集合
     */
    public List<Store> selectStoreList(Store store);

    /**
     * 新增店铺
     *
     * @param store 店铺
     * @return 结果
     */
    public int insertStore(Store store);

    /**
     * 修改店铺
     *
     * @param store 店铺
     * @return 结果
     */
    public int updateStore(Store store);

    /**
     * 批量删除店铺
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteStoreByIds(String ids);

    /**
     * 删除店铺信息
     *
     * @param id 店铺ID
     * @return 结果
     */
    public int deleteStoreById(Long id);

    /**
     * 用户状态修改
     *
     * @param user 用户信息
     * @return 结果
     */
    int changeStatus(Store user);
}
