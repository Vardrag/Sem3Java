package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class DB_connection
{
	
    public ResultSet DB_connection(String strSql) throws SQLException
    {
          
    try
    {
        // Treiberklasse laden
      Class.forName( "org.hsqldb.jdbc.JDBCDriver" );
    }
    catch ( ClassNotFoundException e )
    {
      System.err.println( "Treiberklasse nicht gefunden!" );
      return null;
    }
  
    Connection con = null;
    
      con = DriverManager.getConnection( 
              "jdbc:hsqldb:file:WebContent/HSQLDB/hsqldb-2.3.1/hsqldb; shutdown=true", "root", "root" );
      Statement stmt = con.createStatement();
  
      // Alle Kunden ausgeben
      ResultSet rs = stmt.executeQuery(strSql);
        
      // Statement schlie�en
      stmt.close();

    {
      if ( con != null )
      {
        try {
            con.close();
            } catch ( SQLException e ) {
                e.printStackTrace();
            }
      }
    }
    return rs;
    }

}
