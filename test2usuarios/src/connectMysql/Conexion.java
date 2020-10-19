package connectMysql;
import java.sql.*;

public class Conexion {
	public static Connection  con = null;
	
	/* He comentado esto para que se conecte con mi BBDD. Si lo cambiais os deberia funcionar*/
	/*datos para conexion con localhost*/
	
	public static final String driver = "com.mysql.jdbc.Driver";
	public static final String user = "pr_cofares_admin";
	public static final String pwd= "pr_cofares_admin";
	public static final String dataBase = "PRCOFARES";
	public static final String url = "jdbc:mysql://localhost:3306/"+ dataBase;
	
	/* datos para conexion con eliaskitano.es */
	/*
	public static final String driver = "com.mysql.jdbc.Driver";
	public static final String user = "wp_eliaskn_0_w";
	public static final String pwd= "v3Ru5xap9B8FvaNp";
	public static final String dataBase = "wp_eliaskn_db0";
	public static final String url = "jdbc:mysql://sql26.your-server.de:3306/"+ dataBase;
	*/
	
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
