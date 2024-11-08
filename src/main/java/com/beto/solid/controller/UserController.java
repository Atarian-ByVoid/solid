package com.beto.solid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.beto.solid.infra.model.User;
import com.beto.solid.infra.model.validation.UserValidation;
import com.beto.solid.infra.representation.UserDTO;
import com.beto.solid.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDTO> createUser(@RequestBody UserValidation body) {
        return ResponseEntity.ok(userService.createUser(body));
    }
    

    // @GetMapping("/{id}")
    // public ResponseEntity<User> getUserById(@PathVariable Long id) {
    //     User user = userService.getUserById(id);
    //     return ResponseEntity.ok(user);
    // }

    // @GetMapping
    // public ResponseEntity<List<User>> getAllUsers() {
    //     List<User> users = userService.getAllUsers();
    //     return ResponseEntity.ok(users);
    // }
    
}
