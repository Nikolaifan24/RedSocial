package com.mintic.tienda.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = DetalleVentas.TABLE_NAME)
public class DetalleVentas {
	
	public static final String TABLE_NAME = "detalle_ventas";
	
	@Id
	private Long codigoDetalleVenta;
	
	private int cantidadProducto;
	
	//@ManyToOne
	private Long idProducto;
	
	//@ManyToOne
	private Long idVenta;
	
	private Double valorTotal;
	
	private Double valorVenta;
	
	private Double valorIva;

	public DetalleVentas() {
		
	}

	public DetalleVentas(Long codigoDetalleVenta, int cantidadProducto, Long idProducto, Long idVenta,
			Double valorTotal, Double valorVenta, Double valorIva) {
		super();
		this.codigoDetalleVenta = codigoDetalleVenta;
		this.cantidadProducto = cantidadProducto;
		this.idProducto = idProducto;
		this.idVenta = idVenta;
		this.valorTotal = valorTotal;
		this.valorVenta = valorVenta;
		this.valorIva = valorIva;
	}

	public Long getCodigoDetalleVenta() {
		return codigoDetalleVenta;
	}

	public void setCodigoDetalleVenta(Long codigoDetalleVenta) {
		this.codigoDetalleVenta = codigoDetalleVenta;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

	public Long getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(Long idProducto) {
		this.idProducto = idProducto;
	}

	public Long getIdVenta() {
		return idVenta;
	}

	public void setIdVenta(Long idVenta) {
		this.idVenta = idVenta;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Double getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(Double valorVenta) {
		this.valorVenta = valorVenta;
	}

	public Double getValorIva() {
		return valorIva;
	}

	public void setValorIva(Double valorIva) {
		this.valorIva = valorIva;
	}

	

}
