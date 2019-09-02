package com.example.work.user.repositories;

import com.example.work.user.models.Users;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<Users,String>{
    Users findBy_id(String _id);
    
}