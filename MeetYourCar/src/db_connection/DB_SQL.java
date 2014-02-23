package db_connection;

import java.sql.ResultSet;

public class DB_SQL {
	private ResultSet rstErgebnis;
    // @Clemens: hier unten ist die Funktion der ich den SQL-String �bergebe und die mir das ResultSet zur�ck gibt.
   public ResultSet runSQL(String sqlArg)
   {
       new DB_connection();
       //Hier SQL in DB eingeben und R�ckgabewert zur�ckgeben
		return rstErgebnis;
   }
}
