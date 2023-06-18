package com.leonardoholanda.SpringBootMongoDBSandbox.rest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardoholanda.SpringBootMongoDBSandbox.model.Book;
import com.leonardoholanda.SpringBootMongoDBSandbox.rest.request.BookRequest;
import com.leonardoholanda.SpringBootMongoDBSandbox.service.BookService;

@RestController
@RequestMapping(value = "/")
public class BookController {

	@Autowired
	private BookService bookService;
	
	@PostMapping
	public Book saveBook(@Valid @RequestBody BookRequest request) {
		return bookService.saveBook(requestToModel(request));
	}

	private Book requestToModel(@Valid BookRequest request) {
		Book book = new Book();
		book.setName(request.getName());
		book.setPages(request.getPages());
		book.setReaded(request.getReaded());
		book.setSubject(request.getSubject());
		return book;
	}
		
}
