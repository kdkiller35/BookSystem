package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.ProviderMapper;
import com.woniuxy.domain.Provider;
import com.woniuxy.service.IProviderService;
@Service
@Transactional
public class ProviderServiceImpl implements IProviderService {
	@Autowired
	private ProviderMapper mapper;
	@Override
	public void save(Provider Provider) {
		// TODO Auto-generated method stub
		mapper.insertSelective(Provider);

	}

	@Override
	public void delete(Integer pid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(pid);
	}

	@Override
	public void update(Provider Provider) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(Provider);
	}

	@Override
	public List<Provider> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

	@Override
	public Provider findOne(Integer pid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(pid);
	}

}
