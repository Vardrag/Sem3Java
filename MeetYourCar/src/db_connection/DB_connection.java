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
	private Connection con;
	
	public void finalize(){ //schließen der DB-Connection, gibt speicher wieder frei
	      
	      try {
	    	// Resultset schlieï¿½en
			rs.close();
		    // Statement schlieï¿½en
		    stmt.close(); 
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	  


		if ( con != null )
	      {
	        try {
	            con.close();
	            } catch ( SQLException e ) {
	                e.printStackTrace();
	            }	
	      }
	}
	
	public void update(String sql) throws SQLException{ //fuehrt UPDATE, INSERT INTO und DELETE Anweisungen aus

			stmt.executeUpdate(sql+';');
			
	}
	
	public void select(String sql) throws SQLException{// fuehrt SELECT Anweisungen aus
		 rs = stmt.executeQuery(sql);
	}
	
	
	
    public DB_connection() //Konstruktor
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
  
    con = null;
  
    try
    {
      con = DriverManager.getConnection( 
    		  "jdbc:hsqldb:file:WebContent/HSQLDB/hsqldb-2.3.1/hsqldb; shutdown=true", "root", "root" );
      stmt = con.createStatement();
  
    }
    catch ( SQLException e )
    {
      e.printStackTrace();
    }
   
    }
     
   public static void main(String[] args)
    {
        new DB_connection();
        
    }

}