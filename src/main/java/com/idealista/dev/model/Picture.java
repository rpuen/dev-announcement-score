package com.idealista.dev.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class Picture {

	@Id
	private int id;
	private String url;
	private String quality;
	
}
