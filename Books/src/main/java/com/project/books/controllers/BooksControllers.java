/*package com.project.books.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.project.books.entities.Books;
import com.project.books.resources.BooksResource;

@RestController
@RequestMapping("/books")
public class BooksControllers{

		@Autowired
		private BooksResource service;
		///private PersonServices service = new PersonServices();
		
		@RequestMapping(method=RequestMethod.GET,
				produces = MediaType.APPLICATION_JSON_VALUE)
		public List<Books> findAll() {
			return service.findAll();
		}
		
		@RequestMapping(value = "/{id}",
				method=RequestMethod.GET,
				produces = MediaType.APPLICATION_JSON_VALUE)
		public Books findById(@PathVariable(value = "id") Long id) {
			return service.findById(id);
		}
		
		@RequestMapping(method=RequestMethod.POST,
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.APPLICATION_JSON_VALUE)
		public Books create(@RequestBody Books books) {
			return service.create(books);
		}
		
		@RequestMapping(method=RequestMethod.PUT,
				consumes = MediaType.APPLICATION_JSON_VALUE,
				produces = MediaType.APPLICATION_JSON_VALUE)
		public Books update(@RequestBody Books books) {
			return service.update(books);
		}
		
		
		@RequestMapping(value = "/{id}",
				method=RequestMethod.DELETE)
		public void delete(@PathVariable(value = "id") Long id) {
			service.delete(id);
		}
}*/