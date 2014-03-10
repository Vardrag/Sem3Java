package myServlets;

import java.sql.*;

public class DbConn {

   private Connection connection;

   // Parameter  f�r den DBMS.Zugriff
   // String driver = "";
   // String url = "";
   // String user = "";
   // String pw = "";

   public DbConn(String driver, String url, 
                  String user, String pw)throws Exception 
   { 

    // Initialisieren der Datenbank-Verbindung
    // Laden des Datenbank-Treibers �ber den ClassLoader
    Class.forName(driver);

    // Aufbau der Datenbank-Verbindung
    connection = DriverManager.getConnection(url, user, pw);

   } 

   public ResultSet select(String sql) throws SQLException {

     ResultSet rs = null;
     Statement stmt = connection.createStatement();
     rs = stmt.executeQuery(sql);

     return rs;
   }

   public int dml(String sql) throws SQLException {

     Statement stmt = connection.createStatement();
     int n = stmt.executeUpdate(sql);
     return n;
   }

  public void closeDb()  throws SQLException {
      connection.close();
  }   
}
