package com.beto.solid.service;

import com.beto.solid.infra.representation.UserDTO;

public interface UserService {
    void createUser(UserDTO userDTO);
}
