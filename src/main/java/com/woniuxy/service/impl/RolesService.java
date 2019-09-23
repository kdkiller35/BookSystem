package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.RolesMapper;
import com.woniuxy.domain.Roles;
import com.woniuxy.service.IRolesService;
@Service
@Transactional
public class RolesService implements IRolesService {
	@Autowired
	private RolesMapper mapper;
	@Override
	public void save(Roles role) {
		mapper.insertSelective(role);
	}

	@Override
	public void delete(Integer rolesid) {   
		mapper.deleteByPrimaryKey(rolesid);
	}

	@Override
	public void update(Roles role) {
		mapper.updateByPrimaryKeySelective(role);
	}

	@Override
	public List<Roles> findAll() {
		return mapper.selectByExample(null);
	}

	@Override
	public Roles findOne(Integer rolesid) {
		return mapper.selectByPrimaryKey(rolesid);
	}

}
