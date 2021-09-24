package com.hp.service;

import com.hp.bean.Component;
import com.hp.bean.ComponentExample;
import com.hp.dao.ComponentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("componentService")
public class ComponentServiceImpl implements ComponentService {
	@Autowired(required = false)
	private ComponentDAO componentDAO;
	public long countByExample(ComponentExample example){
    	return componentDAO.countByExample(example);
    }

	public int deleteByExample(ComponentExample example){
    	return componentDAO.deleteByExample(example);
    }

	public int deleteByPrimaryKey(Integer id){
    	return componentDAO.deleteByPrimaryKey(id);
    }

	public int insert(Component record){
    	return componentDAO.insert(record);
    }

	public int insertSelective(Component record){
    	return componentDAO.insertSelective(record);
    }

	public List<Component> selectByExample(ComponentExample example){
    	return componentDAO.selectByExample(example);
    }

	public Component selectByPrimaryKey(Integer id){
    	return componentDAO.selectByPrimaryKey(id);
    }
  
	public int updateByExampleSelective(Component record, ComponentExample example){
    	return componentDAO.updateByExampleSelective(record, example);
    }

	public int updateByExample(Component record, ComponentExample example){
    	return componentDAO.updateByExample(record, example);
    }

	public int updateByPrimaryKeySelective(Component record){
    	return componentDAO.updateByPrimaryKeySelective(record);
    }

	public int updateByPrimaryKey(Component record){
    	return componentDAO.updateByPrimaryKey(record);
    }

	@Override
	public List<Map> selectComponentAdd() {
		return componentDAO.selectComponentAdd();
	}

	@Override
	public List<Map> selectTwoTable() {
		return componentDAO.selectTwoTable();
	}


}
