package entities;

public class Usuario {

	private int id;
	private String id_rol;
	private String usuario;
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getId_rol() {
		return id_rol;
	}
	public void setId_rol(String id_rol) {
		this.id_rol = id_rol;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", id_rol=" + id_rol + ", usuario=" + usuario + ", nombre=" + nombre
				+ ", apellido=" + apellido + ", email=" + email + ", password=" + password + "]";
	}
	
	
}
