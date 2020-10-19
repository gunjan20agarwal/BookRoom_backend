package com.book.bookroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.book.bookroom.model.*;
import com.book.bookroom.repo.*;

@Component
@Service
public class CityService {

	@Autowired
	private CityRepo repo;
	
	public List<City> listAll() {
        return repo.findAll();
    }
     
    public void save(City city) {
        repo.save(city);
    }
     
}
