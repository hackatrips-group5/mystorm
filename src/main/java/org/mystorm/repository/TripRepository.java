package org.mystorm.repository;


import java.util.List;

import org.mystorm.model.Trip;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "trip", path = "trip")
public interface TripRepository extends CrudRepository<Trip, Long>  {
	List<Trip> findById(Long id);
}
