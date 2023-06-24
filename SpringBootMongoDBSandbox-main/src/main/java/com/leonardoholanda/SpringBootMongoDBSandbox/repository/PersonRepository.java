package com.leonardoholanda.SpringBootMongoDBSandbox.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.leonardoholanda.SpringBootMongoDBSandbox.model.Person;

@Repository
public interface PersonRepository extends MongoRepository<Person, UUID>{}
