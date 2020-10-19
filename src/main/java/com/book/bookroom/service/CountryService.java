package com.book.bookroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.book.bookroom.model.*;
import com.book.bookroom.repo.*;

@Component
@Service
public class CountryService {

	@Autowired
	private CountryRepo repo;
	
	public List<Country> listAll() {
        return repo.findAll();
    }
     
    public void save(Country country) {
        repo.save(country);
    }
     
}
