package com3.example.repository;
import org.springframework.data.mongodb.repository.MongoRepository;

import com2.example.model.User;


public interface UserRepository extends MongoRepository<User, String> {

    public User findOneByName(String name);




}