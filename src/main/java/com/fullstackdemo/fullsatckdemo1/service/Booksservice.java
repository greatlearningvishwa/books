package com.fullstackdemo.fullsatckdemo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fullstackdemo.fullsatckdemo1.model.Books;
import com.fullstackdemo.fullsatckdemo1.repositary.Booksrepo;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Booksservice {
@Autowired
	Booksrepo service;

public void addbook(Books books) {
	service.saveAndFlush(books);
	log.info("added");
}
public List<Books> getbook() {
	return service.findAll();
}
public void deletebook(int id) {
	service.delete(Books.builder().id(id).build());
	
}
}
