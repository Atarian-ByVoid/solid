package com.beto.solid.logs.action;

import org.springframework.stereotype.Service;

import com.beto.solid.logs.UserLog;
import com.beto.solid.logs.repository.UserLogRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserLogAction {

    private final UserLogRepository userLogRepository;

    public void createLog(UserLog log) {
        userLogRepository.save(log);

    }

    
}
