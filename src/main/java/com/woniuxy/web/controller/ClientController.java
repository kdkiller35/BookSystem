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
import com.woniuxy.service.IClientService;
import com.woniuxy.service.impl.ClientService;
import com.woniuxy.service.impl.UserService;


@Controller
@RequestMapping("clients")
public class ClientController {
	@Autowired
	private IClientService service; 
	@PostMapping
	@ResponseBody
	public void save (@RequestBody Client client) {
		service.save(client);
	}
	@GetMapping
	@ResponseBody
	public List<Client> findAll () {
		return	service.findAll();
		
	}
	@DeleteMapping
	@ResponseBody
	public void delete (Integer clientid) {
		service.delete(clientid);
	}
	@PutMapping
	@ResponseBody
	public void update(Client client) {
		service.update(client);
	}
	
	
	
}
