package com.mintic.tienda.servicio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.tienda.dto.ClienteDto;
import com.mintic.tienda.dto.ProveedoresDto;
import com.mintic.tienda.entities.Clientes;
import com.mintic.tienda.entities.Proveedores;
import com.mintic.tienda.repositories.IProveedor;

@Service
public class ProveedorImp implements IProveedorService {
	
	@Autowired
	IProveedor iProveedor;

	@Override
	public void crearProveedor(ProveedoresDto proveedoresDto) {
		
	}

	@Override
	public ProveedoresDto buscarProveedorPorNit(Long nitProveedor) {
		Proveedores proveedores = null;
		try {
			proveedores = iProveedor.buscarProveedorPorNit(nitProveedor);
			ProveedoresDto  proveedoresDto = mapProveedorDto(proveedores);
			return proveedoresDto;
		} catch (Exception e) {
			return null;
		}
	}
	
	private ProveedoresDto mapProveedorDto(Proveedores proveedores) {
		return new ProveedoresDto(
				proveedores.getNitProveedor(),
				proveedores.getCiudadProveedor(),
				proveedores.getDireccionProveedor(),
				proveedores.getNombreProveedor(),
				proveedores.getTelefonoProveedor()
		);		
	}
	

	@Override
	public void eliminarProveedor(String nitProveedor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizarProveedor(String nitProveedor, ProveedoresDto proveedorDto) {
		// TODO Auto-generated method stub
		
	}

	

}
