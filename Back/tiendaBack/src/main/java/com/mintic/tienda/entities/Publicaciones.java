package com.mintic.tienda.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = Publicaciones.TABLE_NAME)
public class Publicaciones {
	public static final String TABLE_NAME = "proveedores";
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long IDPublicacion;
	
	@ManyToOne
    @JoinColumn(name="IDUsuario")
    private Usuarios usuarios;
	
	private String nombreUsuario;

	private String titulo;

	private String cuerpo;

	private String hora;

	private String fecha;
	
	private String publicacion;

	public Publicaciones() {
		
	}


	public Publicaciones(Long IDPublicacion, Usuarios usuarios, String nombreUsuario, String titulo, String cuerpo, String hora, String fecha, String publicacion) {
		this.IDPublicacion = IDPublicacion;
		this.usuarios = usuarios;
		this.nombreUsuario = nombreUsuario;
		this.titulo = titulo;
		this.cuerpo = cuerpo;
		this.hora = hora;
		this.fecha = fecha;
		this.publicacion = publicacion;
	}

	public Long getIDPublicacion() {
		return this.IDPublicacion;
	}

	public void setIDPublicacion(Long IDPublicacion) {
		this.IDPublicacion = IDPublicacion;
	}

	public Usuarios getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(Usuarios usuarios) {
		this.usuarios = usuarios;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCuerpo() {
		return this.cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String getHora() {
		return this.hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getFecha() {
		return this.fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getPublicacion() {
		return this.publicacion;
	}

	public void setPublicacion(String publicacion) {
		this.publicacion = publicacion;
	}
	
}
