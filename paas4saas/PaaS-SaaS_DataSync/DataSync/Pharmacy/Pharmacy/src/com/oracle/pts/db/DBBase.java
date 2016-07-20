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
    public static final boolean useCloud = true;
    public DBBase() {
        super();
    }

    protected Connection getConnection() {
        Connection connection = getDataSourceDBConnection();
        return connection;
    }

    private Connection getDataSourceDBConnection() {
System.out.println("********************getDataSourceDBConnection in Pharmacy App*****************");
//        if (connection == null) {
            if (true) {
            try {
                String jndiName = null;
                if(useCloud==true){
                  //  ResourceBundle res = ResourceBundle.getBundle("config");
                   
                    System.out.println("********************Cloud*****************");
                    //jndiName = res.getString("DS_JNDI_NAME");
                //    jndiName = res.getString("database");
            //    jndiName = "database";
                    //jndiName = "javatrial4598db";
                    jndiName = FusionConfig.getInstance().getProperty("datasource");                }
                else{
                    System.out.println("********************Simluated Cloud*****************");
                    jndiName = "jdbc/fusionappDS";
                }
            
                 Context context = new InitialContext();
                javax.sql.DataSource ds =
                (javax.sql.DataSource)context.lookup(jndiName); // It seems it works without configuring any description file
                           connection = ds.getConnection();


            } catch (SQLException e) {
                e.printStackTrace();
               
            } catch (Exception e) {
                
              e.printStackTrace();
            }
        }
        
    
            return connection;
      
    }


    protected void releaseConnection(Connection connection){
        try {
            if(connection!=null){
            connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    protected String getSystemGeneratedNumber(){
        String returnString = String.valueOf(System.currentTimeMillis());
        return returnString;
    }
    protected int getRandomNumber(int num){
        Random generator = new Random(System.currentTimeMillis());
        int randomNumber = generator.nextInt(num);
        return randomNumber;
    }
    protected long getRandomNumberFixLength() {
        Random r = new Random(System.currentTimeMillis());
        return 1000000000L + r.nextInt(2000000000);
    }
    protected boolean convertStringToBoolean(String pValue){
        boolean returnValue = false;
        if(pValue.equals("T")){
            returnValue = true;
        }
        return returnValue;
        
    }
    protected  String convertBooleanToString(boolean pValue){
        String returnValue = "F";
        if(pValue==true){
            returnValue = "T";
        }
        return returnValue;
        
    }
}
