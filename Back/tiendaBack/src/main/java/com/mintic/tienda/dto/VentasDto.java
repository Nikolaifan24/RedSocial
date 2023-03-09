package com.mintic.tienda.dto;

public class VentasDto {
	
	private Long codigoVenta;
	
	private Long cedulaCliente;
	
	private Long cedulaUsuario;
	
	private Double ivaventa;
	
	private Double totalVenta;
	
	private Double valorVenta;
	
	public VentasDto() {
		
	}

	public VentasDto(Long codigoVenta, Long cedulaCliente, Long cedulaUsuario, Double ivaventa, Double totalVenta,
			Double valorVenta) {
		this.codigoVenta = codigoVenta;
		this.cedulaCliente = cedulaCliente;
		this.cedulaUsuario = cedulaUsuario;
		this.ivaventa = ivaventa;
		this.totalVenta = totalVenta;
		this.valorVenta = valorVenta;
	}

	public Long getCodigoVenta() {
		return codigoVenta;
	}

	public void setCodigoVenta(Long codigoVenta) {
		this.codigoVenta = codigoVenta;
	}

	public Long getCedulaCliente() {
		return cedulaCliente;
	}

	public void setCedulaCliente(Long cedulaCliente) {
		this.cedulaCliente = cedulaCliente;
	}

	public Long getCedulaUsuario() {
		return cedulaUsuario;
	}

	public void setCedulaUsuario(Long cedulaUsuario) {
		this.cedulaUsuario = cedulaUsuario;
	}

	public Double getIvaventa() {
		return ivaventa;
	}

	public void setIvaventa(Double ivaventa) {
		this.ivaventa = ivaventa;
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
