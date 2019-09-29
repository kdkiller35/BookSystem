package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.ClientMapper;
import com.woniuxy.domain.Client;

import com.woniuxy.service.IClientService;

@Service
@Transactional
public class ClientService implements IClientService {
	@Autowired
	private ClientMapper mapper;

	@Override
	public void save(Client client) {
		// TODO Auto-generated method stub
		mapper.insert(client);
	}

	@Override
	public void delete(Integer clientid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(clientid);
	}

	@Override
	public void update(Client client) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(client);
	}

	@Override
	public List<Client> findAll() {
		// TODO Auto-generated method stub
		
		return mapper.selectByExample(null);
	}

	@Override
	public Client findOne(Integer clientid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(clientid);
	}

}
