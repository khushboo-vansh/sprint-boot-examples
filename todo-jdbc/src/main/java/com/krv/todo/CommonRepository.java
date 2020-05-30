package com.krv.todo;

import java.util.List;

public interface CommonRepository<T> {

	ToDo save(ToDo domains);

	void delete(ToDo domain);

	ToDo findById(String id);

	List<ToDo> findAll();

}
