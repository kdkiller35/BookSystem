package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.PermissionMapper;
import com.woniuxy.domain.Permission;
import com.woniuxy.service.IPermissionService;
@Service
@Transactional
public class PermissionService implements IPermissionService {
	@Autowired
	private PermissionMapper mapper;
	@Override
	public void save(Permission p) {
		mapper.insertSelective(p);
	}

	@Override
	public void delete(Integer permissionid) {
		mapper.deleteByPrimaryKey(permissionid);
	}

	@Override
	public void update(Permission p) {
		mapper.updateByPrimaryKeySelective(p);
	}

	@Override
	public List<Permission> findAll() {
		return mapper.selectByExample(null);
	}

	@Override
	public Permission findOne(Integer permissionid) {
		return mapper.selectByPrimaryKey(permissionid);
	}

}
