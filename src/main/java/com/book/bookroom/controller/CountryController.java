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

import com.book.bookroom.model.Country;
import com.book.bookroom.service.CountryService;

@CrossOrigin
@RestController
public class CountryController {


	@Autowired 
	private CountryService service;
	
	@GetMapping("/country")
    public List<Country> list() {
        return service.listAll();
    }
	
	@PostMapping("/country")
	public ResponseEntity<Country> save(@RequestBody Country country){
		
		service.save(country);
        return new ResponseEntity<Country>(HttpStatus.OK);
	}
	
}
