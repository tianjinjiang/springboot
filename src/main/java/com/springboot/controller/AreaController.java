package com.springboot.controller;

import com.springboot.domain.Area;
import com.springboot.service.AreaService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    @RequestMapping(value = "/deleteById", method = RequestMethod.GET)
    public void deleteById(int areaId) {
        areaService.deleteById(areaId);
    }

    @RequestMapping(value = "/addArea", method = RequestMethod.POST)
    @GetMapping("/addArea")
    public Map<String, Object> addArea(@RequestBody Area area) {
        Map<String, Object> modelMap = new HashMap<String, Object>();
        List<Area> areas = new ArrayList<>();
        areas.add(area);
        modelMap.put("success", areaService.addArea(areas));
        return modelMap;
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
