package com.leonardoholanda.SpringBootMongoDBSandbox.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.leonardoholanda.SpringBootMongoDBSandbox.model.Book;
import com.leonardoholanda.SpringBootMongoDBSandbox.repository.BookRepository;

@Service
public class BookService {

	@Autowired
	private BookRepository bookRepository;
	
	public Book saveBook(Book book) {
		return bookRepository.save(book);
	}
	
	public Book findBookById(Integer id) {
		return bookRepository.findById(id).orElse(null);
	}

	public List<Book> findAll() {
		return bookRepository.findAll();
	}

}
