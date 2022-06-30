package com.fullstackdemo.fullsatckdemo1.repositary;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fullstackdemo.fullsatckdemo1.model.Books;

public interface Booksrepo  extends JpaRepository<Books, Integer>{

}
