package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class DB_connection
{
	public String sql = "SELECT * FROM Customer";
	
    public DB_connection()
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
      ResultSet rs = stmt.executeQuery(sql);
  
      while ( rs.next() )
      {
        String id = rs.getString(1);
        String firstName = rs.getString(2);
        String lastName = rs.getString(3);
        System.out.println(id + ", " + firstName + " " + lastName);
      }
       
      // Resultset schlieﬂen
      rs.close();
  
      // Statement schlieﬂen
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

}
