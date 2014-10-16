package com.oracle.pts.db;


import com.oracle.pts.vo.ConfigVO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.logging.Logger;


public class ConfigDB  extends DBBase {
    
    Logger logger = Logger.getLogger("CRM");
   
    public ConfigDB() {
        super();
        logger.info( " : constructor");
         
    }
    public void save(ConfigVO configVO) {
            logger.info( "void save(ConfigVO configVO)");
       
        
        
        Connection connection = getConnection();

        
        for (String name : configVO.getNameValueList().keySet()) {

            String value = configVO.getNameValueList().get(name);

                boolean recordExist = recordExist(name);
                
                if (recordExist == false) {
                System.out.println("name " + name);
                    create(name,value);
                } else {
                    System.out.println("name: value ----------  " + name + " " + value);
                   update(name,value);
                }
            
        }
        //  connection.
    }

    public boolean recordExist(String name) {
            logger.info(" : boolean recordExist(String name)");
        
        
        boolean recordExist = false;
        String sql =
            "select conf_name, conf_value from fusion_config where conf_name = ?   ";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);

            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                recordExist = true;

            }
        } catch (SQLException e) {
            e.printStackTrace();
            logger.info("boolean recordExist(String name) - error selecting from fusion_config" +  e.getMessage());
            
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
                logger.info("boolean recordExist(String name) - error closing result set or statement" + e.getMessage());
            }
            releaseConnection(connection);
        }
        return recordExist;
    }

    public void create(String name,String value) {
            logger.info( " : void create(String name,String value)");
        
        
        
        String sql =
            "INSERT INTO fusion_config (conf_name, conf_value) VALUES(?,?)";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, name);
            pstmt.setString(2, value);

            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
            logger.info( " : void create(String name,String value) - error inserting into fusion_config" );
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
                logger.info( " : void create(String name,String value) - error closing statement");
            }
            releaseConnection(connection);
        }
    }

    public void update(String name,String value) {
            logger.info( " : void update(String name,String value)");
        
       String sql =
        "UPDATE fusion_config SET conf_value=? where conf_name=? ";


        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, value);
            pstmt.setString(2, name);

            pstmt.executeUpdate();


            //pstmt.close();

        } catch (SQLException e) {
            e.printStackTrace();
            logger.info( " : void update(String name,String value) - error updating fusion_config" + e.getMessage());
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
                logger.info(" : void update(String name,String value) - error closing statement" + e.getMessage());
            }
            releaseConnection(connection);
        }


    }
    public String getValue(String name){
     
            logger.info(" : String getValue(String name)");
     


        String value = null;


        String sql = "select conf_value from fusion_config where conf_name = ? ";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            pstmt = connection.prepareStatement(sql);
          
            pstmt.setString(1, name);

            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {

              
                value = resultSet.getString("conf_value");
               

            }
        } catch (SQLException e) {
            e.printStackTrace();
            logger.info( " : String getValue(String name) - error selecting from fusion_config" + e.getMessage());
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                logger.info(" : String getValue(String name) - error closing statement or result set" +  e.getMessage());
            }
            releaseConnection(connection);
        }

        return value;
        
    }
    public ConfigVO getConfigVO() {
             logger.info( " : ConfigVO getConfigVO()");
       
        
        ConfigVO configVO = new ConfigVO();


        String sql = "select conf_name, conf_value from fusion_config  ";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            pstmt = connection.prepareStatement(sql);
          

            resultSet = pstmt.executeQuery();
            while (resultSet.next()) {

               String name = resultSet.getString("conf_name");
                String value = resultSet.getString("conf_value");
                configVO.getNameValueList().put(name, value);

            }
        } catch (SQLException e) {
            e.printStackTrace();
            logger.info( " : ConfigVO getConfigVO() - error selecting from fusion_config" + e.getMessage());
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
                logger.info( " : ConfigVO getConfigVO() - error closing statement" +  e.getMessage());
            }
            releaseConnection(connection);
        }

        return configVO;
    }
    
    
}
