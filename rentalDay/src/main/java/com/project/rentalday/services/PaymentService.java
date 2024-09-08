package com.project.rentalday.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.project.rentalday.entitities.Books;
import com.project.rentalday.entitities.Payment;

@Service
public class PaymentService {
	
	@Value("${books.host}")
	private String booksHost;

	@Autowired
	private RestTemplate restTemplate;
	
	
	public Payment getPayment(long BooksId, int days) {
		//return new Payment("Pai Pobre, Pai rico", "Economia", 10.0, 10);
		
		Map<String, String> uriVariables = new HashMap<>();
		uriVariables.put("id", ""+BooksId);
		
		Books books = restTemplate.getForObject(booksHost + "/books/{id}", Books.class, uriVariables);
		return new Payment(books.getName(), books.getGender(), books.getRentalday(), days);
	}
}
