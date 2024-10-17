package com.beto.solid.infra.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.beto.solid.infra.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    
}
