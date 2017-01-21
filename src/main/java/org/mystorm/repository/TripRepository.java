package org.mystorm.repository;

import java.util.List;

import org.mystorm.model.Trip;
import org.mystorm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Long>  {
	 List<User> findByTrip(Trip user); 
}
