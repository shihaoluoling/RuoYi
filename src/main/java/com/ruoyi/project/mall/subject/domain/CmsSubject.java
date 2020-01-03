package com.ruoyi.project.mall.subject.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * 专题对象 cms_subject
 *
 * @author mallplus
 * @date 2019-09-17
 */
public class CmsSubject extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * 分类
     */
    @Excel(name = "分类")
    private Long categoryId;

    /**
     * 标题
     */
    @Excel(name = "标题")
    private String title;

    /**
     * 专题主图
     */
    @Excel(name = "专题主图")
    private String pic;

    /**
     * 关联产品数量
     */
    @Excel(name = "关联产品数量")
    private Long productCount;

    /**
     * 推荐
     */
    @Excel(name = "推荐")
    private Integer recommendStatus;

    /**
     * 收藏量
     */
    @Excel(name = "收藏量")
    private Long collectCount;

    /**
     * 点击量
     */
    @Excel(name = "点击量")
    private Long readCount;

    /**
     * 评论量
     */
    @Excel(name = "评论量")
    private Long commentCount;

    /**
     * 画册图片用逗号分割
     */
    @Excel(name = "画册图片用逗号分割")
    private String albumPics;

    /**
     * 描述
     */
    @Excel(name = "描述")
    private String description;

    /**
     * 显示状态：0->不显示；1->显示
     */
    @Excel(name = "显示状态：0->不显示；1->显示")
    private Integer showStatus;

    /**
     * 内容
     */
    @Excel(name = "内容")
    private String content;

    /**
     * 转发数
     */
    @Excel(name = "转发数")
    private Long forwardCount;

    /**
     * 专题分类名称
     */
    @Excel(name = "专题分类名称")
    private String categoryName;

    /**
     * $column.columnComment
     */
    @Excel(name = "专题分类名称")
    private Long areaId;

    /**
     * $column.columnComment
     */
    @Excel(name = "专题分类名称")
    private Long schoolId;

    /**
     * $column.columnComment
     */
    @Excel(name = "专题分类名称")
    private Long memberId;

    /**
     * 打赏
     */
    @Excel(name = "打赏")
    private Long reward;

    /**
     * 所属店铺
     */
    @Excel(name = "所属店铺")
    private Long storeId;

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

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private String memberName;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private String videoSrc;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private Long type;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Long getProductCount() {
        return productCount;
    }

    public void setProductCount(Long productCount) {
        this.productCount = productCount;
    }

    public Integer getRecommendStatus() {
        return recommendStatus;
    }

    public void setRecommendStatus(Integer recommendStatus) {
        this.recommendStatus = recommendStatus;
    }

    public Long getCollectCount() {
        return collectCount;
    }

    public void setCollectCount(Long collectCount) {
        this.collectCount = collectCount;
    }

    public Long getReadCount() {
        return readCount;
    }

    public void setReadCount(Long readCount) {
        this.readCount = readCount;
    }

    public Long getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Long commentCount) {
        this.commentCount = commentCount;
    }

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getShowStatus() {
        return showStatus;
    }

    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getForwardCount() {
        return forwardCount;
    }

    public void setForwardCount(Long forwardCount) {
        this.forwardCount = forwardCount;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public Long getReward() {
        return reward;
    }

    public void setReward(Long reward) {
        this.reward = reward;
    }

    public Long getStoreId() {
        return storeId;
    }

    public void setStoreId(Long storeId) {
        this.storeId = storeId;
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

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getVideoSrc() {
        return videoSrc;
    }

    public void setVideoSrc(String videoSrc) {
        this.videoSrc = videoSrc;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("categoryId", getCategoryId())
                .append("title", getTitle())
                .append("pic", getPic())
                .append("productCount", getProductCount())
                .append("recommendStatus", getRecommendStatus())
                .append("createTime", getCreateTime())
                .append("collectCount", getCollectCount())
                .append("readCount", getReadCount())
                .append("commentCount", getCommentCount())
                .append("albumPics", getAlbumPics())
                .append("description", getDescription())
                .append("showStatus", getShowStatus())
                .append("content", getContent())
                .append("forwardCount", getForwardCount())
                .append("categoryName", getCategoryName())
                .append("areaId", getAreaId())
                .append("schoolId", getSchoolId())
                .append("memberId", getMemberId())
                .append("reward", getReward())
                .append("storeId", getStoreId())
                .append("areaName", getAreaName())
                .append("schoolName", getSchoolName())
                .append("memberName", getMemberName())
                .append("videoSrc", getVideoSrc())
                .append("type", getType())
                .toString();
    }
}
