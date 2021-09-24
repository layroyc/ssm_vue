package com.hp.dao;

import com.hp.bean.Component;
import com.hp.bean.ComponentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface ComponentDAO {
    long countByExample(ComponentExample example);

    int deleteByExample(ComponentExample example);

    int deleteByPrimaryKey(Integer componentId);

    int insert(Component record);

    int insertSelective(Component record);

    List<Component> selectByExample(ComponentExample example);

    Component selectByPrimaryKey(Integer componentId);

    int updateByExampleSelective(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByExample(@Param("record") Component record, @Param("example") ComponentExample example);

    int updateByPrimaryKeySelective(Component record);

    int updateByPrimaryKey(Component record);

    //添加电脑配件的查询
    List<Map> selectComponentAdd();

    //添加电脑查询
    List<Map> selectTwoTable();
}