package com.woniuxy.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.woniuxy.domain.Book;
import com.woniuxy.service.IBookService;

@Controller
@RequestMapping("books")
public class BookController {
	
	@Autowired
	private IBookService service;
	@GetMapping
	@ResponseBody
	public List<Book> findAll(){
		return service.findAll();
	}
	@PostMapping
	@ResponseBody
	public void save(@ RequestBody Book book){
		service.save(book);
	}
	@PutMapping
	@ResponseBody
	public void update(Book book){
		service.update(book);
	}
	
	@DeleteMapping
	@ResponseBody
	public void delete(Integer bookid){
		service.delete(bookid);
	}
}
