package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectMysql.Conexion;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		try {
			Conexion aux = new Conexion();
			Connection con = aux.conectar();
			
			String query = "INSERT INTO USUARIOS VALUES(?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			if(request.getParameter("user") != "" || request.getParameter("password") != "")
			{		
				pst.setString(1, request.getParameter("user"));
				pst.setString(2, request.getParameter("password"));
				pst.execute();
				con.close();
				response.sendRedirect("http://localhost:8080/test2usuarios/index.jsp");
			}else {
				respuesta(response, "te has olvidado de un campo");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void respuesta(HttpServletResponse respuesta, String msg) throws IOException {
		PrintWriter out = respuesta.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>"+msg+"</h1>");
		out.println("</body");
		out.println("</html>");
	}

}
