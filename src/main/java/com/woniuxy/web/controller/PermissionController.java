package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Permission;
import com.woniuxy.service.IPermissionService;

@Controller
@RequestMapping("permissions")
public class PermissionController {
	@Autowired
	private IPermissionService service;
	@PostMapping
	@ResponseBody
	public void save(@RequestBody Permission p) {
		service.save(p);
	}
	@DeleteMapping
	@ResponseBody
	public void delete(Integer permissionid) {
		service.delete(permissionid);
	}
	@PutMapping
	@ResponseBody
	public void update(Permission p) {
		service.update(p);
	}
	@GetMapping
	@ResponseBody
	public List<Permission> findAll() {
		return service.findAll();
	}
}
