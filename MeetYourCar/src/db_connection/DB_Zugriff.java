package db_connection;

import java.sql.ResultSet;

public class DB_Zugriff {
	private ResultSet rstErgebnis;
    // @Clemens: hier unten ist die Funktion der ich den SQL-String übergebe und die mir das ResultSet zurück gibt.
   public ResultSet runSQL(String sqlArg)
   {
       new DB_connection();
       //Hier SQL in DB eingeben und Rückgabewert zurückgeben
		return rstErgebnis;
   }
}
