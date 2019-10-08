package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Orderinfo;


public interface IOrderinfoService {
	void save(Orderinfo orderinfo);
	void delete(Integer orderinfoid);
	void update(Orderinfo orderinfo);
	List<Orderinfo> findAll();
	Orderinfo findOne(Integer orderinfoid);
}
