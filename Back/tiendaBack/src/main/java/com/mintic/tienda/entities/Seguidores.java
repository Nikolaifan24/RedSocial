package com.mintic.tienda.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = Seguidores.TABLE_NAME)
public class Seguidores {
	
	public static final String TABLE_NAME = "Seguidores";
	
	@Id
	private Long IDSeguidor;
	
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "followers")
    private List<Usuarios> usuarios;

	private String nombreUsuario;

	private int numeroSeguidores;
		
	public Seguidores() {
		
	}


	public Seguidores(Long IDSeguidor, List<Usuarios> usuarios, String nombreUsuario, int numeroSeguidores) {
		this.IDSeguidor = IDSeguidor;
		this.usuarios = usuarios;
		this.nombreUsuario = nombreUsuario;
		this.numeroSeguidores = numeroSeguidores;
	}


	public Long getIDSeguidor() {
		return this.IDSeguidor;
	}

	public void setIDSeguidor(Long IDSeguidor) {
		this.IDSeguidor = IDSeguidor;
	}

	public List<Usuarios> getUsuarios() {
		return this.usuarios;
	}

	public void setUsuarios(List<Usuarios> usuarios) {
		this.usuarios = usuarios;
	}

	public String getNombreUsuario() {
		return this.nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public int getNumeroSeguidores() {
		return this.numeroSeguidores;
	}

	public void setNumeroSeguidores(int numeroSeguidores) {
		this.numeroSeguidores = numeroSeguidores;
	}
		
}
