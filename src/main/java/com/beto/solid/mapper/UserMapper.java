package com.beto.solid.mapper;

import org.springframework.stereotype.Component;

import com.beto.solid.infra.model.User;
import com.beto.solid.infra.model.validation.UserValidation;
import com.beto.solid.infra.representation.UserDTO;
import com.beto.solid.logs.UserLog;

@Component
public class UserMapper {

    public User toEntity(UserValidation dto) {
        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(dto.getPassword());
        user.setBirthday(dto.getBirthday());
        return user;
    }

    public UserDTO toDTO(User entity) {
        UserDTO user = new UserDTO();
        user.setId(entity.getId());
        user.setName(entity.getName());
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        user.setBirthday(entity.getBirthday());
        return user;
    }

}
