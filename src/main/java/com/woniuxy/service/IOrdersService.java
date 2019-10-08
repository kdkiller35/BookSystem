package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Orders;

public interface IOrdersService {
	void save(Orders order);
	void delete(Integer orderid);
	void update(Orders order);
	List<Orders> findAll();
	Orders findOne(Integer orderid);
	
}
