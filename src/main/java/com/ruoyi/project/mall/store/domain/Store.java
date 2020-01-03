package com.ruoyi.project.mall.store.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 店铺对象 sys_store
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Data
public class Store extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 短信数量
     */
    @Excel(name = "短信数量")
    private Long smsQuantity;

    /**
     * 注册类型
     */
    @Excel(name = "注册类型")
    private Integer registerType;

    /**
     * 到期时间
     */
    @Excel(name = "到期时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date expireTime;

    /**
     * 尝试时间
     */
    @Excel(name = "尝试时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date tryTime;

    /**
     * 联系电话
     */
    @Excel(name = "联系电话")
    private String contactMobile;

    /**
     * 地区省
     */
    @Excel(name = "地区省")
    private String addressProvince;

    /**
     * 所购物品计划时间
     */
    @Excel(name = "所购物品计划时间")
    private Long buyPlanTimes;

    /**
     * 是否选中
     */
    @Excel(name = "是否选中")
    private Integer isChecked;

    /**
     * 是否删除
     */
    @Excel(name = "是否删除")
    private Integer isDeleted;

    /**
     * 服务电话
     */
    @Excel(name = "服务电话")
    private String servicePhone;

    /**
     * 地址名
     */
    @Excel(name = "地址名")
    private String addressLat;

    /**
     * 联系人名
     */
    @Excel(name = "联系人名")
    private String contactName;

    /**
     * 删除时间
     */
    @Excel(name = "删除时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date deleteTime;

    /**
     * 自己配置文件
     */
    @Excel(name = "自己配置文件")
    private String diyProfile;

    /**
     * 行业
     */
    @Excel(name = "行业")
    private Long industryTwo;

    /**
     * null
     */
    @Excel(name = "null")
    private Integer isStar;

    /**
     * 尝试
     */
    @Excel(name = "尝试")
    private Integer isTry;

    /**
     * 图标
     */
    @Excel(name = "图标")
    private String logo;

    /**
     * 地址细节
     */
    @Excel(name = "地址细节")
    private String addressDetail;

    /**
     * 计划id
     */
    @Excel(name = "计划id")
    private Long planId;

    /**
     * 支持，维持名称
     */
    @Excel(name = "支持，维持名称")
    private String supportName;

    /**
     * null
     */
    @Excel(name = "null")
    private String name;

    /**
     * 1 通过 2 审核中 3 拒绝
     */
    @Excel(name = "1 通过 2 审核中 3 拒绝")
    private Integer status;

    /**
     * null
     */
    @Excel(name = "null")
    private Integer uid;

    /**
     * 类型
     */
    @Excel(name = "类型")
    private Integer type;

    /**
     * 联系QQ
     */
    @Excel(name = "联系QQ")
    private String contactQq;

    /**
     * null
     */
    @Excel(name = "null")
    private String addressLng;

    /**
     * null
     */
    @Excel(name = "null", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastLoginTime;

    /**
     * 支持电话
     */
    @Excel(name = "支持电话")
    private String supportPhone;

    /**
     * 地址区域
     */
    @Excel(name = "地址区域")
    private String addressArea;

    /**
     * null
     */
    @Excel(name = "null")
    private String contactQrcode;

    /**
     * 描述
     */
    @Excel(name = "描述")
    private String description;

    /**
     * 行业1
     */
    @Excel(name = "行业1")
    private Long industryOne;

    /**
     * 地址城市
     */
    @Excel(name = "地址城市")
    private String addressCity;

    /**
     * null
     */
    private Long id;

    /**
     * null
     */
    @Excel(name = "null")
    private Long collect;

    /**
     * null
     */
    @Excel(name = "null")
    private Long hit;

    /**
     * 添加商品
     */
    @Excel(name = "添加商品")
    private Integer goodsCount;

    /**
     * 支付订单数
     */
    @Excel(name = "支付订单数")
    private Integer orderCount;

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
}
