package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.net.httpserver.Authenticator.Result;

import connectBBDD.ConexionBBDD;

/**
 * Servlet implementation class Login_srvlt
 */
@WebServlet("/Login_srvlt")
public class Login_srvlt extends HttpServlet {
	private static final long serialVersionUID = 1L;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_srvlt() {
        super();
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
		ConexionBBDD bbdd = new ConexionBBDD("localhost:3306", "admin", "administrador", "myWeb");
		String user = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		
		if(bbdd.conectar())
		{
			if(usuarioExist(user, bbdd)) {

			}else {
				System.out.println("el usuario "+ user +" no existe");
				response.sendRedirect("./JSP/login.jsp");
				//request.getRequestDispatcher("./JSP/login.jsp").forward(request, response);
			}
		}else {
			response.sendRedirect("./JSP/login.jsp");
		}
	}
	public boolean usuarioExist(String usr, ConexionBBDD con) {
		PreparedStatement pst = null;
		String query = "SELECT * FROM DATOS_USER WHERE USER_NAME = ?";
		pst = con.addQuery(pst, query);
		ResultSet rs;
		try {
			pst.setString(1, usr);
			rs = pst.executeQuery();
			if(rs.next()) {
				System.out.println("usuario " + usr + " encontrado");
			}else {
				return false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
	}
	public boolean loginTrue(String usr,String pwd,ConexionBBDD con) {
		
		return false;
	}
}
