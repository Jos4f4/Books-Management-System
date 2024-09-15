package com.project.books.resources;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.books.entities.Books;
import com.project.books.repositories.BooksRepository;

@RestController
@RequestMapping(value = "/books")
public class BooksResource {

		//Balaceamento de carga========
		private static Logger logger = LoggerFactory.getLogger(BooksResource.class);
		@Autowired
		private Environment env;
		////Balaceamento de carga========
		
		@Autowired
		private BooksRepository repository;
		
		@GetMapping
		public ResponseEntity<List<Books>> findAll(){
			List<Books> list = repository.findAll();
			return ResponseEntity.ok(list);
		}
		
		@GetMapping(value = "/{id}")
		public ResponseEntity<Books> findById(@PathVariable Long id){
			
			//Balaceamento de carga========
			//logger.info("PORT = " + env.getProperty("local.servr.port"));
			//Balaceamento de carga========
			
			try {
				Thread.sleep(3000L);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
			logger.info("PORT = " + env.getProperty("local.server.port"));
			
			Books obj = repository.findById(id).get();
			return ResponseEntity.ok(obj);
		}
}
