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

import com.woniuxy.domain.Orders;
import com.woniuxy.service.IOrdersService;




@Controller
@RequestMapping("orders")
public class OrdersController {
	
	@Autowired
	private IOrdersService service;
	@GetMapping
	@ResponseBody
	public List<Orders> findAll(){
		return service.findAll();
	}
	@PostMapping
	@ResponseBody
	public void save(@ RequestBody Orders orders){
		service.save(orders);
	}
	@PutMapping
	@ResponseBody
	public void update(Orders orders){
		service.update(orders);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer orderid){
		System.out.println("OrdersController.delete()"+orderid);
		service.delete(orderid);
	}
}
