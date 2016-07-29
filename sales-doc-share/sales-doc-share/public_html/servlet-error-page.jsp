<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<%@ page errorPage="true" contentType="text/html;charset=UTF-8"
         import="java.io.*"%>
 
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <title>Sales Cloud Integration with Document Cloud Service - ERROR</title>
  </head>
  <body>
    <h1>Sales Cloud Fusion Applications and Document Cloud Integration ERROR</h1>
    <table>
      <tr style="color:white; background-color:red;" align="left">
        <td>Error</td>
        <td>
          <%=request.getAttribute("javax.servlet.error.exception")%>
        </td>
      </tr>
    </table>
    <p>
      Usage: For SSO enabled SalesCloud and JCS-SX env
      https://&lt;javaserverhostname&gt;/FusionCloudDocCloudServlet//doccloud?objecttype= 
      <strong>&lt;objecttype</strong>&gt;&amp;objectnumber=<strong>&lt;objectnumber&gt;</strong>&amp;jwt=<strong>&lt;JWTToken&gt;</strong>
    </p>
    <p>&nbsp;</p>
    <p>
      Usage: Oracle Internal Env
      https://&lt;javaserverhostname&gt;/FusionCloudDocCloudServlet//doccloud?objecttype= 
      <strong>&lt;objecttype</strong>&gt;&amp;objectnumber=<strong>&lt;objectnumber&gt;</strong>&amp;jwt=<strong>&lt;JWTToken&gt;</strong>&amp;username=<strong>&lt;username&gt;</strong>
    </p>
    <p>&nbsp;</p>
    <h2>Parameters</h2>
    <table cellspacing="2" cellpadding="3" border="1" width="93%">
      <tr align="left">
        <th>Servlet Parameter</th>
        <th>Mandatory?</th>
        <th>Value Passed</th>
        <th>Description</th>
      </tr>
      <tr>
        <td>jwt</td>
        <td>yes</td>
        <td><%=request.getParameter("jwt")%></td>
        <td>JWT Token</td>
      </tr><tr>
        <td>objectNumber</td>
        <td>yes</td>
        <td><%=request.getParameter("objectnumber")%></td>
        <td>ObjectNumber in Fusion Applications. E.g. OpportunityNumber,
            PartyNumber etc</td>
      </tr><tr>
        <td>type</td>
        <td>yes</td>
        <td><%=request.getParameter("objecttype")%></td>
        <td>OPPORTUNITY | ACCOUNT | CONTACT</td>
      </tr><tr>
        <td>username</td>
        <td>yes (For Oracle Internal Env only)</td>
        <td><%=request.getParameter("username")%></td>
        <td>
          <p>
            Username of user using groovy script 
            <br/>
          </p>
          <p>def username=adf.context.getSecurityContext().getUsername()</p>
        </td>
      </tr>
    </table>
    <hr></hr>
    <%
    Exception e = (Exception) request.getAttribute("javax.servlet.error.exception");
    e.printStackTrace(new java.io.PrintWriter(out));
  %>
  </body>
</html>