package com.woniuxy.web.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
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
	@PostMapping("login")
	@ResponseBody
	public Map<String, Object>  login(@RequestBody User user) {
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token=new UsernamePasswordToken(user.getUsername(),user.getPassword());
		Map<String, Object> map = new HashMap<>();
		try {
			subject.login(token);
			map.put("status", 200);
			map.put("user", subject.getPrincipal());
		} catch (AuthenticationException e) {
			map.put("status", 500);
		}
		return map;
	}
	@GetMapping("isLogin")
	@ResponseBody
	public Map isLogin() {
		Subject subject = SecurityUtils.getSubject();
		Map map = new HashMap();
		map.put("status", subject.isAuthenticated()? 200 : 500);
		return map;
	}
}
