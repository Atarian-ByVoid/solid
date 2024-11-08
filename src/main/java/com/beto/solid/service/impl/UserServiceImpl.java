package com.beto.solid.service.impl;

import org.springframework.stereotype.Service;

import com.beto.solid.infra.model.User;
import com.beto.solid.infra.model.validation.UserValidation;
import com.beto.solid.infra.repository.UserRepository;
import com.beto.solid.infra.representation.UserDTO;
import com.beto.solid.mapper.UserMapper;
import com.beto.solid.service.UserService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public UserDTO createUser(UserValidation body) {
        return userMapper.toDTO(userRepository.save(userMapper.toEntity(body)));
    }
}
