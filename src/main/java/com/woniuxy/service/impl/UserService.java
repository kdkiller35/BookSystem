package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.UserMapper;
import com.woniuxy.domain.User;
import com.woniuxy.service.IUserService;
@Service
@Transactional
public class UserService implements IUserService {
	@Autowired
	private UserMapper mapper;
	@Override
	public void save(User user) {
		mapper.insertSelective(user);
	}

	@Override
	public void delete(Integer userid) {
		mapper.deleteByPrimaryKey(userid);
	}

	@Override
	public void update(User user) {
		mapper.updateByPrimaryKeySelective(user);
	}

	@Override
	public List<User> findAll() {
		return mapper.selectByExample(null);
	}

	@Override
	public User findOne(Integer userid) {
		return mapper.selectByPrimaryKey(userid);
	}
}
