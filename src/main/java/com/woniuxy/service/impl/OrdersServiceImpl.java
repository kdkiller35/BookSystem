package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.OrdersMapper;
import com.woniuxy.domain.Orders;
import com.woniuxy.service.IOrdersService;

@Service
@Transactional
public class OrdersServiceImpl implements IOrdersService{
	
	@Autowired
	private OrdersMapper mapper;
	@Override
	public void save(Orders order) {
		// TODO Auto-generated method stub
		mapper.insertSelective(order);
	}

	@Override
	public void delete(Integer orderid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(orderid);
	}

	@Override
	public void update(Orders order) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(order);
	}

	@Override
	public List<Orders> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

	@Override
	public Orders findOne(Integer orderid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(orderid);
	}

}
