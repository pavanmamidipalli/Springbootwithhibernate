package com.example.demo.command;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.course.course002;

import com.example.demo.repo.jpatemplate;
@Component
public class commandline implements CommandLineRunner{
	@Autowired
   jpatemplate tem;
	
	@Override
	public void run(String... args) throws Exception {
		
		tem.insert(new course002(1,"pavan","gdk"));
		tem.insert(new course002(2,"hello","hyd"));
	
	}   

}
