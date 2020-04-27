package com.ruoyi.project.mall.payments.service;

import com.ruoyi.project.mall.payments.domain.OmsPayments;
import java.util.List;

/**
 * 支付方式Service接口
 * 
 * @author mallplus
 * @date 2020-01-03
 */
public interface IOmsPaymentsService 
{
    /**
     * 查询支付方式
     * 
     * @param id 支付方式ID
     * @return 支付方式
     */
    public OmsPayments selectOmsPaymentsById(Integer id);

    /**
     * 查询支付方式列表
     * 
     * @param omsPayments 支付方式
     * @return 支付方式集合
     */
    public List<OmsPayments> selectOmsPaymentsList(OmsPayments omsPayments);

    /**
     * 新增支付方式
     * 
     * @param omsPayments 支付方式
     * @return 结果
     */
    public int insertOmsPayments(OmsPayments omsPayments);

    /**
     * 修改支付方式
     * 
     * @param omsPayments 支付方式
     * @return 结果
     */
    public int updateOmsPayments(OmsPayments omsPayments);

    /**
     * 批量删除支付方式
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteOmsPaymentsByIds(String ids);

    /**
     * 删除支付方式信息
     * 
     * @param id 支付方式ID
     * @return 结果
     */
    public int deleteOmsPaymentsById(Integer id);
}
