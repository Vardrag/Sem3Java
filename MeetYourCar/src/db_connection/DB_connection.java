package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class DB_connection
{
	public ResultSet rs;
    public DB_connection(String sql)
    {
          
    try
    {
        // Treiberklasse laden
    	Class.forName( "org.hsqldb.jdbc.JDBCDriver" );
    }
    catch ( ClassNotFoundException e )
    {
      System.err.println( "Treiberklasse nicht gefunden!" );
      return;
    }
  
    Connection con = null;
  
    try
    {
      con = DriverManager.getConnection( 
    		  "jdbc:hsqldb:file:WebContent/HSQLDB/hsqldb-2.3.1/hsqldb; shutdown=true", "root", "root" );
      Statement stmt = con.createStatement();
  
      // Alle Kunden ausgeben

      rs = stmt.executeQuery(sql);
       
      // Resultset schlie�en
      rs.close();
  
      // Statement schlie�en
      stmt.close();
    }
    catch ( SQLException e )
    {
      e.printStackTrace();
    }
    finally
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
    }
     
   public static void main(String args)
    {
        new DB_connection(args);
    }

}