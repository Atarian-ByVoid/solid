package com.beto.solid.infra.model.validation;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserValidation {
    private String name;
    private String email;
    private String password;
    private Date birthday;

}
