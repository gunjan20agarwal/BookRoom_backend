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

import com.book.bookroom.model.City;
import com.book.bookroom.service.CityService;

@CrossOrigin
@RestController
public class CityController {


	@Autowired 
	private CityService service;
	
	@GetMapping("/city")
    public List<City> list() {
        return service.listAll();
    }
	
	@PostMapping("/city")
	public ResponseEntity<City> save(@RequestBody City city){
		
		service.save(city);
        return new ResponseEntity<City>(HttpStatus.OK);
	}
	
}
