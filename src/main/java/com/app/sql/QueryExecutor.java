package com.app.sql;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapListHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.beans.PropertyVetoException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class QueryExecutor {

    private static final Logger logger = LoggerFactory.getLogger(QueryExecutor.class);

    public static void executeQuery(String query) throws SQLException, IOException, PropertyVetoException {
        logger.trace("going to execute query:\n" + query);
        PreparedStatement ps = PostgresDbConnection.getInstance().getConnection().prepareStatement(query);
        ps.executeUpdate();
        ps.close();
    }

    public static List<Map<String, Object>> executeQueryWithResults(String query) throws SQLException, IOException, PropertyVetoException {
        logger.trace("going to execute query:\n" + query);
        MapListHandler beanListHandler = new MapListHandler();
        QueryRunner runner = new QueryRunner();
        List<Map<String, Object>> list
                = runner.query(PostgresDbConnection.getInstance().getConnection(), query, beanListHandler);
        return list;
    }

}
