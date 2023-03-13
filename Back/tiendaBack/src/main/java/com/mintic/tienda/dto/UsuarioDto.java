package com.mintic.tienda.dto;

public class UsuarioDto {
	
	private Long IDUsuario;
	
	private String Nombre;
	
	private String Apellido;

	private String NombreUsuario;

	private String contrasena;

	private String correo;
	
	public UsuarioDto() {
		
	}


	public UsuarioDto(Long IDUsuario, String Nombre, String Apellido, String NombreUsuario, String contrasena, String correo) {
		this.IDUsuario = IDUsuario;
		this.Nombre = Nombre;
		this.Apellido = Apellido;
		this.NombreUsuario = NombreUsuario;
		this.contrasena = contrasena;
		this.correo = correo;
	}

	public Long getIDUsuario() {
		return this.IDUsuario;
	}

	public void setIDUsuario(Long IDUsuario) {
		this.IDUsuario = IDUsuario;
	}

	public String getNombre() {
		return this.Nombre;
	}

	public void setNombre(String Nombre) {
		this.Nombre = Nombre;
	}

	public String getApellido() {
		return this.Apellido;
	}

	public void setApellido(String Apellido) {
		this.Apellido = Apellido;
	}

	public String getNombreUsuario() {
		return this.NombreUsuario;
	}

	public void setNombreUsuario(String NombreUsuario) {
		this.NombreUsuario = NombreUsuario;
	}

	public String getContrasena() {
		return this.contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getCorreo() {
		return this.correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}
		
}
