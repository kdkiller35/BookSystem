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
import com.woniuxy.domain.Provider;
import com.woniuxy.service.IProviderService;

@Controller
@RequestMapping("providers")
public class ProviderController {
	@Autowired
	private IProviderService service;
	@PostMapping
	@ResponseBody
	public void save (@RequestBody Provider Provider) {
		service.save(Provider);
	}
	@GetMapping
	@ResponseBody
	public List<Provider> findAll () {
		return	service.findAll();
		
	}
	@DeleteMapping
	@ResponseBody
	public void delete (Integer providerid) {
		service.delete(providerid);
	}
	@PutMapping
	@ResponseBody
	public void update(Provider Provider) {
		service.update(Provider);
	}
	
}
