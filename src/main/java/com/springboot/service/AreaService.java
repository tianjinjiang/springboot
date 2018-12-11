package com.springboot.service;

import com.springboot.domain.Area;

import java.util.List;

/**
 * 地域服务
 *
 * @author kimtian
 **/
public interface AreaService {
    /**
     * 查询地域列表
     *
     * @return List<Area> 地域列表
     **/
    List<Area> queryAreaList();

    /**
     * 根据ID删除地域
     *
     * @param id ID编号
     **/
    void deleteById(int id);

    /**
     * 批量删除地域
     *
     * @param areaList 地域列表
     **/
    void deleteBatch(List<Area> areaList);

    /**
     * 新增地域
     *
     * @param areaList 消息列表
     **/
    boolean addArea(List<Area> areaList);

    /**
     * 更新消息
     *
     * @param area 消息
     **/
    void updateArea(Area area);
}
