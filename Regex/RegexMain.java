package Regex;

import java.beans.Statement;
import java.sql.*;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.management.Query;

public class RegexMain {
  public static void main (String[] args) {
    Pattern pattern = Pattern.compile("It");

    Matcher matcher = pattern.matcher("it");

    try {
      Class.forName("oracle.jdbc.driver.oracleDriver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }

    try {
      Connection con = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:xe", "user", "password"
      );
      java.sql.Statement stmt = con.createStatement();

      ResultSet qry = stmt.executeQuery("Select * from");

      con.close();
    } catch (SQLException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

    
    System.out.println(matcher);
  }
}
