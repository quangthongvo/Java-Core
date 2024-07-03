package com.vti.controller;

import com.vti.entity.User;
import com.vti.service.IUserService;
import com.vti.service.UserService;
import lombok.AllArgsConstructor;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Collections;
import java.util.List;
@AllArgsConstructor
public class UserController {
    private IUserService service;
        public List<User> findEmployeeByProjectId ( int projectId){
            return service.findEmployeeByProjectId(projectId);
        }
        public List<User> findAllManager () {
            return service.findAllManager();
        }

        public User findManagerByEmailAndPassword (String email, String password){
            return service.findManagerByEmailAndPassword(email, password);
        }
    }
