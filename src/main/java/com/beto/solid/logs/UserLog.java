package com.beto.solid.logs;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "user_log")
public class UserLog {
    @Id
    private String id;
    private String name;
    private String action;
    
}
