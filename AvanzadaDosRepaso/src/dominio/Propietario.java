package dominio;

import java.util.List;

public class Propietario {
	
	private Integer id;
	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	private String mail;
	private List<Auto> autos;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
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
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public List<Auto> getAutos() {
		return autos;
	}
	public void setAutos(List<Auto> autos) {
		this.autos = autos;
	}
	
	
}
