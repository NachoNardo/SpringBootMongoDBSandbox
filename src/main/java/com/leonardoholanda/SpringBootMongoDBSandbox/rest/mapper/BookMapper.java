package com.leonardoholanda.SpringBootMongoDBSandbox.rest.mapper;

import org.mapstruct.Mapper;

import com.leonardoholanda.SpringBootMongoDBSandbox.model.Book;
import com.leonardoholanda.SpringBootMongoDBSandbox.rest.request.BookRequest;

@Mapper
public interface BookMapper {

	public Book requestToModel(BookRequest request);
}
