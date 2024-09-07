package com.project.books.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.books.entities.Books;

public interface BooksRepository extends JpaRepository<Books, Long>{
	
}
