package com.ruoyi.project.mall.item.service;

import com.ruoyi.project.mall.item.domain.OmsOrderItem;

import java.util.List;

/**
 * 订单中所包含的商品Service接口
 *
 * @author mallplus
 * @date 2019-09-17
 */
public interface IOmsOrderItemService {
    /**
     * 查询订单中所包含的商品
     *
     * @param id 订单中所包含的商品ID
     * @return 订单中所包含的商品
     */
    public OmsOrderItem selectOmsOrderItemById(Long id);

    /**
     * 查询订单中所包含的商品列表
     *
     * @param omsOrderItem 订单中所包含的商品
     * @return 订单中所包含的商品集合
     */
    public List<OmsOrderItem> selectOmsOrderItemList(OmsOrderItem omsOrderItem);

    /**
     * 新增订单中所包含的商品
     *
     * @param omsOrderItem 订单中所包含的商品
     * @return 结果
     */
    public int insertOmsOrderItem(OmsOrderItem omsOrderItem);

    /**
     * 修改订单中所包含的商品
     *
     * @param omsOrderItem 订单中所包含的商品
     * @return 结果
     */
    public int updateOmsOrderItem(OmsOrderItem omsOrderItem);

    /**
     * 批量删除订单中所包含的商品
     *
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOmsOrderItemByIds(String ids);

    /**
     * 删除订单中所包含的商品信息
     *
     * @param id 订单中所包含的商品ID
     * @return 结果
     */
    public int deleteOmsOrderItemById(Long id);
}
