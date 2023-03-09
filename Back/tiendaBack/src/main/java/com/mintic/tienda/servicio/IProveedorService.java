package com.mintic.tienda.servicio;


import com.mintic.tienda.dto.ProveedoresDto;

public interface IProveedorService {
	
	void crearProveedor(ProveedoresDto proveedoresDto);

	ProveedoresDto buscarProveedorPorNit(Long nitProveedor);

	void eliminarProveedor(String nitProveedor);

	void actualizarProveedor(String nitProveedor, ProveedoresDto proveedorDto);

}
