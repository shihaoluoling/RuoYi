package com.ruoyi.project.mall.item.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 订单中所包含的商品对象 oms_order_item
 *
 * @author mallplus
 * @date 2019-09-17
 */
public class OmsOrderItem extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * 订单id
     */
    @Excel(name = "订单id")
    private Long orderId;

    /**
     * 订单编号
     */
    @Excel(name = "订单编号")
    private String orderSn;

    /**
     * $column.columnComment
     */
    @Excel(name = "订单编号")
    private Long productId;

    /**
     * $column.columnComment
     */
    @Excel(name = "订单编号")
    private String productPic;

    /**
     * $column.columnComment
     */
    @Excel(name = "订单编号")
    private String productName;

    /**
     * $column.columnComment
     */
    @Excel(name = "订单编号")
    private String productBrand;

    /**
     * $column.columnComment
     */
    @Excel(name = "订单编号")
    private String productSn;

    /**
     * 销售价格
     */
    @Excel(name = "销售价格")
    private Double productPrice;

    /**
     * 购买数量
     */
    @Excel(name = "购买数量")
    private Long productQuantity;

    /**
     * 商品sku编号
     */
    @Excel(name = "商品sku编号")
    private Long productSkuId;

    /**
     * 商品sku条码
     */
    @Excel(name = "商品sku条码")
    private String productSkuCode;

    /**
     * 商品分类id
     */
    @Excel(name = "商品分类id")
    private Long productCategoryId;

    /**
     * 商品的销售属性
     */
    @Excel(name = "商品的销售属性")
    private String sp1;

    /**
     * $column.columnComment
     */
    @Excel(name = "商品的销售属性")
    private String sp2;

    /**
     * $column.columnComment
     */
    @Excel(name = "商品的销售属性")
    private String sp3;

    /**
     * 商品促销名称
     */
    @Excel(name = "商品促销名称")
    private String promotionName;

    /**
     * 商品促销分解金额
     */
    @Excel(name = "商品促销分解金额")
    private Double promotionAmount;

    /**
     * 优惠券优惠分解金额
     */
    @Excel(name = "优惠券优惠分解金额")
    private Double couponAmount;

    /**
     * 积分优惠分解金额
     */
    @Excel(name = "积分优惠分解金额")
    private Double integrationAmount;

    /**
     * 该商品经过优惠后的分解金额
     */
    @Excel(name = "该商品经过优惠后的分解金额")
    private Double realAmount;

    /**
     * $column.columnComment
     */
    @Excel(name = "该商品经过优惠后的分解金额")
    private Long giftIntegration;

    /**
     * $column.columnComment
     */
    @Excel(name = "该商品经过优惠后的分解金额")
    private Long giftGrowth;

    /**
     * 商品销售属性:[{"key":"颜色","value":"颜色"},{"key":"容量","value":"4G"}]
     */
    @Excel(name = "商品销售属性")
    private String productAttr;

    /**
     * 所属店铺
     */
    @Excel(name = "所属店铺")
    private Long storeId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductPic() {
        return productPic;
    }

    public void setProductPic(String productPic) {
        this.productPic = productPic;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    public Long getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Long productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Long getProductSkuId() {
        return productSkuId;
    }

    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    public String getProductSkuCode() {
        return productSkuCode;
    }

    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public String getSp1() {
        return sp1;
    }

    public void setSp1(String sp1) {
        this.sp1 = sp1;
    }

    public String getSp2() {
        return sp2;
    }

    public void setSp2(String sp2) {
        this.sp2 = sp2;
    }

    public String getSp3() {
        return sp3;
    }

    public void setSp3(String sp3) {
        this.sp3 = sp3;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName;
    }

    public Double getPromotionAmount() {
        return promotionAmount;
    }

    public void setPromotionAmount(Double promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    public Double getCouponAmount() {
        return couponAmount;
    }

    public void setCouponAmount(Double couponAmount) {
        this.couponAmount = couponAmount;
    }

    public Double getIntegrationAmount() {
        return integrationAmount;
    }

    public void setIntegrationAmount(Double integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    public Double getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Double realAmount) {
        this.realAmount = realAmount;
    }

    public Long getGiftIntegration() {
        return giftIntegration;
    }

    public void setGiftIntegration(Long giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    public Long getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Long giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    public String getProductAttr() {
        return productAttr;
    }

    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("orderId", getOrderId())
                .append("orderSn", getOrderSn())
                .append("productId", getProductId())
                .append("productPic", getProductPic())
                .append("productName", getProductName())
                .append("productBrand", getProductBrand())
                .append("productSn", getProductSn())
                .append("productPrice", getProductPrice())
                .append("productQuantity", getProductQuantity())
                .append("productSkuId", getProductSkuId())
                .append("productSkuCode", getProductSkuCode())
                .append("productCategoryId", getProductCategoryId())
                .append("sp1", getSp1())
                .append("sp2", getSp2())
                .append("sp3", getSp3())
                .append("promotionName", getPromotionName())
                .append("promotionAmount", getPromotionAmount())
                .append("couponAmount", getCouponAmount())
                .append("integrationAmount", getIntegrationAmount())
                .append("realAmount", getRealAmount())
                .append("giftIntegration", getGiftIntegration())
                .append("giftGrowth", getGiftGrowth())
                .append("productAttr", getProductAttr())
                .append("storeId", getStoreId())
                .toString();
    }
}
