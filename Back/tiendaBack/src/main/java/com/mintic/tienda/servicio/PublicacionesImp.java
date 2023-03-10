package com.mintic.tienda.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.tienda.dto.ClienteDto;
import com.mintic.tienda.dto.PublicacionesDto;
import com.mintic.tienda.entities.Clientes;
import com.mintic.tienda.entities.Publicaciones;
import com.mintic.tienda.repositories.IPublicaciones;

@Service
public class PublicacionesImp implements IPublicacionesService {
	
	@Autowired
	PublicacionesImp iPublicaciones;

	@Override
	public void crearProveedor(PublicacionesDto proveedoresDto) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'crearProveedor'");
	}

	@Override
	public PublicacionesDto buscarProveedorPorNit(Long nitProveedor) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'buscarProveedorPorNit'");
	}

	@Override
	public void eliminarProveedor(String nitProveedor) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'eliminarProveedor'");
	}

	@Override
	public void actualizarProveedor(String nitProveedor, PublicacionesDto proveedorDto) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'actualizarProveedor'");
	}

	

	

}
