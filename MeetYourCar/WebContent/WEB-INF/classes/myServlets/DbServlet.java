package myServlets;

import java.io.*;
import java.sql.*;
import java.util.Date;

import javax.servlet.*;
import javax.servlet.http.*;

public class DbServlet extends HttpServlet {


   private DbConn conn ;

  /**
    * Initialisieren der Datenbank-Verbindung mit Parametern aus
    * dem Web Deployment Descriptor WEB-INF/web.xml
    */
   public void init(javax.servlet.ServletConfig config)
          throws ServletException {

      // Überschriebene init()-Methode der Superklasse aufrufen !
      super.init(config);

      // Parameter aus der Datein WEB-INF/web.xml auslesen
      String driver = config.getInitParameter("jdbcClass");
      String url = config.getInitParameter("dbURL");
      String user = config.getInitParameter("username");
      String pw = config.getInitParameter("password");

      // Initialisieren der Datenbank-Verbindung 
      // mit der Klasse DbConn
      try {

	 conn = new DbConn(driver, url, user, pw);
 	
      } catch (Exception e) {
          throw new ServletException("SQL-Exception in init()", e);
      }
   } 

   /**
    * Service-Methode 
    */
   public void service(HttpServletRequest request,
                       HttpServletResponse response)
          throws IOException, ServletException
   {

	String sql = null;
	
	if (request.getParameter("submit") != null) { 
           sql = request.getParameter("sql");
	   request.setAttribute("stmt", sql);    
	}

        if ( sql.substring(0,3).equalsIgnoreCase("SEL") )
	   try {
		ResultSet rs = conn.select(sql);
		request.setAttribute("result",rs);
		request.setAttribute("stmtArt", "SEL");
	   }
	   catch (SQLException e) {
		request.setAttribute("exc", e.getMessage() );
	   }

	if ( ! sql.substring(0,3).equalsIgnoreCase("SEL") )
	   try {
               int n = conn.dml(sql);
	       request.setAttribute("result",n);
	       request.setAttribute("stmtArt", "DML");		   
           } 
	   catch (SQLException e) {
	       request.setAttribute("exc", e.getMessage() );
           }	   
       
        //JSP-Aufruf          
        RequestDispatcher disp =
             getServletContext().getRequestDispatcher("/index.jsp");
        disp.forward(request, response);
	
}

  public void destroy() {
    try {
      //Freigeben von Datenbank-Ressourcen
      conn.closeDb();
    } 
	catch (SQLException e) {
      log("SQL-Exception in destroy()", e);
    }
  }   
}
