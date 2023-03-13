package com.mintic.tienda.entities;


import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/*
 * aquie se mapea la bd  las tablas de la base de datos son las entidades
 *la entidad se utiliza en los repositorios 
 * */
@Entity
@Table(name = Usuarios.TABLE_NAME)
public class Usuarios {
	public static final String TABLE_NAME = "usuarios";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDUsuario;

	@JsonIgnore
	@OneToMany(mappedBy = "usuarios")
	private List<Publicaciones> publicaciones;

	@JsonIgnore
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(
        name = "usuarios_seguidores",
        joinColumns = { @JoinColumn(name = "IDUsuarios") },
        inverseJoinColumns = { @JoinColumn(name = "IDSeguidores") }
    )
    private List<Seguidores> seguidores;
	
	private String Nombre;
	
	private String Apellido;

	private String NombreUsuario;

	private String contrasena;

	private String correo;
	
	public Usuarios() {
		
	}
	

	public Usuarios(Long IDUsuario, List<Seguidores> seguidores, String Nombre, String Apellido, String NombreUsuario, String contrasena, String correo) {
		this.IDUsuario = IDUsuario;
		this.seguidores = seguidores;
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

	public List<Seguidores> getSeguidores() {
		return this.seguidores;
	}

	public void setSeguidores(List<Seguidores> seguidores) {
		this.seguidores = seguidores;
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
