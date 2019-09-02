package com.example.work.user;


import java.util.List;

import com.example.work.user.models.Users;
import com.example.work.user.repositories.UserRepository;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class UserController {
    /**
     *
     */
    
    private static final String HTTP_LOCALHOST_4200 = "http://localhost:4200";
    @Autowired
    private UserRepository repository;

    // GET
    // URI /
    // method "allUser"
    

    @CrossOrigin(origins = HTTP_LOCALHOST_4200)
    @GetMapping(path = "/")
    public List<Users> allUser(){
        return repository.findAll(Sort.by(Sort.Direction.ASC, "firstname"));
    }
    @CrossOrigin(origins = HTTP_LOCALHOST_4200)
    @PostMapping(value="/store_user")
    public Users createUser(@RequestBody Users users) {
        users.set_id(ObjectId.get());
        repository.save(users);
        return users;
    }

    @GetMapping(value ="get_user_details/{id}")
    public Users getUserDetails(@PathVariable("id") String id) {
        return repository.findBy_id(id);
    }
    
        
}