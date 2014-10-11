<%-- 
    Document   : result
    Created on : Jan 15, 2013, 6:14:00 PM
    Author     : Casey
--%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" import="java.util.*"%>
<!DOCTYPE HTML>
<html>
    <head>
        <link href="WineCSS.css" rel="stylesheet" type="text/css" />
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Wine Recommendation</title>
    </head>
    <body>
        <p><img src="Pictures/wine.jpg" alt="Wine" /></p>
        <h1>Wine Recommendations JSP</h1>
        <p>
            <%
                List styles = (List) request.getAttribute("styles");
                Iterator it = styles.iterator();
                while (it.hasNext()) {
                    out.print("<br/> Try: " + it.next());
                }
            %>
        </p>
        <p>Click <a href="wine_form.html">here</a> to go back!</p>
    </body>
</html>