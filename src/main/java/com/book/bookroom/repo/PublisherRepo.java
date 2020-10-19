package com.book.bookroom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.bookroom.model.*;

@Repository("publisherRepository")
public interface PublisherRepo extends JpaRepository<Publisher, Integer>{

}