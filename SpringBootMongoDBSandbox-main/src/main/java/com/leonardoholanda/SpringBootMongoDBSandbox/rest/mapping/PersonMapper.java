package com.leonardoholanda.SpringBootMongoDBSandbox.rest.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import com.leonardoholanda.SpringBootMongoDBSandbox.model.Person;
import com.leonardoholanda.SpringBootMongoDBSandbox.rest.request.PersonIdRequest;
import com.leonardoholanda.SpringBootMongoDBSandbox.rest.request.PersonRequest;

public class PersonMapper {

	public static Person requestToModelGenerateId(@Valid PersonRequest request) {
		Person person = new Person();

		person.setId(UUID.randomUUID());
		person.setAge(request.getAge());
		person.setName(request.getName());
		person.setSex(request.getSex());

		if (!request.isHasKids()) {
			person.setHasKids(false);
			person.setNumKids(0);
		} else {
			person.setHasKids(true);
			person.setNumKids(request.getNumKids());
		}

		return person;
	}

	public static List<Person> requestsToModelsGenerateId(List<PersonRequest> request) {
		List<Person> persons = new ArrayList<>();
		Person person;

		for (PersonRequest personRequest : request) {
			person = requestToModelGenerateId(personRequest);
			persons.add(person);
		}

		return persons;
	}

	public static Person requestToModel(@Valid PersonIdRequest request) {
		Person person = new Person();

		person.setId(request.getId());
		person.setAge(request.getAge());
		person.setName(request.getName());
		person.setSex(request.getSex());

		if (!request.isHasKids()) {
			person.setHasKids(false);
			person.setNumKids(0);
		} else {
			person.setHasKids(true);
			person.setNumKids(request.getNumKids());
		}

		return person;
	}

	public static List<Person> requestsToModels(List<PersonIdRequest> request) {
		List<Person> persons = new ArrayList<>();
		Person person;

		for (PersonIdRequest personRequest : request) {
			person = requestToModel(personRequest);
			persons.add(person);
		}

		return persons;
	}
}
