package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Stock;
import com.woniuxy.domain.Stockinfo;

public interface IStockinfoService {
	void save(Stockinfo Stockinfo);
	void delete(Integer Stockinfoid);
	void update(Stockinfo Stockinfo);
	List<Stockinfo> findAll();
	Stockinfo findOne(Integer Stockinfoid);
}
