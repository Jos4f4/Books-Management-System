package com.project.rentalday.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.project.rentalday.entitities.Books;

@Component
@FeignClient(name = "Books", path = "/books")
public interface BooksFeignClient {
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Books> findById(@PathVariable Long id);
}
