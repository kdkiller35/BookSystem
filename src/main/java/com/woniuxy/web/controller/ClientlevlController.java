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

import com.woniuxy.domain.Client;
import com.woniuxy.domain.Clientlevl;
import com.woniuxy.service.IClientlevlService;
import com.woniuxy.service.impl.ClientService;
import com.woniuxy.service.impl.UserService;


@Controller
@RequestMapping("clientlevls")
public class ClientlevlController {
	@Autowired
	private IClientlevlService service; 
	@PostMapping
	@ResponseBody
	public void save (@RequestBody Clientlevl clientlevl) {
		service.save(clientlevl);
	}
	@GetMapping
	@ResponseBody
	public List<Clientlevl> findAll () {
		return	service.findAll();
		
	}
	@DeleteMapping
	@ResponseBody
	public void delete (Integer clientlevlid) {
		service.delete(clientlevlid);
	}
	@PutMapping
	@ResponseBody
	public void update(Clientlevl clientlevl) {
		service.update(clientlevl);
	}
	
	
	
}
