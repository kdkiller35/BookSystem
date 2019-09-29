package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.StockinfoMapper;
import com.woniuxy.domain.Stockinfo;
import com.woniuxy.service.IStockinfoService;
@Service
@Transactional
public class StockinfoServiceImpl implements IStockinfoService {
	@Autowired
	private StockinfoMapper mapper;
	@Override
	public void save(Stockinfo Stockinfo) {
		// TODO Auto-generated method stub
		mapper.insertSelective(Stockinfo);
	}

	@Override
	public void delete(Integer Stockinfoid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(Stockinfoid);
	}

	@Override
	public void update(Stockinfo Stockinfo) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKey(Stockinfo);
	}

	@Override
	public List<Stockinfo> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

	@Override
	public Stockinfo findOne(Integer Stockinfoid) {
		// TODO Auto-generated method stub

		return mapper.selectByPrimaryKey(Stockinfoid);
	}

}
