package com.woniuxy.service;

import java.util.List;

import com.woniuxy.domain.Book;

public interface IBookService {
	void save(Book book);
	void delete(Integer bookid);
	void update(Book book);
	List<Book> findAll();
	Book findOne(Integer bookid);
	
}
