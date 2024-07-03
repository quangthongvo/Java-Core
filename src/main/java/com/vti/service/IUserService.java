package com.vti.service;

import com.vti.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    List<User> findByProjectId(int projectId);

    List<User> findAllManager() ;

    User findManagerByEmailAndPassword(String email, String password);
}
