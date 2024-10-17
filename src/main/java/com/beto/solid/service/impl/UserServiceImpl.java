package com.beto.solid.service.impl;

import org.springframework.stereotype.Service;

import com.beto.solid.infra.model.User;
import com.beto.solid.infra.repository.UserRepository;
import com.beto.solid.infra.representation.UserDTO;
import com.beto.solid.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public void createUser(UserDTO userDTO) {
        User user = new User();
        user.setName(userDTO.getName());
        user.setEmail(userDTO.getEmail());
        userRepository.save(user);
    }
}
