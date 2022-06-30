package com.fullstackdemo.fullsatckdemo1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.CorsRegistration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.fullstackdemo.fullsatckdemo1.model.Books;
import com.fullstackdemo.fullsatckdemo1.service.Booksservice;


@SpringBootApplication
@EnableWebMvc  // it is addded with extend webmvcconf to avoid cors policy error in angular
public class Fullsatckdemo1Application extends WebMvcConfigurerAdapter   {
	@Autowired
	Booksservice booksservice;
	public static void main(String[] args) {
		SpringApplication.run(Fullsatckdemo1Application.class, args);
	System.out.println("main file started");
	
	}
	
	@Override // this method to avoid cors policy
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**");
		
	}
//	@Autowired
//Booksservice booksservice;
//	@Override
//	public void run(String... args) throws Exception {
//	
//		Books books=Books.builder().id(1).name("mine").author("vishwa").build();
//		booksservice.addbook(books);
//		
//		List<Books> book=booksservice.getbook();
//		for(Books temp:book) {
//			System.out.println(temp);
//		}
//	}
	

}
