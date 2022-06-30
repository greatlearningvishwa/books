package com.fullstackdemo.fullsatckdemo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fullstackdemo.fullsatckdemo1.model.Books;
import com.fullstackdemo.fullsatckdemo1.service.Booksservice;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class Bookscontroller {

@Autowired	
	Booksservice service;

@GetMapping("/")
public String home() {
	return "welcome to home page";
}

     @GetMapping("/addbook")
	public String addbook(int id,String name,String author) {
	Books book1=Books.builder().id(id).name(name).author(author).build();
	service.addbook(book1);
	// foll is added to get the list in console in angular 
//	 List<Books> book=service.getbook();
//	 
//	return book; 
	return "added";
		}
	
     @GetMapping("/get")
	public List<Books> getbooks() {
	 List<Books> book=service.getbook();
	 return book;
	 
	}
     @GetMapping("/deletebook")
     public String deletebook(int id) {
    	 service.deletebook(id);
    	 return "deleted";
     }
}
