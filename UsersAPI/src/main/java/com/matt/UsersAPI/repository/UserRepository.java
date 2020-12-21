package com.matt.UsersAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.matt.UsersAPI.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
	
	User findByState(String state);

}
