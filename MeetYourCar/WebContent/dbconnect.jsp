<%@ page language="java" 
           import="java.sql.Connection,
                   java.sql.DriverManager,
                   java.sql.ResultSet,
                   java.sql.Statement" %>

<%!
  String title = "Database Test";
  String database = ""; 
  String sql = "SELECT *";
  Connection connection = null;
  Statement statement = null;
  ResultSet resultSet = null;
%>

<%
  try {
    database = application.getRealPath("/database/demobase");
  
    Class.forName("org.hsqldb.jdbcDriver");
    connection = DriverManager.getConnection("jdbc:hsqldb:file:WebContent/HSQLDB/hsqldb-2.3.1/hsqldb; shutdown=true", "root", "root");
  
    statement = connection.createStatement();
    resultSet = statement.executeQuery(sql);
  }
  catch (Exception e) {
    out.print("Unable do make connection database<br>");
    out.print(e);
  }
%>

<html>
  <head>
    <title><%=title%></title>
  </head>

  <body>

  <h1><%=title%></h1>

  <h2>Bookmarks</h2>

  <ul>

    <% while (resultSet.next()) { %>
      <li><a href="<%=resultSet.getObject("Name")%>"><%=
          resultSet.getObject("title")%></a></li>
    <% } %>
  </ul>

  </body> 
</html>

<%
  resultSet.close();
  statement.close();
  connection.close();
%>