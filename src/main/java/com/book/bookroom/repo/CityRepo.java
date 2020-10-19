package com.book.bookroom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.book.bookroom.model.*;


@Repository("cityRepository")
public interface CityRepo extends JpaRepository<City, Integer>{

}