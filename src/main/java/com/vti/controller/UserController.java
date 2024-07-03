package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class UserController {
    private IUserService service;
    public List<User> findByProjectId(int projectId){
        return service.findByProjectId(projectId);
    }
    public List<User> findAllManager(){
        return service.findAllManager();
    }
    public User findManagerByEmailAndPassword(String email, String password){
        return service.findManagerByEmailAndPassword(email, password);
    }
}
