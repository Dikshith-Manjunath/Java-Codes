<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<%@ page import="javax.sql.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Login</title>
</head>
<body>
<%
    String username = request.getParameter("user");
    String pwd = request.getParameter("pwd");
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection(
        "jdbc:mysql://localhost:3306/app", "root", "root"
    );
    Statement st = con.createStatement();
    ResultSet rs = st.executeQuery(
        "select * from login where username='" + username + "'"
    );
    if (rs.next()) {
        if (rs.getString(2).equals(pwd)) {
            session.setAttribute("user", rs.getString(1));
            String name = (String) session.getAttribute("user");
            out.println("Welcome " + name);
        } else {
            System.out.println("Invalid password try again");
        }
    }
%>
</body>
</html>