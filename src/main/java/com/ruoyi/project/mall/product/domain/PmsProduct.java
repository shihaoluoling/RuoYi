package com.ruoyi.project.mall.product.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 商品信息对象 pms_product
 *
 * @author mallplus
 * @date 2019-09-17
 */
public class PmsProduct extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long brandId;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long productCategoryId;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long feightTemplateId;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long productAttributeCategoryId;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String pic;

    /**
     * 货号
     */
    @Excel(name = "货号")
    private String productSn;

    /**
     * 删除状态：0->未删除；1->已删除
     */
    @Excel(name = "删除状态：0->未删除；1->已删除")
    private Integer deleteStatus;

    /**
     * 上架状态：0->下架；1->上架
     */
    @Excel(name = "上架状态：0->下架；1->上架")
    private Integer publishStatus;

    /**
     * 新品状态:0->不是新品；1->新品
     */
    @Excel(name = "新品状态:0->不是新品；1->新品")
    private Integer newStatus;

    /**
     * 推荐状态；0->不推荐；1->推荐
     */
    @Excel(name = "推荐状态；0->不推荐；1->推荐")
    private Integer recommandStatus;

    /**
     * 审核状态：0->未审核；1->审核通过
     */
    @Excel(name = "审核状态：0->未审核；1->审核通过")
    private Integer verifyStatus;

    /**
     * 排序
     */
    @Excel(name = "排序")
    private Long sort;

    /**
     * 销量
     */
    @Excel(name = "销量")
    private Long sale;

    /**
     * $column.columnComment
     */
    @Excel(name = "销量")
    private Double price;

    /**
     * 促销价格
     */
    @Excel(name = "促销价格")
    private Double promotionPrice;

    /**
     * 赠送的成长值
     */
    @Excel(name = "赠送的成长值")
    private Long giftGrowth;

    /**
     * 赠送的积分
     */
    @Excel(name = "赠送的积分")
    private Long giftPoint;

    /**
     * 限制使用的积分数
     */
    @Excel(name = "限制使用的积分数")
    private Long usePointLimit;

    /**
     * 副标题
     */
    @Excel(name = "副标题")
    private String subTitle;

    /**
     * 商品描述
     */
    @Excel(name = "商品描述")
    private String description;

    /**
     * 市场价
     */
    @Excel(name = "市场价")
    private Double originalPrice;

    /**
     * 库存
     */
    @Excel(name = "库存")
    private Long stock;

    /**
     * 库存预警值
     */
    @Excel(name = "库存预警值")
    private Long lowStock;

    /**
     * 单位
     */
    @Excel(name = "单位")
    private String unit;

    /**
     * 商品重量，默认为克
     */
    @Excel(name = "商品重量，默认为克")
    private Double weight;

    /**
     * 是否为预告商品：0->不是；1->是
     */
    @Excel(name = "是否为预告商品：0->不是；1->是")
    private Integer previewStatus;

    /**
     * 以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮
     */
    @Excel(name = "以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮")
    private String serviceIds;

    /**
     * $column.columnComment
     */
    @Excel(name = "以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮")
    private String keywords;

    /**
     * $column.columnComment
     */
    @Excel(name = "以逗号分割的产品服务：1->无忧退货；2->快速退款；3->免费包邮")
    private String note;

    /**
     * 画册图片，连产品图片限制为5张，以逗号分割
     */
    @Excel(name = "画册图片，连产品图片限制为5张，以逗号分割")
    private String albumPics;

    /**
     * $column.columnComment
     */
    @Excel(name = "画册图片，连产品图片限制为5张，以逗号分割")
    private String detailTitle;

    /**
     * $column.columnComment
     */
    @Excel(name = "画册图片，连产品图片限制为5张，以逗号分割")
    private String detailDesc;

    /**
     * 产品详情网页内容
     */
    @Excel(name = "产品详情网页内容")
    private String detailHtml;

    /**
     * 移动端网页详情
     */
    @Excel(name = "移动端网页详情")
    private String detailMobileHtml;

    /**
     * 促销开始时间
     */
    @Excel(name = "促销开始时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date promotionStartTime;

    /**
     * 促销结束时间
     */
    @Excel(name = "促销结束时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date promotionEndTime;

    /**
     * 活动限购数量
     */
    @Excel(name = "活动限购数量")
    private Long promotionPerLimit;

    /**
     * 促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购
     */
    @Excel(name = "促销类型：0->没有促销使用原价;1->使用促销价；2->使用会员价；3->使用阶梯价格；4->使用满减价格；5->限时购")
    private Integer promotionType;

    /**
     * 品牌名称
     */
    @Excel(name = "品牌名称")
    private String brandName;

    /**
     * 商品分类名称
     */
    @Excel(name = "商品分类名称")
    private String productCategoryName;

    /**
     * $column.columnComment
     */
    @Excel(name = "商品分类名称")
    private Long supplyId;

    /**
     * $column.columnComment
     */
    @Excel(name = "商品分类名称")
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
    private Long memberId;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private Long hit;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private Long type;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private Long areaId;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private String areaName;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private String schoolName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getProductCategoryId() {
        return productCategoryId;
    }

    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    public Long getFeightTemplateId() {
        return feightTemplateId;
    }

    public void setFeightTemplateId(Long feightTemplateId) {
        this.feightTemplateId = feightTemplateId;
    }

    public Long getProductAttributeCategoryId() {
        return productAttributeCategoryId;
    }

    public void setProductAttributeCategoryId(Long productAttributeCategoryId) {
        this.productAttributeCategoryId = productAttributeCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public String getProductSn() {
        return productSn;
    }

    public void setProductSn(String productSn) {
        this.productSn = productSn;
    }

    public Integer getDeleteStatus() {
        return deleteStatus;
    }

    public void setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
    }

    public Integer getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Integer publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Integer getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Integer newStatus) {
        this.newStatus = newStatus;
    }

    public Integer getRecommandStatus() {
        return recommandStatus;
    }

    public void setRecommandStatus(Integer recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    public Integer getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Integer verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Long getSort() {
        return sort;
    }

    public void setSort(Long sort) {
        this.sort = sort;
    }

    public Long getSale() {
        return sale;
    }

    public void setSale(Long sale) {
        this.sale = sale;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(Double promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Long getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Long giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    public Long getGiftPoint() {
        return giftPoint;
    }

    public void setGiftPoint(Long giftPoint) {
        this.giftPoint = giftPoint;
    }

    public Long getUsePointLimit() {
        return usePointLimit;
    }

    public void setUsePointLimit(Long usePointLimit) {
        this.usePointLimit = usePointLimit;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getOriginalPrice() {
        return originalPrice;
    }

    public void setOriginalPrice(Double originalPrice) {
        this.originalPrice = originalPrice;
    }

    public Long getStock() {
        return stock;
    }

    public void setStock(Long stock) {
        this.stock = stock;
    }

    public Long getLowStock() {
        return lowStock;
    }

    public void setLowStock(Long lowStock) {
        this.lowStock = lowStock;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getPreviewStatus() {
        return previewStatus;
    }

    public void setPreviewStatus(Integer previewStatus) {
        this.previewStatus = previewStatus;
    }

    public String getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds;
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    public String getDetailTitle() {
        return detailTitle;
    }

    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc;
    }

    public String getDetailHtml() {
        return detailHtml;
    }

    public void setDetailHtml(String detailHtml) {
        this.detailHtml = detailHtml;
    }

    public String getDetailMobileHtml() {
        return detailMobileHtml;
    }

    public void setDetailMobileHtml(String detailMobileHtml) {
        this.detailMobileHtml = detailMobileHtml;
    }

    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    public Long getPromotionPerLimit() {
        return promotionPerLimit;
    }

    public void setPromotionPerLimit(Long promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    public Integer getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Integer promotionType) {
        this.promotionType = promotionType;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductCategoryName() {
        return productCategoryName;
    }

    public void setProductCategoryName(String productCategoryName) {
        this.productCategoryName = productCategoryName;
    }

    public Long getSupplyId() {
        return supplyId;
    }

    public void setSupplyId(Long supplyId) {
        this.supplyId = supplyId;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getHit() {
        return hit;
    }

    public void setHit(Long hit) {
        this.hit = hit;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("brandId", getBrandId())
                .append("productCategoryId", getProductCategoryId())
                .append("feightTemplateId", getFeightTemplateId())
                .append("productAttributeCategoryId", getProductAttributeCategoryId())
                .append("name", getName())
                .append("pic", getPic())
                .append("productSn", getProductSn())
                .append("deleteStatus", getDeleteStatus())
                .append("publishStatus", getPublishStatus())
                .append("newStatus", getNewStatus())
                .append("recommandStatus", getRecommandStatus())
                .append("verifyStatus", getVerifyStatus())
                .append("sort", getSort())
                .append("sale", getSale())
                .append("price", getPrice())
                .append("promotionPrice", getPromotionPrice())
                .append("giftGrowth", getGiftGrowth())
                .append("giftPoint", getGiftPoint())
                .append("usePointLimit", getUsePointLimit())
                .append("subTitle", getSubTitle())
                .append("description", getDescription())
                .append("originalPrice", getOriginalPrice())
                .append("stock", getStock())
                .append("lowStock", getLowStock())
                .append("unit", getUnit())
                .append("weight", getWeight())
                .append("previewStatus", getPreviewStatus())
                .append("serviceIds", getServiceIds())
                .append("keywords", getKeywords())
                .append("note", getNote())
                .append("albumPics", getAlbumPics())
                .append("detailTitle", getDetailTitle())
                .append("detailDesc", getDetailDesc())
                .append("detailHtml", getDetailHtml())
                .append("detailMobileHtml", getDetailMobileHtml())
                .append("promotionStartTime", getPromotionStartTime())
                .append("promotionEndTime", getPromotionEndTime())
                .append("promotionPerLimit", getPromotionPerLimit())
                .append("promotionType", getPromotionType())
                .append("brandName", getBrandName())
                .append("productCategoryName", getProductCategoryName())
                .append("supplyId", getSupplyId())
                .append("createTime", getCreateTime())
                .append("schoolId", getSchoolId())
                .append("storeId", getStoreId())
                .append("memberId", getMemberId())
                .append("hit", getHit())
                .append("type", getType())
                .append("areaId", getAreaId())
                .append("areaName", getAreaName())
                .append("schoolName", getSchoolName())
                .toString();
    }
}
