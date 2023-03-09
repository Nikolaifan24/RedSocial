package com.mintic.tienda.dto;

public class DetalleVentasDto {
	
	private Long codigoDetalleVenta;
	
	private int cantidadProducto;
	
	private Long codigoProducto;
	
	private Long codigoVenta;
	
	private Double valorTotal;
	
	private Double valorVenta;
	
	private Double valoriva;
	
	public DetalleVentasDto() {
		
	}

	public DetalleVentasDto(Long codigoDetalleVenta, int cantidadProducto, Long codigoProducto, Long codigoVenta,
			Double valorTotal, Double valorVenta, Double valoriva) {
		this.codigoDetalleVenta = codigoDetalleVenta;
		this.cantidadProducto = cantidadProducto;
		this.codigoProducto = codigoProducto;
		this.codigoVenta = codigoVenta;
		this.valorTotal = valorTotal;
		this.valorVenta = valorVenta;
		this.valoriva = valoriva;
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

	public Long getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public Long getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(Long codigoVenta) {
		this.codigoVenta = codigoVenta;
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

	public Double getValoriva() {
		return valoriva;
	}

	public void setValoriva(Double valoriva) {
		this.valoriva = valoriva;
	}

	

}
