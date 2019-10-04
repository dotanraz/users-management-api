package com.app.controller;

import com.app.model.User;
import com.app.service.IUserService;
import com.app.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.sql.SQLException;
import java.util.List;
import java.util.UUID;


@RequestMapping("api/v1/users")
@RestController
public class UserController {

    private IUserService userService = new UserServiceImpl();

    @Autowired
    public UserController() throws SQLException {

    }

    @GetMapping
    public Object getAllUsers() throws SQLException {
        if (userService.getAllUsers() == null) {
            return "there are no users in the system";
        }
        else return userService.getAllUsers();
    }

    @GetMapping(path = "{id}")
    public Object getUserById(@PathVariable("id")int id) throws SQLException {
        if (userService.getUser(id) == null) {
            return "no user with that id!";
        }
        else return userService.getUser(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user) throws SQLException {
        userService.addUser(user);
    }

}
