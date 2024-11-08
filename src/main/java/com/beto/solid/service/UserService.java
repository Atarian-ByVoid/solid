package com.beto.solid.service;

import com.beto.solid.infra.model.validation.UserValidation;
import com.beto.solid.infra.representation.UserDTO;

public interface UserService {
    UserDTO createUser(UserValidation body);
}
