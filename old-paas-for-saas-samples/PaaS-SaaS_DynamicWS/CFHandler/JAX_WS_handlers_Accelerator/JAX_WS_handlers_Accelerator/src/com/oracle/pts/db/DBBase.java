package com.oracle.pts.db;

import com.oracle.pts.config.FusionConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.util.Properties;

import java.util.Random;
import java.util.ResourceBundle;

import javax.annotation.Resource;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import javax.sql.DataSource;

public class DBBase {
    private Connection connection;

    public DBBase() {
        super();
    }

    protected Connection getConnection() {
        Connection connection = getDataSourceDBConnection();
        return connection;
    }

    private Connection getDataSourceDBConnection() {

        try {
            String jndiName = null;


            jndiName = FusionConfig.getInstance().getProperty("datasource");


            Context context = new InitialContext();
            javax.sql.DataSource ds =

                (javax.sql.DataSource)context.lookup(jndiName);
            connection = ds.getConnection();


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


        return connection;

    }


    protected void releaseConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
