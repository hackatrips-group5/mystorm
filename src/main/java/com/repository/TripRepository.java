package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Trip;
import com.model.User;

public interface TripRepository extends JpaRepository<Trip, Long>  {
	 List<User> findByTrip(Trip user); 
}
