package com.springboot.domain;

import java.util.Date;

/**
 * 地域实体
 *
 * @author kimtian
 **/
public class Area {
    /**
     * 地域id
     **/
    public int areaId;

    /**
     * 地域名称
     **/
    public String areaName;

    /**
     * 优先级
     **/
    public int priority;

    /**
     * 创建时间
     **/
    public Date createTime;

    /**
     * 最后编辑时间
     **/
    public Date lastEditTime;

    public int getAreaId() {
        return areaId;
    }

    public void setAreaId(int areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }
}
