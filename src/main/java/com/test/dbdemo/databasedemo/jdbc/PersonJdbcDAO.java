package com.test.dbdemo.databasedemo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.test.dbdemo.databasedemo.entity.Person;

@Repository // talks to the DB
public class PersonJdbcDAO {

	// need to use JdbcTemplate to execute a query
	@Autowired // use Spring to autowire it
	JdbcTemplate jdbcTemplate;

	// select * from person
	public List<Person> findAll() {
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper<Person>(Person.class));
	}
	// select person by id
	public Person findById(int id) {
		return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] {id},  new BeanPropertyRowMapper<Person>(Person.class));
	}
}
