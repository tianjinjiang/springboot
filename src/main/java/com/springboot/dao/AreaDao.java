package com.springboot.dao;

import com.springboot.db.DBAcess;
import com.springboot.domain.Area;
import org.apache.ibatis.session.SqlSession;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 对TB_AREA区域表操作的数据层
 *
 * @author kimtian
 **/
public class AreaDao {
    /**
     * 根据查询条件查询地域列表
     *
     * @return List<Message> 地域列表
     **/
    public List<Area> searchAreaList() {
        DBAcess dbAcess = new DBAcess();
        List<Area> messageList = new ArrayList<>();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAcess.getSqlSession();
            messageList = sqlSession.selectList("Area.searchAreaList");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return messageList;
    }

    /**
     * 根据id删除一条数据
     *
     * @param id 编号
     **/
    public void deleteOne(int id) {
        DBAcess dbAcess = new DBAcess();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAcess.getSqlSession();
            sqlSession.delete("Area.deleteOne", id);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

    /**
     * 批量删除数据
     *
     * @param idList 编号列表
     **/
    public void deleteBatch(List<Integer> idList) {
        DBAcess dbAcess = new DBAcess();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAcess.getSqlSession();
            sqlSession.delete("Area.deleteBatch", idList);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }


    /**
     * 新增数据
     *
     * @param areaList 地域列表
     **/
    public int insertMessage(List<Area> areaList) {
        DBAcess dbAcess = new DBAcess();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAcess.getSqlSession();
            sqlSession.insert("Area.insertArea", areaList);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
        return 1;
    }

    /**
     * 更新数据
     *
     * @param area 地域
     **/
    public void updateArea(Area area) {
        DBAcess dbAcess = new DBAcess();
        SqlSession sqlSession = null;
        try {
            sqlSession = dbAcess.getSqlSession();
            sqlSession.update("Area.updateArea", area);
            sqlSession.commit();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }
}
