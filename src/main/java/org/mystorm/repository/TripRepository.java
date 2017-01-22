package org.mystorm.repository;


import java.util.List;

import org.mystorm.model.Trip;
import org.mystorm.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "trip", path = "trip")
public interface TripRepository extends CrudRepository<Trip, Long>  {
	List<Trip> findAll();
	List<Trip> findById(Long id);
	
	List<Trip> findByUsers(User user);
}
