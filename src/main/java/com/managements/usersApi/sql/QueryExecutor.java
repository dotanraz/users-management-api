package com.managements.usersApi.sql;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class QueryExecutor {

    private static final Logger logger = LoggerFactory.getLogger(QueryExecutor.class);

    private static Connection connection;

    static {
        try {
            connection = PostgresConnection.getInstance().getConnection();
        } catch (SQLException e) {
            logger.error(e.getMessage(), e);
        }
    }

    public static void executeQuery(String query) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(query);
        ps.executeUpdate();
        ps.close();
    }

    public static List<Map<String, Object>> executeQueryWithResults(String query) throws SQLException {
        MapListHandler beanListHandler = new MapListHandler();
        QueryRunner runner = new QueryRunner();
        List<Map<String, Object>> list
                = runner.query(connection, query, beanListHandler);
        return list;
    }
}
