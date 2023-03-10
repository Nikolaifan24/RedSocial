package com.mintic.tienda.servicio;


import com.mintic.tienda.dto.PublicacionesDto;

public interface IPublicacionesService {
	
	void crearProveedor(PublicacionesDto proveedoresDto);

	PublicacionesDto buscarProveedorPorNit(Long nitProveedor);

	void eliminarProveedor(String nitProveedor);

	void actualizarProveedor(String nitProveedor, PublicacionesDto proveedorDto);

}
