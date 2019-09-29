package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.ClientlevlMapper;
import com.woniuxy.domain.Clientlevl;
import com.woniuxy.service.IClientlevlService;
@Service
@Transactional
public class ClientlevlService implements IClientlevlService {
	@Autowired
	private ClientlevlMapper mapper;
	
	@Override
	public void save(Clientlevl Clientlevl) {
		// TODO Auto-generated method stub
		mapper.insert(Clientlevl);
	}

	@Override
	public void delete(Integer clientlevlid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(clientlevlid);
	}

	@Override
	public void update(Clientlevl Clientlevl) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(Clientlevl);
	}

	@Override
	public List<Clientlevl> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

	@Override
	public Clientlevl findOne(Integer clientlevlid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(clientlevlid);
	}

}
