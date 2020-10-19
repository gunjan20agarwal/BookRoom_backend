package com.book.bookroom.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.book.bookroom.model.*;
import com.book.bookroom.repo.*;

@Component
@Service
public class PlanDetailService {

	@Autowired
	private PlanDetailRepo repo;
	
	public List<Plan_Details> listAll() {
        return repo.findAll();
    }
     
    public void save(Plan_Details planDetails) {
        repo.save(planDetails);
    }
     
    public Plan_Details get(int id) {
        return repo.findById(id).get();
    }
    
    public void delete(int id) {
        repo.deleteById(id);
    }
}
