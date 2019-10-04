package com.app;

import com.app.model.User;
import com.app.service.IUserService;
import com.app.service.UserServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;
import java.util.List;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	public void contextLoads() throws SQLException {

		logger.info("this is a logger test");
		User user = new User();
		user.setFirstName("somefirtName");
		user.setLastName("someLastName");
		IUserService userService = new UserServiceImpl();
		logger.info("adding user to db");
		userService.addUser(user);
		List<User> allUsers = userService.getAllUsers();
		User user1 = userService.getUser(1);

	}

}
