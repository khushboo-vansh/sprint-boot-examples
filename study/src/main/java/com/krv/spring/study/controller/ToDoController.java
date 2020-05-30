package com.krv.spring.study.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.krv.spring.study.entity.ToDoEntity;
import com.krv.spring.study.repository.ToDoRepository;

@Controller
@RequestMapping("/")
public class ToDoController {

	@Autowired
	private ToDoRepository repository;

	@GetMapping(value = "/home")
	public ModelAndView index(ModelAndView modelAndView, HttpServletRequest request) {
		modelAndView.setViewName("index");
		return modelAndView;
	}

	@RequestMapping(value = "/toDos", method = { RequestMethod.GET }, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ToDoEntity>> getToDos(@RequestHeader HttpHeaders headers) {
		List<ToDoEntity> response = repository.findAll();
		return ResponseEntity.ok(response);
	}

}