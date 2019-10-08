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

import com.woniuxy.domain.Stock;
import com.woniuxy.domain.Stockinfo;
import com.woniuxy.service.impl.StockinfoServiceImpl;

@Controller
@RequestMapping("stockinfos")
public class StockinfoController {
	@Autowired
	private StockinfoServiceImpl service;
	@PostMapping
	@ResponseBody
	public void save (@RequestBody Stockinfo Stockinfo) {
		service.save(Stockinfo);
	}
	@GetMapping
	@ResponseBody
	public List<Stockinfo> findAll () {
		return	service.findAll();
		
	}
	@DeleteMapping
	@ResponseBody
	public void delete (Integer stockinfoid) {
		service.delete(stockinfoid);
	}
	@PutMapping
	@ResponseBody
	public void update(Stockinfo Stockinfo) {
		service.update(Stockinfo);
	}
}
