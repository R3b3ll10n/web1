package connectMysql;

public class Usuarios {
	private String usuarios;
	private String pwd;

	public Usuarios(String usuarios, String pwd) {
		this.usuarios = usuarios;
		this.pwd = pwd;
	}

	public String getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(String usuarios) {
		this.usuarios = usuarios;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
