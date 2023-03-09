package com.mintic.tienda;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mintic.tienda.dto.ProveedoresDto;
import com.mintic.tienda.servicio.IProveedorService;

@RestController
public class ControladorProveedores {
	
	@Autowired
	IProveedorService iProveedor;
	
	ProveedoresDto proveedorDto;
	
	@GetMapping("/proveedores/{nitProveedor}")
	public ProveedoresDto buscarProveedorPorNit(@PathVariable Long nitProveedor) {
		return iProveedor.buscarProveedorPorNit(nitProveedor);
	}
}
