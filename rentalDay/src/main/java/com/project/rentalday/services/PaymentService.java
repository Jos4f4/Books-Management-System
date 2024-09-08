package com.project.rentalday.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.rentalday.entitities.Books;
import com.project.rentalday.entitities.Payment;
import com.project.rentalday.feignclients.BooksFeignClient;

@Service
public class PaymentService {
	
	//@Value("${books.host}")
	//private String booksHost;

	//@Autowired
	//private RestTemplate restTemplate;
	
	@Autowired
	private BooksFeignClient booksFeignClient;
	
	public Payment getPayment(long BooksId, int days) {
		//return new Payment("Pai Pobre, Pai rico", "Economia", 10.0, 10);
		
		//Map<String, String> uriVariables = new HashMap<>();
		//uriVariables.put("id", ""+BooksId);
		
		Books books = booksFeignClient.findById(BooksId).getBody();
		return new Payment(books.getName(), books.getGender(), books.getRentalday(), days);
	}
}
