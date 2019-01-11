package com.idealista.dev.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;

@Document
@Data
public class Announcement {
	
	@Id
	private int id;
	private String description;
	private int houseSize;
	private List<Integer> pictures;

}
