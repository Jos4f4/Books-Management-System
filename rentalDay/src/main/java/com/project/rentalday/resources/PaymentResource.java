package com.project.rentalday.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.project.rentalday.entitities.Payment;
import com.project.rentalday.services.PaymentService;

@RestController
@RequestMapping(value = "/payments")
public class PaymentResource {
	
	@Autowired
	private PaymentService service;
	
	@HystrixCommand(fallbackMethod = "getPaymentAlternative")
	@GetMapping(value = "/{BooksId}/days/{days}")
	public ResponseEntity<Payment> getPayment(@PathVariable Long BooksId, @PathVariable Integer days){
		Payment payment = service.getPayment(BooksId, days);
		return ResponseEntity.ok(payment);
	}
	
	public ResponseEntity<Payment> getPaymentAlternative(Long BooksId, Integer days){
		Payment payment = new Payment("Livro Padrão", "Tipo Padrão", 100.0, days);
		return ResponseEntity.ok(payment);
	}
}
	