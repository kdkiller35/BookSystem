package com.woniuxy.service;

import java.util.List;


import com.woniuxy.domain.Stock;

public interface IStockService {
	void save(Stock Stock);
	void delete(Integer Stockid);
	void update(Stock Stock);
	List<Stock> findAll();
	Stock findOne(Integer Stockid);
}
