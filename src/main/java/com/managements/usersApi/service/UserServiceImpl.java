package com.managements.usersApi.service;

import com.managements.usersApi.model.User;
import com.managements.usersApi.sql.PostgresConnection;
import com.managements.usersApi.sql.QueryExecutor;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class UserServiceImpl implements IUserService{
    private Connection connection = PostgresConnection.getInstance().getConnection();

    public UserServiceImpl() throws SQLException {
        createUserTableIfNotExist();
    }

    @Override
    public void createUserTableIfNotExist() throws SQLException {
        String query = "CREATE TABLE IF NOT EXISTS USERS " +
                "(ID serial, FIRST_NAME varchar(100) NOT NULL, " +
                "LAST_NAME varchar(100) NOT NULL)";
        QueryExecutor.executeQuery(query);
    }

    @Override
    public void addUser(User user) throws SQLException {
        String query = String.format("INSERT INTO USERS(FIRST_NAME,LAST_NAME) "
                + "VALUES('%s','%s')", user.getFirstName(), user.getLastName());
        QueryExecutor.executeQuery(query);
    }

    @Override
    public void getUser(int id) {

    }

    @Override
    public List<Map<String, Object>> getAllUsers() throws SQLException {
        String query = "SELECT * FROM USERS";
        return QueryExecutor.executeQueryWithResults(query);
    }

    @Override
    public void updateUser(int id, User user) {

    }

    @Override
    public void deleteUser(int id) {

    }

}
