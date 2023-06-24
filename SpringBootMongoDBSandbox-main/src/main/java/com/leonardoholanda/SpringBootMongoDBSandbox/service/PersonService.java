package com.leonardoholanda.SpringBootMongoDBSandbox.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

import com.leonardoholanda.SpringBootMongoDBSandbox.model.Person;
import com.leonardoholanda.SpringBootMongoDBSandbox.repository.PersonRepository;

@Service
public class PersonService {

	@Autowired
	private PersonRepository personRepository;
	
	public Person save(Person person) {
		return personRepository.save(person);
	}
	
	public List<Person> saveAll(List<Person> persons) {
		return personRepository.saveAll(persons);
	}
	
	public Person findById(UUID id) {
		return personRepository.findById(id).orElse(null);
	}

	public List<Person> findAll() {
		return personRepository.findAll();
	}
	
	public void deleteById(UUID id) {
		if (Objects.isNull(findById(id))) {
			throw new HttpClientErrorException(HttpStatusCode.valueOf(400), "Person with Id: %s  not found".formatted(id.toString()));
		}
		personRepository.deleteById(id);
	}
	
	public void deleteAllById(List<UUID> ids) {
		for (UUID id : ids) {
			deleteById(id);
		}
	}
	
	public void deleteAll() {
		personRepository.deleteAll();
	}
	
	public Person update(Person person) {
		if (Objects.isNull(findById(person.getId()))) {
			throw new HttpClientErrorException(HttpStatusCode.valueOf(400), "Person with Id: %s  not found".formatted(person.getId().toString()));
		}
		personRepository.delete(person);
		return personRepository.save(person);
	}
	
	public List<Person> updateAll(List<Person> persons) {
		List<Person> personsResponse = new ArrayList<>();
		Person personAux;
		
		for (Person person : persons) {
			personAux = update(person);
			personsResponse.add(personAux);
		}
		
		return personsResponse;
	}
}
