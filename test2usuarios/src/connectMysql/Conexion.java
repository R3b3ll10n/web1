package connectMysql;
import java.sql.*;

public class Conexion {
	public static Connection  con = null;
	public static final String driver = "com.mysql.jdbc.Driver";
	public static final String user = "pr_cofares_admin";
	public static final String pwd= "pr_cofares_admin";
	public static final String dataBase = "PRCOFARES";
	public static final String url = "jdbc:mysql://localhost:3306/"+ dataBase;
	
	public Conexion() {
		con = null;
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, user, pwd);
			
			if(con == null)
				System.out.println("algo ha fallado con la conexion");
			else
				System.out.println("conectado correctamente");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Connection conectar(){
		return con;
	}
}
