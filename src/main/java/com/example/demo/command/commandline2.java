package com.example.demo.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.course.course002;
import com.example.demo.repo.repository;
@Component
public class commandline2 implements CommandLineRunner{
   @Autowired
    private repository rep;
	@Override
	public void run(String... args) throws Exception {
		rep.save(new course002(3,"am","ameerpet"));
		
	}

}
