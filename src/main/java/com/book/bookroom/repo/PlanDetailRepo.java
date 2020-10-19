package com.book.bookroom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.bookroom.model.*;

@Repository("planDetailRepository")
public interface PlanDetailRepo extends JpaRepository<Plan_Details, Integer>{

	
}