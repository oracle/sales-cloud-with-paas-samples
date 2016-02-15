package com.oracle.pts.db;

import com.oracle.pts.vo.MappingAttr;
import com.oracle.pts.vo.MappingObj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MappingObjDB extends DBBase {
    private static final Logger logger =
        Logger.getLogger("CRM");
    public MappingObjDB() {
        super();
    }

    public void save(MappingObj mappingObj) {
        System.out.println("db.mappingObj.length***************** " +
                           mappingObj.getMappingAttrList().size());
        Connection connection = getConnection();

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
                if (recordExist == false) {
                System.out.println("targetAttr create " + targetAttr);
                    create(mappingAttr);
                } else {
                    System.out.println("targetAttr update " + targetAttr + "  " + sourceAttr + " sourceObj: " + sourceObj);
                   update(mappingAttr);
                }
            }
        }
        //  connection.
    }

    public boolean recordExist(MappingAttr mappingAttr) {
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }
        return recordExist;
    }

    public boolean recordExistR(MappingAttr mappingAttr) {
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }
        return recordExist;
    }

    public void create(MappingAttr mappingAttr) {
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }
    }

    public void update(MappingAttr mappingAttr) {

        String targetObj = mappingAttr.getTargetObj();

        String targetAttr = mappingAttr.getTargetAttr();

        String sourceObj = mappingAttr.getSourceObj();

        String sourceAttr = mappingAttr.getSourceAttr();

        String defaultValue = mappingAttr.getDefaultValue();
        String sql =
      //      "UPDATE mapping_obj SET default_value = ? where  target_obj = ? and source_obj = ? and target_attr = ? and source_attr = ? ";
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


            //pstmt.close();

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }


    }

    public MappingObj getMappingObj(String targetObj) {
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
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            try {
                resultSet.close();
                pstmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            releaseConnection(connection);
        }

        return mappingObj;
    }
    public MappingObj getMappingObj(String targetObj,String parentSrcObj,String childSrcObj) {
       
        MappingObj returnMappingObj = new MappingObj();
        List<MappingAttr> mappingAttrList = new ArrayList<MappingAttr>();
        returnMappingObj.setMappingAttrList(mappingAttrList);
        MappingObj mappingObj = getMappingObj(targetObj);
               for(MappingAttr mappingAttr:mappingObj.getMappingAttrList()){
            if(mappingAttr.getSourceObj()!= null && mappingAttr.getSourceObj().equals(parentSrcObj)){
                returnMappingObj.getMappingAttrList().add(mappingAttr);
            }
            else if(mappingAttr.getSourceObj() !=null && mappingAttr.getSourceObj().equals(childSrcObj)){
                returnMappingObj.getMappingAttrList().add(mappingAttr);
            }
            else if(mappingAttr.getSourceObj()==null){
                returnMappingObj.getMappingAttrList().add(mappingAttr);
            }
        }
    
        return returnMappingObj;
    }
    public void load(){
        logger.info("loading from DB Mapping is called");
    }
   
}
