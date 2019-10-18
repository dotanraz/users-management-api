package com.app.testData;

import com.app.service.IUserService;
import com.app.service.UserServiceImpl;
import java.sql.SQLException;

public class RandomDataUserInjection {

    public static void injectUsers(int numOfUsers) throws SQLException {
        IUserService userService = new UserServiceImpl();
        int lastId;
        if (userService.getAllUsers() == null) {
            lastId = 0;
        } else {
            lastId = userService.getAllUsers().size();
        }

        DataGenerator dataGenerator = new DataGenerator();
        for (int i = lastId; i < lastId + numOfUsers; i++) {
            userService.addUser(dataGenerator.getUser(i));
        }
    }

}
