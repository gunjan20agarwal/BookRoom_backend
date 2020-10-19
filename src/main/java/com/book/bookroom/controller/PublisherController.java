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

import com.book.bookroom.model.Publisher;
import com.book.bookroom.service.PublisherService;

@CrossOrigin
@RestController
public class PublisherController {


	@Autowired 
	private PublisherService service;
	
	@GetMapping("/publisher")
    public List<Publisher> list() {
        return service.listAll();
    }
	
	@PostMapping("/publisher")
	public ResponseEntity<Publisher> save(@RequestBody Publisher publisher){
		
		service.save(publisher);
        return new ResponseEntity<Publisher>(HttpStatus.OK);
	}
	
}
