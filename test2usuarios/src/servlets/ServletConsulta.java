package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
/* NO FUNCIONA, LO SUBO POR SI ACASO */

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectMysql.Conexion;

/**
 * Servlet implementation class ServletConsulta
 */
@WebServlet("/ServletConsulta")
public class ServletConsulta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletConsulta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Mensaje de exito
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
			//Statement stmt = null;

			ResultSet rs = null;
			
			String name = request.getParameter("nameConsulta");
			String lastname = request.getParameter("lastnameConsulta");
			String password = request.getParameter("passwordConsulta");
			
			String query = "Select count (name, lastname, password) from registros_usuarios where name='"+name+"' and lastname='"+lastname+"' AND password='"+password+"' ";


			PreparedStatement pst = con.prepareStatement(query);
			
			rs = pst.executeQuery();
			
			/*
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM registros_usuarios WHERE name="+name+);*/
			
			while(rs.next()){ 
				if(rs.getInt(1) != 1) {
					PrintWriter out = response.getWriter();
					out.println("<html>"
							+ "<body><h1>FALLO, este usuario o contraseña no coincide.</h1></body>"

							+ "</html>");
				}else{
					PrintWriter out = response.getWriter();
					out.println("<html>"
							+ "<body><h1>Usuario correcto.</h1></body>"
							+ "</html>");
					System.out.println("name="+rs.getObject("name")+
						      ", lastname="+rs.getObject("lastname")+
						      ", password="+rs.getObject("password"));
				}
			}
			/*
			
			while (rs.next())
			{
			   System.out.println("name="+rs.getObject("name")+
			      ", lastname="+rs.getObject("lastname")+
			      ", password="+rs.getObject("password"));
			}
	*/
			
			rs.close();
			
			/*
			String query = "INSERT INTO registros_usuarios (name, lastname, password) VALUES (?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, request.getParameter("name"));
			pst.setString(2, request.getParameter("lastname"));
			pst.setString(3, request.getParameter("password"));
			
			pst.execute();
			con.close();
			*/
			/*PrintWriter out = response.getWriter();
			out.println("<html>"
					+ "<body><p><h1>Exito en la insercion</h1></p>"
					+ "<p><a href='/test2usuarios/index.jsp'>Volver</a></body>"
					+ "<html>");
			*/
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
