package com.springboot.dao;

import com.springboot.domain.Area;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {

//    @Autowired
//    private AreaDao areaDao;

    @Test
    public void searchAreaList() {
//        List<Area> areas = areaDao.searchAreaList();
//        Assert.assertEquals(areas.size(), 7);
    }

    @Test
    public void deleteOne() {
    }

    @Test
    public void deleteBatch() {
    }

    @Test
    public void insertMessage() {
    }

    @Test
    public void updateArea() {
    }
}