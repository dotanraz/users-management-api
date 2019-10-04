package com.app.sql;

import com.app.environment.EnvConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection {

    private static final Logger logger = LoggerFactory.getLogger(PostgresConnection.class);
    private static PostgresConnection instance = null;
    private Connection connection;

    public static PostgresConnection getInstance() throws SQLException {
        if (instance == null)
            instance = new PostgresConnection();
        return instance;
    }


    private PostgresConnection() throws SQLException {
            this.connection  = DriverManager.getConnection(
                    EnvConstants.POSTGRES_PATH,
                    EnvConstants.POSTGRES_USERNAME,
                    EnvConstants.POSTGRES_PASSWORD);

        if (connection != null) {
            logger.info("Connected to the database!");
        } else {
            logger.info("Failed to make connection!");
        }

    }

    public void close() throws SQLException {
        this.connection.close();
    }

    private void createEmptableIfNotExist() throws SQLException {

    }

    public Connection getConnection() {
        return connection;
    }
}
