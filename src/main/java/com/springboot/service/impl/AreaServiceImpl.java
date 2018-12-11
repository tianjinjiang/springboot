package com.springboot.service.impl;

import com.springboot.dao.AreaDao;
import com.springboot.domain.Area;
import com.springboot.service.AreaService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 地域服务实现
 *
 * @author kimtian
 **/
@Service("areaService")
public class AreaServiceImpl implements AreaService {

    @Override
    public List<Area> queryAreaList() {
        AreaDao areaDao = new AreaDao();
        List<Area> areas = areaDao.searchAreaList();
        System.out.println(
                areas.size()
        );
        return areaDao.searchAreaList();
    }

    @Override
    public void deleteById(int id) {
        AreaDao areaDao = new AreaDao();
        areaDao.deleteOne(id);
    }

    @Override
    public void deleteBatch(List<Area> areaList) {
        AreaDao areaDao = new AreaDao();
        List<Integer> idList = new ArrayList<>();
        for (Area area : areaList) {
            idList.add(area.getAreaId());
        }
        System.out.println(idList.size());
        for (int id : idList) {
            System.out.println(id);
        }
        areaDao.deleteBatch(idList);
    }

    @Override
    public boolean addArea(List<Area> areaList) {
        AreaDao areaDao = new AreaDao();
        if (areaList != null && areaList.size() > 0) {
            try {
                int num = areaDao.insertMessage(areaList);
                if (num > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入区域信息失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入区域信息失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("区域信息不能为空！");
        }
    }

    @Override
    public void updateArea(Area area) {
        System.out.println("!!!!!" + area.getPriority());
        AreaDao areaDao = new AreaDao();
        areaDao.updateArea(area);
    }

    public static void main(String[] args) {

    }
}
