package com.book.bookroom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.bookroom.model.Loan_Status;
import com.book.bookroom.service.LoanStatusService;

@CrossOrigin
@RestController
public class LoanStatusController {


	@Autowired 
	private LoanStatusService service;
	
	@GetMapping("/loan_status")
    public List<Loan_Status> list() {
        return service.listAll();
    }
	
	@PostMapping("/loan_status")
	public ResponseEntity<Loan_Status> save(@RequestBody Loan_Status loan_status){
		
		service.save(loan_status);
        return new ResponseEntity<Loan_Status>(HttpStatus.OK);
	}
	
}
