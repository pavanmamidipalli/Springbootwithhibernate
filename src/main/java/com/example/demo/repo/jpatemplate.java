package com.example.demo.repo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.course.course002;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class jpatemplate {
	@Autowired
	EntityManager entity;
	public void insert(course002 Course) {
		entity.merge(Course);
	}
    public void delete(course002 Course) {
    	entity.remove("2");
    }
}
