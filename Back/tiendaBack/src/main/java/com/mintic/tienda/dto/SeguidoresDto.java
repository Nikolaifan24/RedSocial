package com.mintic.tienda.dto;

public class SeguidoresDto {
	
	private Long IDSeguidor;
	
	private String nombreUsuario;

	private int numeroSeguidores;
	
	public SeguidoresDto() {
		
	}


	public SeguidoresDto(Long IDSeguidor, String nombreUsuario, int numeroSeguidores) {
		this.IDSeguidor = IDSeguidor;
		this.nombreUsuario = nombreUsuario;
		this.numeroSeguidores = numeroSeguidores;
	}
		

	public Long getIDSeguidor() {
		return this.IDSeguidor;
	}

	public void setIDSeguidor(Long IDSeguidor) {
		this.IDSeguidor = IDSeguidor;
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
