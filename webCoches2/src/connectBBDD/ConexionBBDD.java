package connectBBDD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexionBBDD {
	private static final String driver = "com.mysql.jdbc.Driver";
	private String host;
	private String user;
	private String pwd;
	private String dataBase;
	private String url;
	private String messageERROR;
	private Connection con;
	private PreparedStatement pst;
	
	public ConexionBBDD(String host, String user,String pwd,String database) {
		this.host = host;
		this.user = user;
		this.pwd = pwd;
		this.dataBase = database;
		this.url = "jdbc:mysql://" + this.host + "/" + this.dataBase;
	}
	
	public Connection getConection() {return this.con;}
	
	public String getMessageError() {return this.messageERROR;}
	
	public PreparedStatement addQuery(PreparedStatement pst, String query) {
		try {
			this.pst = this.con.prepareStatement(query);
		} catch (SQLException e) {
			this.messageERROR = e.getMessage();
		}
		return this.pst;
	}
	
	public Boolean conectar() {
		try {
			Class.forName(driver);
			this.con = DriverManager.getConnection(this.url,this. user, this.pwd);
			System.out.println("Conectado correctamente a la BBDD " + this.dataBase);
		} catch (SQLException e) {
			this.messageERROR = e.getMessage();
			System.out.println("***********************  "+this.getMessageError() +" ***********************");
			e.printStackTrace();
			return false;
		} catch (ClassNotFoundException e) {
			this.messageERROR = e.getMessage();
			System.out.println("***********************  "+this.getMessageError() +" ***********************");
			return false;
		}
		return true;
	}
	
}
