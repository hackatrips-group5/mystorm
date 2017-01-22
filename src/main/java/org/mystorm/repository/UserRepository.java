package org.mystorm.repository;


import java.util.List;

import org.mystorm.model.Trip;
import org.mystorm.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "user", path = "user")
public interface UserRepository extends CrudRepository<User, Long>  {
	List<User> findAll();
	List<User> findById(Long id);
	
	User save(User user);
}
