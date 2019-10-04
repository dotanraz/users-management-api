package com.managements.usersApi.service;

import com.managements.usersApi.model.User;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface IUserService {

    void createUserTableIfNotExist() throws SQLException;
    void addUser(User user) throws SQLException;
    void getUser(int id) throws SQLException;
    List<Map<String, Object>> getAllUsers() throws SQLException;
    void updateUser(int id, User user) throws SQLException;
    void deleteUser(int id) throws SQLException;

}
