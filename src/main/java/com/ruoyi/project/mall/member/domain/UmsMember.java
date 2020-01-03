package com.ruoyi.project.mall.member.domain;

import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import lombok.Data;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 会员对象 ums_member
 *
 * @author mallplus
 * @date 2019-09-17
 */
@Data
public class UmsMember extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * $column.columnComment
     */
    private Long id;

    /**
     * $column.columnComment
     */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private Long memberLevelId;

    /**
     * 用户名
     */
    @Excel(name = "用户名")
    private String username;

    /**
     * 密码
     */
    @Excel(name = "密码")
    private String password;

    /**
     * 昵称
     */
    @Excel(name = "昵称")
    private String nickname;

    /**
     * 手机号码
     */
    @Excel(name = "手机号码")
    private String phone;

    /**
     * 帐号启用状态:0->禁用；1->启用
     */
    @Excel(name = "帐号启用状态:0->禁用；1->启用")
    private Integer status;

    /**
     * 头像
     */
    @Excel(name = "头像")
    private String icon;

    /**
     * 性别：0->未知；1->男；2->女
     */
    @Excel(name = "性别：0->未知；1->男；2->女")
    private Integer gender;

    /**
     * 生日
     */
    @Excel(name = "生日", width = 30, dateFormat = "yyyy-MM-dd")
    private Date birthday;

    /**
     * 所做城市
     */
    @Excel(name = "所做城市")
    private String city;

    /**
     * 职业
     */
    @Excel(name = "职业")
    private String job;

    /**
     * 个性签名
     */
    @Excel(name = "个性签名")
    private String personalizedSignature;

    /**
     * 用户来源 1 小程序 2 公众号 3 页面
     */
    @Excel(name = "用户来源 1 小程序 2 公众号 3 页面")
    private Integer sourceType;

    /**
     * 积分
     */
    @Excel(name = "积分")
    private Long integration;

    /**
     * 成长值
     */
    @Excel(name = "成长值")
    private Long growth;

    /**
     * 剩余抽奖次数
     */
    @Excel(name = "剩余抽奖次数")
    private Long luckeyCount;

    /**
     * 历史积分数量
     */
    @Excel(name = "历史积分数量")
    private Long historyIntegration;

    /**
     * $column.columnComment
     */
    @Excel(name = "历史积分数量")
    private String avatar;

    /**
     * $column.columnComment
     */
    @Excel(name = "历史积分数量")
    private String weixinOpenid;

    /**
     * $column.columnComment
     */
    @Excel(name = "历史积分数量")
    private Long invitecode;

    /**
     * 余额
     */
    @Excel(name = "余额")
    private Long blance;

    /**
     * $column.columnComment
     */
    @Excel(name = "余额")
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
    private Long areaId;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private String schoolName;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private String areaName;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private Long buyCount;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private Long buyMoney;

    /**
     * $column.columnComment
     */
    @Excel(name = "所属店铺")
    private String memberLevelName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberLevelId() {
        return memberLevelId;
    }

    public void setMemberLevelId(Long memberLevelId) {
        this.memberLevelId = memberLevelId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getPersonalizedSignature() {
        return personalizedSignature;
    }

    public void setPersonalizedSignature(String personalizedSignature) {
        this.personalizedSignature = personalizedSignature;
    }

    public Integer getSourceType() {
        return sourceType;
    }

    public void setSourceType(Integer sourceType) {
        this.sourceType = sourceType;
    }

    public Long getIntegration() {
        return integration;
    }

    public void setIntegration(Long integration) {
        this.integration = integration;
    }

    public Long getGrowth() {
        return growth;
    }

    public void setGrowth(Long growth) {
        this.growth = growth;
    }

    public Long getLuckeyCount() {
        return luckeyCount;
    }

    public void setLuckeyCount(Long luckeyCount) {
        this.luckeyCount = luckeyCount;
    }

    public Long getHistoryIntegration() {
        return historyIntegration;
    }

    public void setHistoryIntegration(Long historyIntegration) {
        this.historyIntegration = historyIntegration;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getWeixinOpenid() {
        return weixinOpenid;
    }

    public void setWeixinOpenid(String weixinOpenid) {
        this.weixinOpenid = weixinOpenid;
    }

    public Long getInvitecode() {
        return invitecode;
    }

    public void setInvitecode(Long invitecode) {
        this.invitecode = invitecode;
    }

    public Long getBlance() {
        return blance;
    }

    public void setBlance(Long blance) {
        this.blance = blance;
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

    public Long getAreaId() {
        return areaId;
    }

    public void setAreaId(Long areaId) {
        this.areaId = areaId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Long getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(Long buyCount) {
        this.buyCount = buyCount;
    }

    public Long getBuyMoney() {
        return buyMoney;
    }

    public void setBuyMoney(Long buyMoney) {
        this.buyMoney = buyMoney;
    }

    public String getMemberLevelName() {
        return memberLevelName;
    }

    public void setMemberLevelName(String memberLevelName) {
        this.memberLevelName = memberLevelName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("id", getId())
                .append("memberLevelId", getMemberLevelId())
                .append("username", getUsername())
                .append("password", getPassword())
                .append("nickname", getNickname())
                .append("phone", getPhone())
                .append("status", getStatus())
                .append("createTime", getCreateTime())
                .append("icon", getIcon())
                .append("gender", getGender())
                .append("birthday", getBirthday())
                .append("city", getCity())
                .append("job", getJob())
                .append("personalizedSignature", getPersonalizedSignature())
                .append("sourceType", getSourceType())
                .append("integration", getIntegration())
                .append("growth", getGrowth())
                .append("luckeyCount", getLuckeyCount())
                .append("historyIntegration", getHistoryIntegration())
                .append("avatar", getAvatar())
                .append("weixinOpenid", getWeixinOpenid())
                .append("invitecode", getInvitecode())
                .append("blance", getBlance())
                .append("schoolId", getSchoolId())
                .append("storeId", getStoreId())
                .append("areaId", getAreaId())
                .append("schoolName", getSchoolName())
                .append("areaName", getAreaName())
                .append("buyCount", getBuyCount())
                .append("buyMoney", getBuyMoney())
                .append("memberLevelName", getMemberLevelName())
                .toString();
    }
}
