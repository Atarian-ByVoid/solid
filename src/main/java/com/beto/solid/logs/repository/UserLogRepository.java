package com.beto.solid.logs.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.beto.solid.logs.UserLog;

@Repository
public interface UserLogRepository extends MongoRepository<UserLog, String> {
    
}
