package com.project.rentalday.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.rentalday.entitities.Payment;
import com.project.rentalday.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
	
	@Autowired
	private PaymentService service;
	
	@GetMapping(value = "/{BooksId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long BooksId, @PathVariable Integer days){
		Payment payment = service.getPayment(BooksId, days);
		return ResponseEntity.ok(payment);
		
	}
}
