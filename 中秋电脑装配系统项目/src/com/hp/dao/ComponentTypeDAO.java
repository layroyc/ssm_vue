package com.hp.dao;

import com.hp.bean.ComponentType;
import com.hp.bean.ComponentTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComponentTypeDAO {
    long countByExample(ComponentTypeExample example);

    int deleteByExample(ComponentTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(ComponentType record);

    int insertSelective(ComponentType record);

    List<ComponentType> selectByExample(ComponentTypeExample example);

    ComponentType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") ComponentType record, @Param("example") ComponentTypeExample example);

    int updateByExample(@Param("record") ComponentType record, @Param("example") ComponentTypeExample example);

    int updateByPrimaryKeySelective(ComponentType record);

    int updateByPrimaryKey(ComponentType record);
}