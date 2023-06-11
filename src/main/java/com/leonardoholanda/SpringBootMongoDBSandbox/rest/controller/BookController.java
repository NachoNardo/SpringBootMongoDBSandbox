package com.leonardoholanda.SpringBootMongoDBSandbox.rest.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leonardoholanda.SpringBootMongoDBSandbox.model.Book;
import com.leonardoholanda.SpringBootMongoDBSandbox.rest.mapper.BookMapper;
import com.leonardoholanda.SpringBootMongoDBSandbox.rest.request.BookRequest;
import com.leonardoholanda.SpringBootMongoDBSandbox.service.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/")
@RequiredArgsConstructor
public class BookController {
	
	@Autowired
	private BookService bookService;
	@Autowired
	private BookMapper bookMaper;
	
	@PostMapping
	public Book saveBook(@Valid @RequestBody BookRequest request) {
		return bookService.saveBook(bookMaper.requestToModel(request));
	}
		
}
