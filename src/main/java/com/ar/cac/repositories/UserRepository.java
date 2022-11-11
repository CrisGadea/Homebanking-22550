package com.ar.cac.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ar.cac.Models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

}
