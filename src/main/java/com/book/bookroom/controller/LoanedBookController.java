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

import com.book.bookroom.model.Loaned_Book;
import com.book.bookroom.service.LoanedBookService;

@CrossOrigin
@RestController
public class LoanedBookController {


	@Autowired 
	private LoanedBookService service;
	
	@GetMapping("/loaned_book")
    public List<Loaned_Book> list() {
        return service.listAll();
    }
	
	@PostMapping("/loaned_book")
	public ResponseEntity<Loaned_Book> save(@RequestBody Loaned_Book loaned_book){
		
		service.save(loaned_book);
        return new ResponseEntity<Loaned_Book>(HttpStatus.OK);
	}
	
}
