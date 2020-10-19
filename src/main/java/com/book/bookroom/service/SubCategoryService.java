package com.book.bookroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.book.bookroom.model.*;
import com.book.bookroom.repo.*;

@Component
@Service
public class SubCategoryService {

	@Autowired
	private SubCategoryRepo repo;
	
	public List<SubCategory> listAll() {
        return repo.findAll();
    }
     
    public void save(SubCategory Category) {
        repo.save(Category);
    }
     
    public SubCategory get(int id) {
        return repo.findById(id).get();
    }
    
    public void delete(int id) {
        repo.deleteById(id);
    }
}
