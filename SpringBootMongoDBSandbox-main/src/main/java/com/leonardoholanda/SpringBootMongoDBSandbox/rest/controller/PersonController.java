package com.leonardoholanda.SpringBootMongoDBSandbox.rest.controller;

import java.util.List;
import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.leonardoholanda.SpringBootMongoDBSandbox.model.Person;
import com.leonardoholanda.SpringBootMongoDBSandbox.rest.mapping.PersonMapper;
import com.leonardoholanda.SpringBootMongoDBSandbox.rest.request.IdsRequest;
import com.leonardoholanda.SpringBootMongoDBSandbox.rest.request.PersonIdRequest;
import com.leonardoholanda.SpringBootMongoDBSandbox.rest.request.PersonRequest;
import com.leonardoholanda.SpringBootMongoDBSandbox.service.PersonService;

@RestController
@RequestMapping(value = "/")
public class PersonController {

	@Autowired
	private PersonService personService;
	
	@PostMapping
	public Person save(@Valid @RequestBody PersonRequest request) {
		return personService.save(PersonMapper.requestToModelGenerateId(request));
	}
	
	@PostMapping("/all")
	public List<Person> saveAll(@Valid @RequestBody List<PersonRequest> request) {
		return personService.saveAll(PersonMapper.requestsToModelsGenerateId(request));
	}

	@GetMapping
	public Person findById(@RequestParam UUID id) {
		return personService.findById(id);
	}

	@GetMapping("/all")
	public List<Person> findAll() {
		return personService.findAll();
	}

	@PatchMapping
	public Person update(@Valid @RequestBody PersonIdRequest request) {
		return personService.update(PersonMapper.requestToModel(request));
	}
	
	@PatchMapping("/all")
	public List<Person> updateAll(@Valid @RequestBody List<PersonIdRequest> request) {
		return personService.updateAll(PersonMapper.requestsToModels(request));
	}
	
	@DeleteMapping
	public String deleteById(@Valid @RequestParam UUID id) {
		personService.deleteById(id);
		return "{}";
	}

	@DeleteMapping("/all/ids")
	public String deleteAllById(@Valid @RequestBody IdsRequest ids) {
		personService.deleteAllById(ids.getIds());
		return "{}";
	}
	
	@DeleteMapping("/all")
	public String deleteAll() {
		personService.deleteAll();
		return "{}";
	}
}
