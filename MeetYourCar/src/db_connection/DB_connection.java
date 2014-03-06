package db_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class DB_connection
{
	public ResultSet rs;
	public Statement stmt;
	
	 public void update(String sql)
	    {
	          
	    try
	    { 
	        // Treiberklasse laden
	      Class.forName( "org.hsqldb.jdbcDriver" ); 
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
	      stmt = con.createStatement(); 
	  
	      // Alle Kunden ausgeben
	      stmt.executeUpdate(sql);
	       
	      // Resultset schließen
	  
	      // Statement schließen
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
	
	
	public void select(String sql) {// fuehrt SELECT Anweisungen aus
	    {
	          
	    try
	    { 
	        // Treiberklasse laden
	      Class.forName( "org.hsqldb.jdbcDriver" ); 
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
	      stmt = con.createStatement(); 
	  
	      // Alle Kunden ausgeben
	 	 rs = stmt.executeQuery(sql);
	  
	      while ( rs.next() ) 
	      {
	        String id = rs.getString(1);
	        String firstName = rs.getString(2);
	        String lastName = rs.getString(3);
	        System.out.println(id + ", " + firstName + " " + lastName);
	      }
	       
	      // Resultset schließen
	      rs.close(); 
	  
	      // Statement schließen
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
	
	
	
    public DB_connection() //Konstruktor
    { 
   //select("Select * from tbl_Kunden");
   update("INSERT INTO tbl_KUNDEN (K_ANREDE, K_NAME, K_VORNAME, K_EMAIL, K_BENUTZERNAME, K_PASSWORT) VALUES ('female', 't', 't', 't', 't', '[B@1ad5cabc' )");
    }
     
   public static void main(String[] args)
    {
       new DB_connection();
        
    }

}