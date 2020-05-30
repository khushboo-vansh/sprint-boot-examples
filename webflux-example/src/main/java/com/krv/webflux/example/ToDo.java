package com.krv.webflux.example;

import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Data;

@Data
public class ToDo {
	private String id;
	private String description;
	private LocalDateTime created;
	private LocalDateTime modified;
	private boolean completed;

	public ToDo() {
		this.id = UUID.randomUUID().toString();
		this.created = LocalDateTime.now();
		this.modified = LocalDateTime.now();
	}

	public ToDo(String description) {
		this();
		this.description = description;
	}

	public ToDo(String description, boolean completed) {
		this();
		this.description = description;
		this.completed = completed;
	}
}