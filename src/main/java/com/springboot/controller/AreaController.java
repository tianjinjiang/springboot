package com.springboot.controller;

import com.springboot.domain.Area;
import com.springboot.service.AreaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 地域控制器
 *
 * @author kimtian
 **/
@RestController
public class AreaController {
    @Resource
    private AreaService areaService;

    @GetMapping("/getArea")
    public List<Area> getAreaList() {
        return areaService.queryAreaList();
    }

    @GetMapping("/deleteById")
    public void deleteById() {
        areaService.deleteById(5);
    }

    @GetMapping("/addArea")
    public void addArea() {
        List<Area> areas = new ArrayList<>();
        Area area1 = new Area();
        area1.setAreaId(5);
        area1.setAreaName("test1");
        area1.setPriority(5);
        areas.add(area1);
        Area area = new Area();
        area.setAreaId(5);
        area.setAreaName("tesrrt1");
        area.setPriority(5);
        areas.add(area);
        areaService.addArea(areas);
    }

    @GetMapping("/deleteBatch")
    public void deletbatch() {
        List<Area> areas = new ArrayList<>();
        Area area1 = new Area();
        area1.setAreaId(8);
        area1.setAreaName("test");
        area1.setPriority(5);
        areas.add(area1);
        Area area = new Area();
        area.setAreaId(9);
        area.setAreaName("test");
        area.setPriority(5);
        areas.add(area);
        areaService.deleteBatch(areas);
    }

    @GetMapping("/updateArea")
    public void updateArea() {
        Area area1 = new Area();
        area1.setAreaId(10);
        area1.setAreaName("中苑");
        area1.setPriority(5);
        areaService.updateArea(area1);
    }
}
