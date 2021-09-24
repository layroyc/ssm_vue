package com.hp.service;

import com.hp.bean.ComponentType;
import com.hp.bean.ComponentTypeExample;
import com.hp.dao.ComponentTypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("componentTypeService")
public class ComponentTypeServiceImpl implements ComponentTypeService {
	@Autowired(required = false)
	private ComponentTypeDAO componentTypeDAO;
	public long countByExample(ComponentTypeExample example){
    	return componentTypeDAO.countByExample(example);
    }

	public int deleteByExample(ComponentTypeExample example){
    	return componentTypeDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return componentTypeDAO.deleteByPrimaryKey(id);
    }

	public int insert(ComponentType record){
    	return componentTypeDAO.insert(record);
    }

	public int insertSelective(ComponentType record){
    	return componentTypeDAO.insertSelective(record);
    }

	public List<ComponentType> selectByExample(ComponentTypeExample example){
    	return componentTypeDAO.selectByExample(example);
    }

	public ComponentType selectByPrimaryKey(Integer id){
    	return componentTypeDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(ComponentType record, ComponentTypeExample example){
    	return componentTypeDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(ComponentType record, ComponentTypeExample example){
    	return componentTypeDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(ComponentType record){
    	return componentTypeDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(ComponentType record){
    	return componentTypeDAO.updateByPrimaryKey(record);
    }


}
