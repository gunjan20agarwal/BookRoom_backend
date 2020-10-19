package com.book.bookroom.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.book.bookroom.model.Category;
import com.book.bookroom.service.CategoryService;


@CrossOrigin
@RestController
public class CategoryController {

	@Autowired 
	private CategoryService service;
	
	@GetMapping("/category")
    public List<Category> list() {
        return service.listAll();
    }
	
	@PostMapping("/category")
	@PutMapping("/category/{id}")
	public ResponseEntity<Category> save(@RequestBody Category category){
		
		service.save(category);
        return new ResponseEntity<Category>(HttpStatus.OK);
	}
	
    public ResponseEntity<?> update(@RequestBody Category category, @PathVariable int id) {
        try {
            Category existCategory = service.get(id);
            service.save(category);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }      
    }
	
	@DeleteMapping("/category/{id}")
    public void delete(@PathVariable int id) {
    	service.delete(id);
    }
	
	
	
}
