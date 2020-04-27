package com.ruoyi.project.mall.store.service.impl;

import com.ruoyi.common.utils.DateUtils;
import com.ruoyi.common.utils.text.Convert;
import com.ruoyi.project.mall.store.domain.Store;
import com.ruoyi.project.mall.store.mapper.StoreMapper;
import com.ruoyi.project.mall.store.service.IStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 店铺Service业务层处理
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Service
public class StoreServiceImpl implements IStoreService {
    @Autowired
    private StoreMapper storeMapper;

    /**
     * 查询店铺
     *
     * @param id 店铺ID
     * @return 店铺
     */
    @Override
    public Store selectStoreById(Long id) {
        return storeMapper.selectStoreById(id);
    }

    /**
     * 查询店铺列表
     *
     * @param store 店铺
     * @return 店铺
     */
    @Override
    public List<Store> selectStoreList(Store store) {
        return storeMapper.selectStoreList(store);
    }

    /**
     * 新增店铺
     *
     * @param store 店铺
     * @return 结果
     */
    @Override
    public int insertStore(Store store) {
        store.setCreateTime(DateUtils.getNowDate());
        return storeMapper.insertStore(store);
    }

    /**
     * 修改店铺
     *
     * @param store 店铺
     * @return 结果
     */
    @Override
    public int updateStore(Store store) {
        store.setUpdateTime(DateUtils.getNowDate());
        return storeMapper.updateStore(store);
    }

    /**
     * 删除店铺对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteStoreByIds(String ids) {
        return storeMapper.deleteStoreByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除店铺信息
     *
     * @param id 店铺ID
     * @return 结果
     */
    public int deleteStoreById(Long id) {
        return storeMapper.deleteStoreById(id);
    }

    /**
     * 用户状态修改
     *
     * @param user 用户信息
     * @return 结果
     */
    @Override
    public int changeStatus(Store user) {
        return storeMapper.updateStore(user);
    }
}
