package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Roles;

public interface IRolesService {
	void save(Roles role);
	void delete(Integer rolesid);
	void update(Roles role);
	List<Roles> findAll();
	Roles findOne(Integer rolesid);
}
