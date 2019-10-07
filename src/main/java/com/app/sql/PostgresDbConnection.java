package com.app.sql;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.app.environment.EnvConstants;
import org.apache.commons.dbcp2.BasicDataSource;

public class PostgresDbConnection {

    private static PostgresDbConnection datasource;
    private BasicDataSource ds;

    private PostgresDbConnection() {
        ds = new BasicDataSource();
        ds.setUsername(EnvConstants.POSTGRES_USERNAME);
        ds.setPassword(EnvConstants.POSTGRES_PASSWORD);
        ds.setUrl(EnvConstants.POSTGRES_PATH);

        // the settings below are optional -- dbcp can work with defaults
        ds.setMinIdle(5);
        ds.setMaxIdle(20);
        ds.setMaxOpenPreparedStatements(180);

    }

    public static PostgresDbConnection getInstance() throws IOException, SQLException, PropertyVetoException {
        if (datasource == null) {
            datasource = new PostgresDbConnection();
            return datasource;
        } else {
            return datasource;
        }
    }

    public Connection getConnection() throws SQLException {
        return this.ds.getConnection();
    }

}
