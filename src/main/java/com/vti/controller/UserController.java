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

    public List<User> findEmployeeAndManagerByprojectId(int projectId){
            return service.findEmployeeAndManagerByProjectId(projectId);
        }
    public  User findAdminByEmailAndPassword(String email, String password) {
        return service.findAdminByEmailAndPassword(email, password);
    }
    public int create(String fullName, String email) {
        return service.create(fullName, email);
    }



}
