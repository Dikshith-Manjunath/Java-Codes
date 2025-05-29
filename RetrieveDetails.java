/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author diksh
 */

import java.sql.*;
public class RetrieveDetails{
    public static void main(String[] args){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
            ("jdbc:mysql://localhost:3306/Student","root","root");
            Statement stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery("select * from student");
            while(rs.next())
                System.out.println(rs.getString(1)+""+rs.getString(2)+" "+rs.getString(3));
            con.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
