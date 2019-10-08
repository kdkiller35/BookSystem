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

import com.woniuxy.domain.Clientlevl;
import com.woniuxy.domain.Stock;
import com.woniuxy.service.impl.StockServiceImpl;

@Controller
@RequestMapping("stocks")
public class StockController {
	@Autowired
	private StockServiceImpl service;
	@PostMapping
	@ResponseBody
	public void save (@RequestBody Stock Stock) {
		service.save(Stock);
	}
	@GetMapping
	@ResponseBody
	public List<Stock> findAll () {
		return	service.findAll();
		
	}
	@DeleteMapping
	@ResponseBody
	public void delete (Integer stockid) {
		service.delete(stockid);
	}
	@PutMapping
	@ResponseBody
	public void update(Stock Stock) {
		service.update(Stock);
	}
}
