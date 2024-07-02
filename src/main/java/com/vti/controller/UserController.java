package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import com.vti.service.UserService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;

public class UserController {
    private IUserService service;

    public UserController(UserService service) {
    }
    public List<User> findEmployeeAndManagerByprojectId(int projectId){
            return service.findEmployeeAndManagerByProjectId(projectId);
        }
    public User findById(int id) {
        return service.findById(id);
    }
    public  User findAdminByEmailAndPassword(String email, String password) {
        return service.findAdminByEmailAndPassword(email, password);
    }
    public int create(String fullName, String email) {
        return service.create(fullName, email);
    }
    public int deleteById(int id) {
        return service.deleteById(id);
    }


}
