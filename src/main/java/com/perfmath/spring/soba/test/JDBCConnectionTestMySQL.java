package com.perfmath.spring.soba.test;
import java.sql.*;

public class JDBCConnectionTestMySQL
{
    public static void main (String[] args)
    {
        Connection conn = null;

        try
        {
            String userName = "sobaadmin";
            String password = "sobaadmin";
            String url = "jdbc:mysql://localhost:3306/soba";
            Class.forName ("com.mysql.jdbc.Driver").newInstance ();
            conn = DriverManager.getConnection (url, userName, password);
            System.out.println ("Database connection established");
        }
        catch (Exception e)
        {
            System.err.println ("Cannot connect to database server: " + e.getMessage());
        }
        finally
        {
            if (conn != null)
            {
                try
                {
                    conn.close ();
                    System.out.println ("Database connection terminated");
                }
                catch (Exception e) { /* ignore close errors */ }
            }
        }
    }
}
