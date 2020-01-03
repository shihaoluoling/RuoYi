package com.ruoyi.project.mall.payments.domain;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 支付方式对象 oms_payments
 *
 * @author mallplus
 * @date 2020-01-03
 */
@Setter
@Getter
public class OmsPayments extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** null */
    private Integer id;

    /** 支付类型编码 */
    @Excel(name = "支付类型编码")
    private String code;

    /** 支付类型名称 */
    @Excel(name = "支付类型名称")
    private String name;

    /** 是否线上支付 1=线上支付 2=线下支付 */
    @Excel(name = "是否线上支付 1=线上支付 2=线下支付")
    private Integer isOnline;



    /** 排序 */
    @Excel(name = "排序")
    private Integer sort;

    /** 支付方式描述 */
    @Excel(name = "支付方式描述")
    private String memo;

    /** 启用状态 1=启用 2=停用 */
    @Excel(name = "启用状态 1=启用 2=停用")
    private Integer status;


}
