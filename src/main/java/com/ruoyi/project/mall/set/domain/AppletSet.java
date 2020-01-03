package com.ruoyi.project.mall.set.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 sys_applet_set
 *
 * @author mallplus
 * @date 2020-01-03
 */
public class AppletSet extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String appid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String appsecret;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String mchid;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String paySignKey;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String certname;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String notifyurl;

    /** 下单通知模版 */
    @Excel(name = "下单通知模版")
    private String templateid1;

    /** 支付成功模版 */
    @Excel(name = "支付成功模版")
    private String templateid2;

    /** $column.columnComment */
    @Excel(name = "支付成功模版")
    private String templateid3;

    /** $column.columnComment */
    @Excel(name = "支付成功模版")
    private String templateid4;

    /** $column.columnComment */
    @Excel(name = "支付成功模版")
    private String templateid5;

    /** $column.columnComment */
    @Excel(name = "支付成功模版")
    private String templateid6;

    /** $column.columnComment */
    private Long storeId;

    public void setAppid(String appid)
    {
        this.appid = appid;
    }

    public String getAppid()
    {
        return appid;
    }
    public void setAppsecret(String appsecret)
    {
        this.appsecret = appsecret;
    }

    public String getAppsecret()
    {
        return appsecret;
    }
    public void setMchid(String mchid)
    {
        this.mchid = mchid;
    }

    public String getMchid()
    {
        return mchid;
    }
    public void setPaySignKey(String paySignKey)
    {
        this.paySignKey = paySignKey;
    }

    public String getPaySignKey()
    {
        return paySignKey;
    }
    public void setCertname(String certname)
    {
        this.certname = certname;
    }

    public String getCertname()
    {
        return certname;
    }
    public void setNotifyurl(String notifyurl)
    {
        this.notifyurl = notifyurl;
    }

    public String getNotifyurl()
    {
        return notifyurl;
    }
    public void setTemplateid1(String templateid1)
    {
        this.templateid1 = templateid1;
    }

    public String getTemplateid1()
    {
        return templateid1;
    }
    public void setTemplateid2(String templateid2)
    {
        this.templateid2 = templateid2;
    }

    public String getTemplateid2()
    {
        return templateid2;
    }
    public void setTemplateid3(String templateid3)
    {
        this.templateid3 = templateid3;
    }

    public String getTemplateid3()
    {
        return templateid3;
    }
    public void setTemplateid4(String templateid4)
    {
        this.templateid4 = templateid4;
    }

    public String getTemplateid4()
    {
        return templateid4;
    }
    public void setTemplateid5(String templateid5)
    {
        this.templateid5 = templateid5;
    }

    public String getTemplateid5()
    {
        return templateid5;
    }
    public void setTemplateid6(String templateid6)
    {
        this.templateid6 = templateid6;
    }

    public String getTemplateid6()
    {
        return templateid6;
    }
    public void setStoreId(Long storeId)
    {
        this.storeId = storeId;
    }

    public Long getStoreId()
    {
        return storeId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("appid", getAppid())
            .append("appsecret", getAppsecret())
            .append("mchid", getMchid())
            .append("paySignKey", getPaySignKey())
            .append("certname", getCertname())
            .append("notifyurl", getNotifyurl())
            .append("templateid1", getTemplateid1())
            .append("templateid2", getTemplateid2())
            .append("templateid3", getTemplateid3())
            .append("templateid4", getTemplateid4())
            .append("templateid5", getTemplateid5())
            .append("templateid6", getTemplateid6())
            .append("storeId", getStoreId())
            .toString();
    }
}
