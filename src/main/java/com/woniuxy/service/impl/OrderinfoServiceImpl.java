package com.woniuxy.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.OrderinfoMapper;
import com.woniuxy.domain.Orderinfo;

import com.woniuxy.service.IOrderinfoService;
@Service
@Transactional
public class OrderinfoServiceImpl implements IOrderinfoService{
	
	@Autowired
	private OrderinfoMapper mapper;
	@Override
	public void save(Orderinfo orderinfo) {
		// TODO Auto-generated method stub
		mapper.insertSelective(orderinfo);
	}

	@Override
	public void delete(Integer orderinfoid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(orderinfoid);
	}

	@Override
	public void update(Orderinfo orderinfo) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(orderinfo);
	}

	@Override
	public List<Orderinfo> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

	@Override
	public Orderinfo findOne(Integer orderinfoid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(orderinfoid);
	}

	

}
