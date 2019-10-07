package com.app.controller;

import com.app.environment.YAMLConfig;
import com.app.model.User;
import com.app.service.IUserService;
import com.app.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RequestMapping("api/v1/users")
@RestController
public class UserController {

    private IUserService userService = new UserServiceImpl();

    @Autowired
    public UserController() throws Exception {

    }

    @GetMapping
    public Object getAllUsers() throws Exception {
        List<User> allUsers = userService.getAllUsers();
        if (allUsers == null) {
            return "there are no users in the system";
        }
        else return allUsers;
    }

    @GetMapping(path = "{id}")
    public Object getUserById(@PathVariable("id")int id) throws Exception {
        if (userService.getUser(id) == null) {
            return "no user with that id!";
        }
        else return userService.getUser(id);
    }

    @PostMapping
    public void addUser(@RequestBody User user) throws Exception {
        userService.addUser(user);
    }

    @DeleteMapping(path = "{id}")
    public void deleteUser(@PathVariable("id")int id) throws Exception {
        userService.deleteUser(id);
    }

    @PostMapping(path = "{id}")
    public void updateUser(@PathVariable("id")int id, @RequestBody User user) throws Exception {
        userService.updateUser(id, user);
    }

}
