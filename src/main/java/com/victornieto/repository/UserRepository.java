package com.victornieto.repository;

import com.victornieto.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

/**
 * Created by victor.nieto.castan on 26/06/2017.
 */
public interface UserRepository extends MongoRepository<User, Long>{
    User findById(Long id) ;
    List<User> findByName(String name) ;
}
