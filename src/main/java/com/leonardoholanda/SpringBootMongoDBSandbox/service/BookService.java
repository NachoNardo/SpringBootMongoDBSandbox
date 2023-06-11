package com.leonardoholanda.SpringBootMongoDBSandbox.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardoholanda.SpringBootMongoDBSandbox.dao.BookRepository;
import com.leonardoholanda.SpringBootMongoDBSandbox.model.Book;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book saveBook(Book book) {
		return bookRepository.save(null);
	}

}
