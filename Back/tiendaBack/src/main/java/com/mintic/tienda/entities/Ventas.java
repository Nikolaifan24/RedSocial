package com.mintic.tienda.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = Ventas.TABLE_NAME)
public class Ventas {
	
	public static final String TABLE_NAME = "ventas";
	
	@Id
	private Long id;
	
	@OneToMany
	@JoinColumn(name = "codigoVenta")
	private List<DetalleVentas> detalleVentas;
	
	private Long idCliente;
	
	private Long idUsuario;
	
	private Double ivaVenta;
	
	private Double totalVenta;
	
	private Double valorVenta;
	
	
	public Ventas() {
		
	}


	public Ventas(Long id, List<DetalleVentas> detalleVentas, Long idCliente, Long idUsuario, Double ivaVenta,
			Double totalVenta, Double valorVenta) {
		this.id = id;
		this.detalleVentas = detalleVentas;
		this.idCliente = idCliente;
		this.idUsuario = idUsuario;
		this.ivaVenta = ivaVenta;
		this.totalVenta = totalVenta;
		this.valorVenta = valorVenta;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public List<DetalleVentas> getDetalleVentas() {
		return detalleVentas;
	}


	public void setDetalleVentas(List<DetalleVentas> detalleVentas) {
		this.detalleVentas = detalleVentas;
	}


	public Long getIdCliente() {
		return idCliente;
	}


	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}


	public Long getIdUsuario() {
		return idUsuario;
	}


	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}


	public Double getIvaVenta() {
		return ivaVenta;
	}


	public void setIvaVenta(Double ivaVenta) {
		this.ivaVenta = ivaVenta;
	}


	public Double getTotalVenta() {
		return totalVenta;
	}


	public void setTotalVenta(Double totalVenta) {
		this.totalVenta = totalVenta;
	}


	public Double getValorVenta() {
		return valorVenta;
	}


	public void setValorVenta(Double valorVenta) {
		this.valorVenta = valorVenta;
	}

	
	
	
}
