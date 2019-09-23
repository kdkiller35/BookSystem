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

import com.woniuxy.domain.Roles;
import com.woniuxy.service.IRolesService;

@Controller
@RequestMapping("roles")
public class RolesController {
	@Autowired
	private IRolesService service;
	@PostMapping
	@ResponseBody
	public void save(@RequestBody Roles r) {
		service.save(r);
	}
	@DeleteMapping
	@ResponseBody
	public void delete(Integer rolesid) {
		service.delete(rolesid);
	}
	@PutMapping
	@ResponseBody
	public void update(Roles r) {
		service.update(r);
	}
	@GetMapping
	@ResponseBody
	public List<Roles> findAll(){
		return service.findAll();
	}
}
