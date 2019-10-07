package com.app.service;

import com.app.model.User;
import java.sql.SQLException;
import java.util.List;

public interface IUserService {

    void createUserTableIfNotExist() throws SQLException;
    void addUser(User user) throws SQLException;
    Object getUser(int id) throws SQLException;
    List<User> getAllUsers() throws SQLException;
    void updateUser(int id, User user) throws SQLException;
    void deleteUser(int id) throws SQLException;

}
