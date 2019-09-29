package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Client;
import com.woniuxy.domain.Roles;

public interface IClientService {
	void save(Client client);
	void delete(Integer clientid);
	void update(Client client);
	List<Client> findAll();
	Client findOne(Integer clientid);
}
