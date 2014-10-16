package com.oracle.pts;

import com.oracle.pts.custom.AttributeEntry;
import com.oracle.pts.custom.CustomFieldHolder;
import com.oracle.pts.custom.DataSet;
import com.oracle.pts.custom.client.SalesPartyClient;

import com.oracle.pts.salesparty.wsclient.generated.SalesParty;

import java.io.IOException;
import java.io.PrintWriter;

import java.util.List;

import javax.servlet.*;
import javax.servlet.http.*;

public class TestServlet extends HttpServlet {
    private static final String CONTENT_TYPE = "text/html; charset=windows-1252";

    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    public void service(HttpServletRequest request,
                        HttpServletResponse response) throws ServletException,
                                                             IOException {
        
        
        response.setContentType(CONTENT_TYPE);
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head><title>TestServlet</title></head>");
        out.println("<body>");
        out.println("<p>The servlet has received a GET. This is the reply.</p>");
 
        SalesPartyClient salesPartyClient = new SalesPartyClient();
        
        SalesParty salesParty = salesPartyClient.findSalesPartyByName("MyTestCustomer");
        
        CustomFieldHolder  customFieldHolder = new CustomFieldHolder();
        customFieldHolder.printCustomFieldHolder();
        CustomFieldHolder mCustomFieldHolder = new CustomFieldHolder();
        String mObjectName = "SalesAccount";
        DataSet dataSet = mCustomFieldHolder.getDecendentDataSet(mObjectName);

        
       out.println( "<p>objectName: " + mObjectName  + "</p>");
       if(salesParty!=null){
        out.println( "<p>partyName: " + salesParty.getPartyName().getValue()  + "</p>");
       }
        if(dataSet!=null){
            for(AttributeEntry attributeEntry:dataSet.getAttributeList()){
                out.println( "<p>name: " + attributeEntry.getName()  + "</p>");
                out.println("<p>value: " + attributeEntry.getValue()+ "</p>");
            }
        }

        out.println("</body></html>");
        out.close();

    }
}
