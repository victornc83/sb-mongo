package com.victornieto.controller;

import com.victornieto.model.User;
import com.victornieto.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by victor.nieto.castan on 26/06/2017.
 */
@RestController
@RequestMapping("/api/v1/user")
public class UserController {

    @Autowired
    private UserRepository repository ;

    @GetMapping("/")
    public List<User> getUsers() {
        return (List<User>) repository.findAll() ;
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id){
        return repository.findById(id) ;
    }

    @PostMapping("/")
    public User addUser(@RequestBody User user) {
        return repository.save(user) ;
    }

    @DeleteMapping("/")
    public ResponseEntity delUser(@RequestBody User user){
        try {
            repository.delete(user);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/")
    public User updateUser(@RequestBody User user){
        return repository.save(user) ;
    }
}
