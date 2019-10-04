package com.managements.usersApi;

import com.managements.usersApi.model.User;
import com.managements.usersApi.service.IUserService;
import com.managements.usersApi.service.UserServiceImpl;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.SQLException;

//@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	private static final Logger logger = LoggerFactory.getLogger(DemoApplicationTests.class);

	@Test
	public void contextLoads() throws SQLException {

		logger.info("this is a logger test");
		User user = new User();
		user.setFirstName("avwewrwi");
		user.setLastName("hj343");
		IUserService userService = new UserServiceImpl();
		userService.addUser(user);
		userService.getAllUsers();

	}

}
