package com.ruoyi.project.mall.item.service.impl;

import com.ruoyi.common.utils.text.Convert;
import com.ruoyi.project.mall.item.domain.OmsOrderItem;
import com.ruoyi.project.mall.item.mapper.OmsOrderItemMapper;
import com.ruoyi.project.mall.item.service.IOmsOrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单中所包含的商品Service业务层处理
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Service
public class OmsOrderItemServiceImpl implements IOmsOrderItemService {
    @Autowired
    private OmsOrderItemMapper omsOrderItemMapper;

    /**
     * 查询订单中所包含的商品
     *
     * @param id 订单中所包含的商品ID
     * @return 订单中所包含的商品
     */
    @Override
    public OmsOrderItem selectOmsOrderItemById(Long id) {
        return omsOrderItemMapper.selectOmsOrderItemById(id);
    }

    /**
     * 查询订单中所包含的商品列表
     *
     * @param omsOrderItem 订单中所包含的商品
     * @return 订单中所包含的商品
     */
    @Override
    public List<OmsOrderItem> selectOmsOrderItemList(OmsOrderItem omsOrderItem) {
        return omsOrderItemMapper.selectOmsOrderItemList(omsOrderItem);
    }

    /**
     * 新增订单中所包含的商品
     *
     * @param omsOrderItem 订单中所包含的商品
     * @return 结果
     */
    @Override
    public int insertOmsOrderItem(OmsOrderItem omsOrderItem) {
        return omsOrderItemMapper.insertOmsOrderItem(omsOrderItem);
    }

    /**
     * 修改订单中所包含的商品
     *
     * @param omsOrderItem 订单中所包含的商品
     * @return 结果
     */
    @Override
    public int updateOmsOrderItem(OmsOrderItem omsOrderItem) {
        return omsOrderItemMapper.updateOmsOrderItem(omsOrderItem);
    }

    /**
     * 删除订单中所包含的商品对象
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOmsOrderItemByIds(String ids) {
        return omsOrderItemMapper.deleteOmsOrderItemByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除订单中所包含的商品信息
     *
     * @param id 订单中所包含的商品ID
     * @return 结果
     */
    public int deleteOmsOrderItemById(Long id) {
        return omsOrderItemMapper.deleteOmsOrderItemById(id);
    }
}
