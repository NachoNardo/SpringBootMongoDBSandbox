package com.leonardoholanda.SpringBootMongoDBSandbox.model;

import java.util.Objects;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Book {

	@Id
	private Integer id;
	private String name;
	private String subject;
	private Integer pages;
	private Boolean readed;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getPages() {
		return pages;
	}

	public void setPages(Integer pages) {
		this.pages = pages;
	}

	public Boolean getReaded() {
		return readed;
	}

	public void setReaded(Boolean readed) {
		this.readed = readed;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name, pages, readed, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(id, other.id) && Objects.equals(name, other.name) && Objects.equals(pages, other.pages)
				&& Objects.equals(readed, other.readed) && Objects.equals(subject, other.subject);
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", subject=" + subject + ", pages=" + pages + ", readed=" + readed
				+ "]";
	}

	public Book(Integer id, String name, String subject, Integer pages, Boolean readed) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.pages = pages;
		this.readed = readed;
	}

	public Book() {
		super();
	}
}
