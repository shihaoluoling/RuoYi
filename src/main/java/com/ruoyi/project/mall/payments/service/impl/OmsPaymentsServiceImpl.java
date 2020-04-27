package com.ruoyi.project.mall.payments.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.project.mall.payments.mapper.OmsPaymentsMapper;
import com.ruoyi.project.mall.payments.domain.OmsPayments;
import com.ruoyi.project.mall.payments.service.IOmsPaymentsService;
import com.ruoyi.common.utils.text.Convert;

/**
 * 支付方式Service业务层处理
 * 
 * @author mallplus
 * @date 2020-01-03
 */
@Service
public class OmsPaymentsServiceImpl implements IOmsPaymentsService 
{
    @Autowired
    private OmsPaymentsMapper omsPaymentsMapper;

    /**
     * 查询支付方式
     * 
     * @param id 支付方式ID
     * @return 支付方式
     */
    @Override
    public OmsPayments selectOmsPaymentsById(Integer id)
    {
        return omsPaymentsMapper.selectOmsPaymentsById(id);
    }

    /**
     * 查询支付方式列表
     * 
     * @param omsPayments 支付方式
     * @return 支付方式
     */
    @Override
    public List<OmsPayments> selectOmsPaymentsList(OmsPayments omsPayments)
    {
        return omsPaymentsMapper.selectOmsPaymentsList(omsPayments);
    }

    /**
     * 新增支付方式
     * 
     * @param omsPayments 支付方式
     * @return 结果
     */
    @Override
    public int insertOmsPayments(OmsPayments omsPayments)
    {
        return omsPaymentsMapper.insertOmsPayments(omsPayments);
    }

    /**
     * 修改支付方式
     * 
     * @param omsPayments 支付方式
     * @return 结果
     */
    @Override
    public int updateOmsPayments(OmsPayments omsPayments)
    {
        return omsPaymentsMapper.updateOmsPayments(omsPayments);
    }

    /**
     * 删除支付方式对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteOmsPaymentsByIds(String ids)
    {
        return omsPaymentsMapper.deleteOmsPaymentsByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除支付方式信息
     * 
     * @param id 支付方式ID
     * @return 结果
     */
    public int deleteOmsPaymentsById(Integer id)
    {
        return omsPaymentsMapper.deleteOmsPaymentsById(id);
    }
}
