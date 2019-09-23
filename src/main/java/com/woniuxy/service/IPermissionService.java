package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Permission;



public interface IPermissionService {
	void save(Permission p);
	void delete(Integer permissionid);
	void update(Permission p);
	List<Permission> findAll();
	Permission findOne(Integer permissionid);
}
