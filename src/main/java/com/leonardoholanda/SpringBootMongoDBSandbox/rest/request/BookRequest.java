package com.leonardoholanda.SpringBootMongoDBSandbox.rest.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
public class BookRequest {

	@NotBlank(message = "Field \"name\" is required.")
	private String name;
	@NotBlank(message = "Field \"subject\" is required.")
	private String subject;
	@NotNull(message = "Field \"pages\" is required.")
	private Integer pages;
	@NotNull(message = "Field \"readed\" is required.")
	private Boolean readed;	
}
