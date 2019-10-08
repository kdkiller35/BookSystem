package com.woniuxy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.woniuxy.dao.BookMapper;
import com.woniuxy.domain.Book;
import com.woniuxy.service.IBookService;

@Service
@Transactional
public class BookServiceImpl implements IBookService {
	
	@Autowired
	private BookMapper mapper;
	@Override
	public void save(Book book) {
		// TODO Auto-generated method stub
		mapper.insertSelective(book);
	}

	@Override
	public void delete(Integer bookid) {
		// TODO Auto-generated method stub
		mapper.deleteByPrimaryKey(bookid);
	}

	@Override
	public void update(Book book) {
		// TODO Auto-generated method stub
		mapper.updateByPrimaryKeySelective(book);
	
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

	@Override
	public Book findOne(Integer bookid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(bookid);
	}

}
