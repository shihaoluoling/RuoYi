package com.ruoyi.project.mall.advertise.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;
import java.util.Date;

/**
 * 首页轮播广告对象 sms_home_advertise
 * 
 * @author mallplus
 * @date 2020-01-13
 */
public class SmsHomeAdvertise extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String name;

    /** 轮播位置：0->PC首页轮播；1->app首页轮播 */
    @Excel(name = "轮播位置：0->PC首页轮播；1->app首页轮播")
    private Integer type;

    /** $column.columnComment */
    @Excel(name = "轮播位置：0->PC首页轮播；1->app首页轮播")
    private String pic;

    /** $column.columnComment */
    @Excel(name = "轮播位置：0->PC首页轮播；1->app首页轮播", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** $column.columnComment */
    @Excel(name = "轮播位置：0->PC首页轮播；1->app首页轮播", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 上下线状态：0->下线；1->上线 */
    @Excel(name = "上下线状态：0->下线；1->上线")
    private Integer status;

    /** 点击数 */
    @Excel(name = "点击数")
    private Long clickCount;

    /** 下单数 */
    @Excel(name = "下单数")
    private Long orderCount;

    /** 链接地址 */
    @Excel(name = "链接地址")
    private String url;

    /** 备注 */
    @Excel(name = "备注")
    private String note;

    /** 排序 */
    @Excel(name = "排序")
    private Long sort;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setType(Integer type) 
    {
        this.type = type;
    }

    public Integer getType() 
    {
        return type;
    }
    public void setPic(String pic) 
    {
        this.pic = pic;
    }

    public String getPic() 
    {
        return pic;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setStatus(Integer status) 
    {
        this.status = status;
    }

    public Integer getStatus() 
    {
        return status;
    }
    public void setClickCount(Long clickCount) 
    {
        this.clickCount = clickCount;
    }

    public Long getClickCount() 
    {
        return clickCount;
    }
    public void setOrderCount(Long orderCount) 
    {
        this.orderCount = orderCount;
    }

    public Long getOrderCount() 
    {
        return orderCount;
    }
    public void setUrl(String url) 
    {
        this.url = url;
    }

    public String getUrl() 
    {
        return url;
    }
    public void setNote(String note) 
    {
        this.note = note;
    }

    public String getNote() 
    {
        return note;
    }
    public void setSort(Long sort) 
    {
        this.sort = sort;
    }

    public Long getSort() 
    {
        return sort;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("name", getName())
            .append("type", getType())
            .append("pic", getPic())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("status", getStatus())
            .append("clickCount", getClickCount())
            .append("orderCount", getOrderCount())
            .append("url", getUrl())
            .append("note", getNote())
            .append("sort", getSort())
            .toString();
    }
}
