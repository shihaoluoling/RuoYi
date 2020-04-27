package com.ruoyi.project.mall.order.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 订单对象 oms_order
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Data
public class OmsOrder extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 订单id
     */
    private Long id;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long memberId;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long couponId;

    /**
     * 订单编号
     */
    @Excel(name = "订单编号")
    private String orderSn;

    /**
     * 用户帐号
     */
    @Excel(name = "用户帐号")
    private String memberUsername;

    /**
     * 订单总金额
     */
    @Excel(name = "订单总金额")
    private BigDecimal totalAmount;

    /**
     * 应付金额（实际支付金额）
     */
    @Excel(name = "应付金额", readConverterExp = "实=际支付金额")
    private BigDecimal payAmount;

    /**
     * 运费金额
     */
    @Excel(name = "运费金额")
    private BigDecimal freightAmount;

    /**
     * 促销优化金额（促销价、满减、阶梯价）
     */
    @Excel(name = "促销优化金额", readConverterExp = "促=销价、满减、阶梯价")
    private BigDecimal promotionAmount;

    /**
     * 积分抵扣金额
     */
    @Excel(name = "积分抵扣金额")
    private BigDecimal integrationAmount;

    /**
     * 优惠券抵扣金额
     */
    @Excel(name = "优惠券抵扣金额")
    private BigDecimal couponAmount;

    /**
     * 管理员后台调整订单使用的折扣金额
     */
    @Excel(name = "管理员后台调整订单使用的折扣金额")
    private BigDecimal discountAmount;

    /**
     * 支付方式：0->未支付；1->支付宝；2->微信
     */
    @Excel(name = "支付方式：0->未支付；1->支付宝；2->微信")
    private Integer payType;

    /**
     * 订单来源：0->PC订单；1->app订单
     */
    @Excel(name = "订单来源：0->PC订单；1->app订单")
    private Integer sourceType;

    /**
     * 订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单
     */
    @Excel(name = "订单状态：0->待付款；1->待发货；2->已发货；3->已完成；4->已关闭；5->无效订单")
    private Integer status;

    /**
     * 订单类型：0->正常订单；1->秒杀订单
     */
    @Excel(name = "订单类型：0->正常订单；1->秒杀订单")
    private Integer orderType;

    /**
     * 物流公司(配送方式)
     */
    @Excel(name = "物流公司(配送方式)")
    private String deliveryCompany;

    /**
     * 物流单号
     */
    @Excel(name = "物流单号")
    private String deliverySn;

    /**
     * 自动确认时间（天）
     */
    @Excel(name = "自动确认时间", readConverterExp = "天=")
    private Long autoConfirmDay;

    /**
     * 可以获得的积分
     */
    @Excel(name = "可以获得的积分")
    private Long integration;

    /**
     * 可以活动的成长值
     */
    @Excel(name = "可以活动的成长值")
    private Long growth;

    /**
     * 活动信息
     */
    @Excel(name = "活动信息")
    private String promotionInfo;

    /**
     * 发票类型：0->不开发票；1->电子发票；2->纸质发票
     */
    @Excel(name = "发票类型：0->不开发票；1->电子发票；2->纸质发票")
    private Integer billType;

    /**
     * 发票抬头
     */
    @Excel(name = "发票抬头")
    private String billHeader;

    /**
     * 发票内容
     */
    @Excel(name = "发票内容")
    private String billContent;

    /**
     * 收票人电话
     */
    @Excel(name = "收票人电话")
    private String billReceiverPhone;

    /**
     * 收票人邮箱
     */
    @Excel(name = "收票人邮箱")
    private String billReceiverEmail;

    /**
     * 收货人姓名
     */
    @Excel(name = "收货人姓名")
    private String receiverName;

    /**
     * 收货人电话
     */
    @Excel(name = "收货人电话")
    private String receiverPhone;

    /**
     * 收货人邮编
     */
    @Excel(name = "收货人邮编")
    private String receiverPostCode;

    /**
     * 省份/直辖市
     */
    @Excel(name = "省份/直辖市")
    private String receiverProvince;

    /**
     * 城市
     */
    @Excel(name = "城市")
    private String receiverCity;

    /**
     * 区
     */
    @Excel(name = "区")
    private String receiverRegion;

    /**
     * 详细地址
     */
    @Excel(name = "详细地址")
    private String receiverDetailAddress;

    /**
     * 订单备注
     */
    @Excel(name = "订单备注")
    private String note;

    /**
     * 确认收货状态：0->未确认；1->已确认
     */
    @Excel(name = "确认收货状态：0->未确认；1->已确认")
    private Integer confirmStatus;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    @Excel(name = "删除状态：0->未删除；1->已删除")
    private Integer deleteStatus;

    /**
     * 下单时使用的积分
     */
    @Excel(name = "下单时使用的积分")
    private Long useIntegration;

    /**
     * 支付时间
     */
    @Excel(name = "支付时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date paymentTime;

    /**
     * 发货时间
     */
    @Excel(name = "发货时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deliveryTime;

    /**
     * 确认收货时间
     */
    @Excel(name = "确认收货时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date receiveTime;

    /**
     * 评价时间
     */
    @Excel(name = "评价时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date commentTime;

    /**
     * 修改时间
     */
    @Excel(name = "修改时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date modifyTime;

    /**
     * $column.columnComment
     */
    @Excel(name = "修改时间")
    private String prepayId;

    /**
     * $column.columnComment
     */
    @Excel(name = "修改时间")
    private Long supplyId;

    /**
     * $column.columnComment
     */
    @Excel(name = "修改时间")
    private Long goodsId;

    /**
     * $column.columnComment
     */
    @Excel(name = "修改时间")
    private String goodsName;

    /**
     * $column.columnComment
     */
    @Excel(name = "修改时间")
    private Long schoolId;

    /**
     * 所属店铺
     */
    @Excel(name = "所属店铺")
    private Long storeId;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private Long receiverId;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private Long groupId;

    /**
     * 是否开发票 1=不发票 2=个人发票 3=公司发票
     */
    @Excel(name = "是否开发票 1=不发票 2=个人发票 3=公司发票")
    private Integer taxType;

    /**
     * 发票内容
     */
    @Excel(name = "发票内容")
    private String taxContent;

    /**
     * 税号
     */
    @Excel(name = "税号")
    private String taxCode;

    /**
     * 发票抬头
     */
    @Excel(name = "发票抬头")
    private String taxTitle;

    /**
     * 是否评论，1未评论，2已评论
     */
    @Excel(name = "是否评论，1未评论，2已评论")
    private Integer isComment;


}
