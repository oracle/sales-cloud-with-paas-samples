package com.oracle.ptsdemo.healthcare.config;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 */
public class ConfigDB  extends DBBase {
    
    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(ConfigDB.class);

    /**
     */
    public ConfigDB() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : constructor");
        }   
    }

    /**
     * @param configVO
     */
    public void save(ConfigVO configVO) {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : void save(ConfigVO configVO)");
        }
        
        
        Connection connection = getConnection();

        
        for (String name : configVO.getNameValueList().keySet()) {

            String value = configVO.getNameValueList().get(name);

                boolean recordExist = recordExist(name);
                
                if (!recordExist) {
                System.out.println("name " + name);
                    create(name,value);
                } else {
                    System.out.println("name: value ----------  " + name + " " + value);
                   update(name,value);
                }
            
        }
        //  connection.
    }

    /**
     * @param name
     * @return
     */
    public boolean recordExist(String name) {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : boolean recordExist(String name)");
        }
        
        
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
            logger.error("boolean recordExist(String name) - error selecting from fusion_config", e);
            
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                logger.error("boolean recordExist(String name) - error closing result set or statement", e);
            }
            releaseConnection(connection);
        }
        return recordExist;
    }

    /**
     * @param name
     * @param value
     */
    public void create(String name,String value) {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : void create(String name,String value)");
        }
        
        
        
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
            logger.error(this.getClass().getName() + " : void create(String name,String value) - error inserting into fusion_config", e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error(this.getClass().getName() + " : void create(String name,String value) - error closing statement", e);
            }
            releaseConnection(connection);
        }
    }

    /**
     * @param name
     * @param value
     */
    public void update(String name,String value) {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : void update(String name,String value)");
        }
        
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
            logger.error(this.getClass().getName() + " : void update(String name,String value) - error updating fusion_config", e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error(this.getClass().getName() + " : void update(String name,String value) - error closing statement", e);
            }
            releaseConnection(connection);
        }


    }

    /**
     * @param name
     * @return
     */
    public String getValue(String name){
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : String getValue(String name)");
        }


        String value = null;


        String sql = "select conf_value from fusion_config where name = ? ";

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
            logger.error(this.getClass().getName() + " : String getValue(String name) - error selecting from fusion_config", e);
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                logger.error(this.getClass().getName() + " : String getValue(String name) - error closing statement or result set", e);
            }
            releaseConnection(connection);
        }

        return value;
        
    }

    /**
     * @return
     */
    public ConfigVO getConfigVO() {
        if (logger.isDebugEnabled()) {
            logger.debug(this.getClass().getName() + " : ConfigVO getConfigVO()");
        }
        
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
            logger.error(this.getClass().getName() + " : ConfigVO getConfigVO() - error selecting from fusion_config", e);
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                logger.error(this.getClass().getName() + " : ConfigVO getConfigVO() - error closing statement", e);
            }
            releaseConnection(connection);
        }

        return configVO;
    }
    
    
}
