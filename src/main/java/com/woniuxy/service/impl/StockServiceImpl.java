package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.StockMapper;
import com.woniuxy.domain.Stock;
import com.woniuxy.service.IStockService;
@Service
@Transactional
public class StockServiceImpl implements IStockService {
	@Autowired
	private StockMapper mapper;
	
	@Override
	public void save(Stock Stock) {
		// TODO Auto-generated method stub
		mapper.insertSelective(Stock);
	}

	@Override
	public void delete(Integer Stockid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(Stockid);
	}

	@Override
	public void update(Stock Stock) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(Stock);
	}

	@Override
	public List<Stock> findAll() {
		// TODO Auto-generated method stub
		return  mapper.selectByExample(null);
	}

	@Override
	public Stock findOne(Integer Stockid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(Stockid);
	}

}
