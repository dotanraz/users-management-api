package com.app;

import com.app.model.User;
import com.app.service.IUserService;
import com.app.service.UserServiceImpl;
import com.app.testData.DataGenerator;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Ignore
	@Test
	public void contextLoads() throws SQLException, IOException {

		logger.info("test start");
		IUserService userService = new UserServiceImpl();
		int lastId;
		if (userService.getAllUsers() == null) {
			lastId = 0;
		} else {
			lastId = userService.getAllUsers().size();
		}

		DataGenerator dataGenerator = new DataGenerator();
		for (int i = lastId; i < lastId + 10; i++) {
			User user = dataGenerator.getUser(i);
			userService.addUser(user);
		}

		List<User> allUsers = userService.getAllUsers();
		for (int i = 0; i < allUsers.size(); i++) {
			String firstName = allUsers.get(i).getFirstName();
			String lastName = allUsers.get(i).getLastName();

			logger.info("first name: " + firstName);
			logger.info("last name: " + lastName);
		}
	}

}
