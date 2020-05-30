package com.krv.todo;

import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Table(name = "todo")
@Entity
public class ToDo {

	@Id
	@NotNull
	@Column(name = "id")
	private String id;

	@NotNull
	@Column(name = "description")
	private String description;

	@Column(name = "created")
	private LocalDateTime created;

	@Column(name = "modified")
	private LocalDateTime modified;

	@Column(name = "completed")
	private boolean completed;

	public ToDo() {
		LocalDateTime date = LocalDateTime.now();
		this.id = UUID.randomUUID().toString();
		this.created = date;
		this.modified = date;
	}

	public ToDo(String description) {
		this();
		this.description = description;
	}
}
