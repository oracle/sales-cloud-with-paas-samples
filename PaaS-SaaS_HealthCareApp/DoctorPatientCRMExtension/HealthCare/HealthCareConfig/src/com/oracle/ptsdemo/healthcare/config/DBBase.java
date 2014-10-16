package com.oracle.ptsdemo.healthcare.config;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;


/**
 */
public class DBBase {
    
    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(DBBase.class);
    
    private Connection connection;

    /**
     */
    public static final boolean useCloud = true;


    /**
     */
    public DBBase() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }    
    }

    /**
     * @return
     */
    protected Connection getConnection() {
        if (logger.isDebugEnabled()) {
            logger.debug("getConnection()");
        }
        Connection connection = getDataSourceDBConnection();
      //       Connection connection = getDirectDBConnection();
        return connection;
    }

    private Connection getDataSourceDBConnection() {
        
        if (logger.isDebugEnabled()) {
            logger.debug("getDataSourceDBConnection()");
        }
        
            try {
                String jndiName = null;
                if(useCloud==true){
                  //  ResourceBundle res = ResourceBundle.getBundle("config");
                   
                    System.out.println("********************Cloud*****************");
                    //jndiName = res.getString("DS_JNDI_NAME");
                //    jndiName = res.getString("database");
            //    jndiName = "database";
              //  jndiName = "javatrial4598db";
                jndiName = FusionConfig.getInstance().getProperty("datasource");

                }
                else{
                    System.out.println("********************Simluated Cloud*****************");
                    jndiName = "jdbc/fusionappDS";
                }
            
    
    
                 Context context = new InitialContext();
                javax.sql.DataSource ds =
                 (javax.sql.DataSource)context.lookup(jndiName); // It seems it works without configuring any description file
                           connection = ds.getConnection();

            } catch (SQLException e) {
              //   
              logger.error("getDataSourceDBConnection - Error retrieving connection", e);
                connection = getDirectDBConnection();
            } catch (Exception e) {
                logger.error("getDataSourceDBConnection - Error retrieving connection", e);
                connection = getDirectDBConnection();
            //    
            }
        
        
    
            return connection;
      
    }

    private Connection getDirectDBConnection() {
    logger.debug("Getting direct DB Connection");
        if (connection == null) {
            try {

                String driverName = "oracle.jdbc.driver.OracleDriver";
                Class.forName(driverName);

                String serverName = "127.0.0.1";
                String portNumber = "1521";
                String sid = "XE";
                String url =
                    "jdbc:oracle:thin:@" + serverName + ":" + portNumber +
                    ":" + sid;
              //  String username = "marketo";
              //  String password = "welcome1";
                String username = "hr";
               // String password = "Welcome1";
                String password = "welcome1";
                connection =
                        DriverManager.getConnection(url, username, password);

            } catch (ClassNotFoundException e) {
                 
            } catch (SQLException e) {
                 
            }
        }
        logger.debug("Connection = "+connection);
        return connection;

    }

    /**
     * @param connection
     */
    protected void releaseConnection(Connection connection){
        if (logger.isDebugEnabled()) {
            logger.debug("releaseConnection()");
        }
        
        try {
            if(connection!=null){
            connection.close();
            }
        } catch (SQLException e) {
            logger.error("releaseConnection(Connection connection) - Error releasing connection", e);
        }
    }

}
