<!-- Copyright © 2015, Oracle and/or its affiliates. All rights reserved -->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ page contentType="text/html;charset=windows-1252"%>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=windows-1252"/>
    <script src="https://code.angularjs.org/1.2.8/angular.min.js"></script>
    <title>dealer-feedback</title>
     <link rel="stylesheet" type="text/css" href="css/dealer-feedback.css">
  </head>
  <body ng-app="myapp" ng-controller="DealerController">  
  <%
        response.setHeader("X-Frame-Options","SAMEORIGIN");
  %>
  <div align="right" style="width:90%; font-size:medium;">logged in as <%=request.getUserPrincipal()%></div>
  <%      
    if (request.isUserInRole("dealerManager")) {
  %>        
        <jsp:include page="resources/manager.jsp" />
<%
    }
    else if (request.isUserInRole("dealer")) {
%>
        <jsp:include page="resources/dealer.jsp" />
<%
    }
    else {
        out.println("unknown role");
    }
%>
  </body>
</html>