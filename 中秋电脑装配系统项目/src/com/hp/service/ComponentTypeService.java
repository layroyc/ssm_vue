package com.hp.service;

import com.hp.bean.ComponentType;
import com.hp.bean.ComponentTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ComponentTypeService {
   
    long countByExample(ComponentTypeExample example);

    int deleteByExample(ComponentTypeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComponentType record);

    int insertSelective(ComponentType record);

    List<ComponentType> selectByExample(ComponentTypeExample example);

    ComponentType selectByPrimaryKey(Integer id);
  
    int updateByExampleSelective(@Param("record") ComponentType record, @Param("example") ComponentTypeExample example);

    int updateByExample(@Param("record") ComponentType record, @Param("example") ComponentTypeExample example);

    int updateByPrimaryKeySelective(ComponentType record);

    int updateByPrimaryKey(ComponentType record);

}
