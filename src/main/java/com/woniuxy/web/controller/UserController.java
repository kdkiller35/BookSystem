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

import com.woniuxy.domain.User;
import com.woniuxy.service.IUserService;

@Controller
@RequestMapping("users")
public class UserController {
	@Autowired
	private IUserService service;
	@PostMapping
	@ResponseBody
	public void save(@RequestBody User user) {
		service.save(user);
	}
	@DeleteMapping
	@ResponseBody
	public void delete(Integer userid) {
		service.delete(userid);
	}
	@PutMapping
	@ResponseBody
	public void update(User user) {
		System.out.println("UserController.update()");
		service.update(user);
	}
	@GetMapping
	@ResponseBody
	public List<User> findAll() {
		System.out.println("UserController.findAll()");
		return service.findAll();
	}
}
