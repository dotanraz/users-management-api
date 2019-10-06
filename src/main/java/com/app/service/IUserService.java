package com.app.service;

import com.app.model.User;
import java.util.List;

public interface IUserService {

    void createUserTableIfNotExist() throws Exception;
    void addUser(User user) throws Exception;
    Object getUser(int id) throws Exception;
    List<User> getAllUsers() throws Exception;
    void updateUser(int id, User user) throws Exception;
    void deleteUser(int id) throws Exception;

}
