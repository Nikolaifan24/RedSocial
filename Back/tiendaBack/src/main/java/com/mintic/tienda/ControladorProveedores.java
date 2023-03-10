package com.mintic.tienda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mintic.tienda.dto.PublicacionesDto;
import com.mintic.tienda.servicio.IPublicacionesService;

@RestController
public class ControladorProveedores {
	
	@Autowired
	IPublicacionesService iProveedor;
	
	PublicacionesDto proveedorDto;
	
	@GetMapping("/proveedores/{nitProveedor}")
	public PublicacionesDto buscarProveedorPorNit(@PathVariable Long nitProveedor) {
		return iProveedor.buscarProveedorPorNit(nitProveedor);
	}
}
