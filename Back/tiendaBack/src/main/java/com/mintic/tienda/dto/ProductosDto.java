package com.mintic.tienda.dto;

public class ProductosDto {
	
	private Long id;
	
	private Long codigoProducto;
	
	private Double ivacompra;
	
	private Long nitproveedor;
	
	private String nombreProducto;
	
	private Double precioCompra;
	
	private Double precioVenta;
	
	public ProductosDto() {
		
	}

	public ProductosDto(Long id, Long codigoProducto, Double ivacompra, Long nitproveedor, String nombreProducto,
			Double precioCompra, Double precioVenta) {
		this.id = id;
		this.codigoProducto = codigoProducto;
		this.ivacompra = ivacompra;
		this.nitproveedor = nitproveedor;
		this.nombreProducto = nombreProducto;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigoProducto() {
		return codigoProducto;
	}

	public void setCodigoProducto(Long codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public Double getIvacompra() {
		return ivacompra;
	}

	public void setIvacompra(Double ivacompra) {
		this.ivacompra = ivacompra;
	}

	public Long getNitproveedor() {
		return nitproveedor;
	}

	public void setNitproveedor(Long nitproveedor) {
		this.nitproveedor = nitproveedor;
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public Double getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(Double precioCompra) {
		this.precioCompra = precioCompra;
	}

	public Double getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(Double precioVenta) {
		this.precioVenta = precioVenta;
	}

	
	

}
