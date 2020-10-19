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

import com.book.bookroom.model.Author;
import com.book.bookroom.service.AuthorService;

@CrossOrigin
@RestController
public class AuthorController {


	@Autowired 
	private AuthorService service;
	
	@GetMapping("/author")
    public List<Author> list() {
        return service.listAll();
    }
	
	@PostMapping("/author")
	public ResponseEntity<Author> save(@RequestBody Author author){
		
		service.save(author);
        return new ResponseEntity<Author>(HttpStatus.OK);
	}
	
}
