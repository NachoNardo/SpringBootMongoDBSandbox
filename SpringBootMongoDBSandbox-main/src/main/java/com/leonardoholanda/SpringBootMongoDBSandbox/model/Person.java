package com.leonardoholanda.SpringBootMongoDBSandbox.model;

import java.util.Objects;
import java.util.UUID;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Person {

	@Id
	private UUID id;
	private String name;
	private Integer age;
	private String sex;
	private boolean hasKids;
	private int numKids;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public boolean isHasKids() {
		return hasKids;
	}

	public void setHasKids(boolean hasKids) {
		this.hasKids = hasKids;
	}

	public int getNumKids() {
		return numKids;
	}

	public void setNumKids(int numKids) {
		this.numKids = numKids;
	}

	public Person(UUID id, String name, Integer age, String sex, boolean hasKids, int numKids) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.hasKids = hasKids;
		this.numKids = numKids;
	}

	public Person() {
		super();
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + ", sex=" + sex + ", hasKids=" + hasKids
				+ ", numKids=" + numKids + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, hasKids, id, name, numKids, sex);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(age, other.age) && hasKids == other.hasKids && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name) && numKids == other.numKids && Objects.equals(sex, other.sex);
	}

}
