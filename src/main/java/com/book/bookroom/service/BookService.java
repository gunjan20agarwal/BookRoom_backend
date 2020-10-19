package com.book.bookroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.book.bookroom.model.*;
import com.book.bookroom.repo.*;

@Component
@Service
public class BookService {

	@Autowired
	private BookRepo repo;
	
	public List<Book> listAll() {
        return repo.findAll();
    }
     
    public void save(Book book) {
        repo.save(book);
    }
    
    public Book get(int id) {
        return repo.findById(id).get();
    }
    
    public List<Book> getBySubCategory(int id) {
        return repo.findBySubCategoryId(id);
    }
    
    public void delete(int id) {
        repo.deleteById(id);
    }
     
}
