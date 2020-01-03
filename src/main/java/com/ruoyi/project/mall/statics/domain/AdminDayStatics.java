package com.ruoyi.project.mall.statics.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;

/**
 * 【请填写功能名称】对象 admin_day_statics
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Data
public class AdminDayStatics extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * 添加商品
     */
    @Excel(name = "添加商品")
    private Integer goodsCount;

    /**
     * 支付订单数
     */
    @Excel(name = "支付订单数")
    private Integer payOrderCount;

    /**
     * 文章数
     */
    @Excel(name = "文章数")
    private Integer articleCount;

    /**
     * 支付金额
     */
    @Excel(name = "支付金额")
    private BigDecimal payAmount;

    /**
     * 添加会员数
     */
    @Excel(name = "添加会员数")
    private Integer memberCount;

    /**
     * 商户
     */
    @Excel(name = "商户")
    private Long storeId;

    /**
     * 没有支付订单数
     */
    @Excel(name = "没有支付订单数")
    private Integer notPayOrderCount;

    /**
     * 没有支付订单金额
     */
    @Excel(name = "没有支付订单金额")
    private BigDecimal notPayAmount;

    /**
     * 商户
     */
    @Excel(name = "商户")
    private String storeName;


}
