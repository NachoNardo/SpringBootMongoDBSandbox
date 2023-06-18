package com.leonardoholanda.SpringBootMongoDBSandbox.rest.request;

import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class BookRequest {

	@NotBlank(message = "Field \"name\" is required.")
	private String name;
	@NotBlank(message = "Field \"subject\" is required.")
	private String subject;
	@NotNull(message = "Field \"pages\" is required.")
	private Integer pages;
	@NotNull(message = "Field \"readed\" is required.")
	private Boolean readed;

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
		return Objects.hash(name, pages, readed, subject);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		BookRequest other = (BookRequest) obj;
		return Objects.equals(name, other.name) && Objects.equals(pages, other.pages)
				&& Objects.equals(readed, other.readed) && Objects.equals(subject, other.subject);
	}

	public BookRequest(@NotBlank(message = "Field \"name\" is required.") String name,
			@NotBlank(message = "Field \"subject\" is required.") String subject,
			@NotNull(message = "Field \"pages\" is required.") Integer pages,
			@NotNull(message = "Field \"readed\" is required.") Boolean readed) {
		super();
		this.name = name;
		this.subject = subject;
		this.pages = pages;
		this.readed = readed;
	}

	public BookRequest() {
		super();
	}

	@Override
	public String toString() {
		return "BookRequest [name=" + name + ", subject=" + subject + ", pages=" + pages + ", readed=" + readed + "]";
	}
}
