package com.oracle.ptsdemo.healthcare.business.datasync.load.db;


import com.oracle.ptsdemo.healthcare.config.DBBase;
import com.oracle.ptsdemo.healthcare.business.datasync.load.MappingAttr;
import com.oracle.ptsdemo.healthcare.business.datasync.load.MappingObj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;


/**
 */
public class MappingObjDB extends DBBase {

    static org.apache.log4j.Logger logger =
        org.apache.log4j.Logger.getLogger(MappingObjDB.class);

    /**
     */
    public MappingObjDB() {
        super();
        if (logger.isDebugEnabled()) {
            logger.debug(MappingObjDB.class.getName() + " : constructor");
        }
    }

    /**
     * @param mappingObj
     */
    public void save(MappingObj mappingObj) {

        if (logger.isDebugEnabled()) {
            logger.debug(MappingObjDB.class.getName() +
                         " : void save(MappingObj mappingObj)");
        }

        for (MappingAttr mappingAttr : mappingObj.getMappingAttrList()) {

            String targetObj = mappingAttr.getTargetObj();

            String targetAttr = mappingAttr.getTargetAttr();

            String sourceObj = mappingAttr.getSourceObj();

            String sourceAttr = mappingAttr.getSourceAttr();

            String defaultValue = mappingAttr.getDefaultValue();

            if (((targetObj != null) && (targetAttr != null) &&
                 (sourceObj != null) && (sourceAttr != null)) ||
                ((targetObj != null) && (targetAttr != null) &&
                 (defaultValue != null))) {
                boolean recordExist = recordExist(mappingAttr);
                if (!recordExist ) {                
                    create(mappingAttr);
                } else {
                    update(mappingAttr);
                }
            }
        }
    }

    /**
     * @param mappingAttr
     * @return
     */
    public boolean recordExist(MappingAttr mappingAttr) {
        if (logger.isDebugEnabled()) {
            logger.debug(MappingObjDB.class.getName() +
                         " : boolean recordExist(MappingAttr mappingAttr)");
        }

        boolean recordExist = false;
        String targetObj = mappingAttr.getTargetObj();
        String targetAttr = mappingAttr.getTargetAttr();

        String sql =
            "select target_obj from mapping_obj where target_obj = ?  and target_attr = ?   ";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, targetObj);
            pstmt.setString(2, targetAttr);

            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                recordExist = true;

            }
        } catch (SQLException e) {
            logger.error(MappingObjDB.class.getName() +
                         " : boolean recordExist(MappingAttr mappingAttr) - error selecting from target_object",
                         e);
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                logger.error(MappingObjDB.class.getName() +
                             " : boolean recordExist(MappingAttr mappingAttr) - error closing statement or resultset",
                             e);
            }
            releaseConnection(connection);
        }
        return recordExist;
    }

    /**
     * @param mappingAttr
     * @return
     */
    public boolean recordExistR(MappingAttr mappingAttr) {
        if (logger.isDebugEnabled()) {
            logger.debug(MappingObjDB.class.getName() +
                         " : boolean recordExistR(MappingAttr mappingAttr)");
        }


        boolean recordExist = false;
        String targetObj = mappingAttr.getTargetObj();

        String targetAttr = mappingAttr.getTargetAttr();

        String sourceObj = mappingAttr.getSourceObj();

        String sourceAttr = mappingAttr.getSourceAttr();

        String sql =
            "select target_obj from mapping_obj where target_obj = ? and source_obj = ? and target_attr = ? and source_attr = ?  ";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, targetObj);
            pstmt.setString(2, sourceObj);
            pstmt.setString(3, targetAttr);
            pstmt.setString(4, sourceAttr);

            resultSet = pstmt.executeQuery();
            if (resultSet.next()) {
                recordExist = true;

            }
        } catch (SQLException e) {
            logger.error(MappingObjDB.class.getName() +
                         " : boolean recordExistR(MappingAttr mappingAttr) - error selecting from mapping_obj",
                         e);
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                logger.error(MappingObjDB.class.getName() +
                             " : boolean recordExistR(MappingAttr mappingAttr) - error closing statement or resultset",
                             e);
            }
            releaseConnection(connection);
        }
        return recordExist;
    }

    /**
     * @param mappingAttr
     */
    public void create(MappingAttr mappingAttr) {
        if (logger.isDebugEnabled()) {
            logger.debug(MappingObjDB.class.getName() +
                         " : void create(MappingAttr mappingAttr)");
        }


        String targetObj = mappingAttr.getTargetObj();

        String targetAttr = mappingAttr.getTargetAttr();

        String sourceObj = mappingAttr.getSourceObj();

        String sourceAttr = mappingAttr.getSourceAttr();

        String defaultValue = mappingAttr.getDefaultValue();
        String sql =
            "INSERT INTO mapping_obj (target_obj,source_obj,target_attr,source_attr,default_value) VALUES(?,?,?,?,?)";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, targetObj);
            pstmt.setString(2, sourceObj);
            pstmt.setString(3, targetAttr);
            pstmt.setString(4, sourceAttr);
            pstmt.setString(5, defaultValue);

            pstmt.executeUpdate();


            // pstmt.close();

        } catch (SQLException e) {
            logger.error(MappingObjDB.class.getName() +
                         " : void create(MappingAttr mappingAttr) - error inserting into mapping_obj",
                         e);
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                logger.error(MappingObjDB.class.getName() +
                             " : void create(MappingAttr mappingAttr) - error closing statement",
                             e);
            }
            releaseConnection(connection);
        }
    }

    /**
     * @param mappingAttr
     */
    public void update(MappingAttr mappingAttr) {
        if (logger.isDebugEnabled()) {
            logger.debug(MappingObjDB.class.getName() +
                         " : void update(MappingAttr mappingAttr)");
        }


        String targetObj = mappingAttr.getTargetObj();

        String targetAttr = mappingAttr.getTargetAttr();

        String sourceObj = mappingAttr.getSourceObj();

        String sourceAttr = mappingAttr.getSourceAttr();

        String defaultValue = mappingAttr.getDefaultValue();
        String sql =
            "UPDATE mapping_obj SET source_obj=?,source_attr=?,default_value=?  where target_obj=? and target_attr= ? ";


        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, sourceObj);
            pstmt.setString(2, sourceAttr);
            pstmt.setString(3, defaultValue);
            pstmt.setString(4, targetObj);
            pstmt.setString(5, targetAttr);

            pstmt.executeUpdate();
        } catch (SQLException e) {
            logger.error(MappingObjDB.class.getName() +
                         " : void update(MappingAttr mappingAttr) - error updating mapping_obj",
                         e);
        } finally {
            try {
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (Exception e) {
                logger.error(MappingObjDB.class.getName() +
                             " : void update(MappingAttr mappingAttr) - error closing statement",
                             e);
            }
            releaseConnection(connection);
        }


    }

    /**
     * @param targetObj
     * @return
     */
    public MappingObj getMappingObj(String targetObj) {
        if (logger.isDebugEnabled()) {
            logger.debug(MappingObjDB.class.getName() +
                         " : MappingObj getMappingObj(String targetObj) = " +
                         targetObj);
        }


        MappingObj mappingObj = new MappingObj();
        List<MappingAttr> mappingAttrList = new ArrayList<MappingAttr>();
        mappingObj.setMappingAttrList(mappingAttrList);


        String sql = "select * from mapping_obj where target_obj = ?  ";

        Connection connection = getConnection();
        PreparedStatement pstmt = null;
        ResultSet resultSet = null;

        try {
            pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, targetObj);

            resultSet = pstmt.executeQuery();
            while (resultSet.next()) {


                MappingAttr mappingAttr = new MappingAttr();
                mappingObj.getMappingAttrList().add(mappingAttr);


                mappingAttr.setTargetObj(targetObj);

                String targetAttr = resultSet.getString("target_attr");
                mappingAttr.setTargetAttr(targetAttr);

                String sourceObj = resultSet.getString("source_obj");
                mappingAttr.setSourceObj(sourceObj);

                String sourceAttr = resultSet.getString("source_attr");
                mappingAttr.setSourceAttr(sourceAttr);

                String defaultValue = resultSet.getString("default_value");
                mappingAttr.setDefaultValue(defaultValue);

            }
        } catch (SQLException e) {
            logger.error(MappingObjDB.class.getName() +
                         " : MappingObj getMappingObj(String targetObj) - error selecting from mapping_obj",
                         e);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (pstmt != null) {
                    pstmt.close();
                }
            } catch (Exception e) {
                logger.error(MappingObjDB.class.getName() +
                             " : MappingObj getMappingObj(String targetObj) - error closing statement or resultset",
                             e);
            }
            releaseConnection(connection);
        }

        return mappingObj;
    }

    /**
     * @param targetObj
     * @param parentSrcObj
     * @param childSrcObj
     * @return
     */
    public MappingObj getMappingObj(String targetObj, String parentSrcObj,
                                    String childSrcObj) {
        if (logger.isDebugEnabled()) {
            logger.debug(MappingObjDB.class.getName() +
                         " : MappingObj getMappingObj(String targetObj, String parentSrcObj, String childSrcObj)");
        }

        MappingObj returnMappingObj = new MappingObj();
        List<MappingAttr> mappingAttrList = new ArrayList<MappingAttr>();
        returnMappingObj.setMappingAttrList(mappingAttrList);

        MappingObj mappingObj = getMappingObj(targetObj);
        for (MappingAttr mappingAttr : mappingObj.getMappingAttrList()) {
            if (mappingAttr.getSourceObj() != null &&
                mappingAttr.getSourceObj().equals(parentSrcObj)) {
                returnMappingObj.getMappingAttrList().add(mappingAttr);
            } else if (mappingAttr.getSourceObj() != null &&
                       mappingAttr.getSourceObj().equals(childSrcObj)) {
                returnMappingObj.getMappingAttrList().add(mappingAttr);
            } else if (mappingAttr.getSourceObj() == null) {
                returnMappingObj.getMappingAttrList().add(mappingAttr);
            }
        }

        return returnMappingObj;
    }


}
