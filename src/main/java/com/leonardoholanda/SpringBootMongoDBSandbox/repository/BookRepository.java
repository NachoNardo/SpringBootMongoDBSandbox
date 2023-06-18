package com.leonardoholanda.SpringBootMongoDBSandbox.repository;

import org.springframework.stereotype.Repository;

import com.leonardoholanda.SpringBootMongoDBSandbox.model.Book;

import org.springframework.data.mongodb.repository.MongoRepository;

@Repository
public interface BookRepository extends MongoRepository<Book, Integer>{}
