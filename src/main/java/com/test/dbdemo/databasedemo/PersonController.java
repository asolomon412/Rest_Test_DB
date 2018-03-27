package com.test.dbdemo.databasedemo;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.dbdemo.databasedemo.entity.Person;
import com.test.dbdemo.databasedemo.jdbc.PersonJdbcDAO;

@RestController
public class PersonController {
	
	@Autowired
	PersonJdbcDAO dao;
	
	@GetMapping("/")
	public List<List<Person>> listAllBooks() {
		
		return Arrays.asList(dao.findAll());
	}
	@GetMapping("/personid")
	public List<Person> listById(@RequestParam("id")int id) {
		
		return Arrays.asList(dao.findById(id));
	}
}
