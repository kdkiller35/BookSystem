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

import com.woniuxy.domain.Orderinfo;
import com.woniuxy.service.IOrderinfoService;






@Controller
@RequestMapping("orderinfos")
public class OrderinfoController {
	
	@Autowired
	private IOrderinfoService service;
	@GetMapping
	@ResponseBody
	public List<Orderinfo> findAll(){
		return service.findAll();
	}
	@PostMapping
	@ResponseBody
	public void save(@ RequestBody Orderinfo orderinfo){
		service.save(orderinfo);
	}
	@PutMapping
	@ResponseBody
	public void update(Orderinfo orderinfo){
		service.update(orderinfo);
		
	}
	@DeleteMapping
	@ResponseBody
	public void delete(Integer orderinfoid){
		service.delete(orderinfoid);
	}
}
