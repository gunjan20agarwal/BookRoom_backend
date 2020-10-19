package com.book.bookroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.book.bookroom.model.*;
import com.book.bookroom.repo.*;

@Component
@Service
public class CategoryService {

	@Autowired
	private CategoryRepo repo;
	
	public List<Category> listAll() {
        return repo.findAll();
    }
     
    public void save(Category Category) {
        repo.save(Category);
    }
     
    public Category get(int id) {
        return repo.findById(id).get();
    }
    
    public void delete(int id) {
        repo.deleteById(id);
    }
}
