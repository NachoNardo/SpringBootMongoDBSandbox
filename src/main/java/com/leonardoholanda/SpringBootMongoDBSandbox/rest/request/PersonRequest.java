package com.leonardoholanda.SpringBootMongoDBSandbox.rest.request;

import java.util.Objects;
import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class PersonRequest {

	@NotBlank(message = "Field \"name\" is required.")
	private String name;
	@NotNull(message = "Field \"age\" is required.")
	private Integer age;
	@NotBlank(message = "Field \"sex\" is required.")
	private String sex;
	@NotNull(message = "Field \"hasKids\" is required.")
	private boolean hasKids;
	@NotNull(message = "Field \"numKids\" is required.")
	private int numKids;

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

	public PersonRequest() {
		super();
	}
	
	public PersonRequest(@NotBlank(message = "Field \"name\" is required.") String name,
			@NotNull(message = "Field \"age\" is required.") Integer age,
			@NotBlank(message = "Field \"sex\" is required.") String sex,
			@NotNull(message = "Field \"hasKids\" is required.") boolean hasKids,
			@NotNull(message = "Field \"numKids\" is required.") int numKids) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.hasKids = hasKids;
		this.numKids = numKids;
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, hasKids, name, numKids, sex);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonRequest other = (PersonRequest) obj;
		return Objects.equals(age, other.age) && hasKids == other.hasKids && Objects.equals(name, other.name)
				&& numKids == other.numKids && Objects.equals(sex, other.sex);
	}

	@Override
	public String toString() {
		return "PersonRequest [name=" + name + ", age=" + age + ", sex=" + sex + ", hasKids=" + hasKids + ", numKids="
				+ numKids + "]";
	}
}
