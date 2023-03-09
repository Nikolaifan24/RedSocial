package com.mintic.tienda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mintic.tienda.dto.ClienteDto;
import com.mintic.tienda.dto.LoginDto;
import com.mintic.tienda.dto.ProductosDto;
import com.mintic.tienda.dto.ProveedoresDto;
import com.mintic.tienda.dto.UsuarioDto;
import com.mintic.tienda.entities.Productos;
import com.mintic.tienda.entities.Usuarios;
import com.mintic.tienda.servicio.IClienteService;
import com.mintic.tienda.servicio.IProductoService;
import com.mintic.tienda.servicio.IUsuarioService;

@RestController
public class ControladorProductos {
	
	@Autowired
	IProductoService iProducto;
	
	ProductosDto productosDto;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/productos")
	public List<Productos> listarProductos() {
		return iProducto.getProductos();
	}
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/producto/{codigoProducto}")
	public ProductosDto buscarProductoPorCodigo(@PathVariable Long codigoProducto) {
		return iProducto.buscarProductoPorCodigo(codigoProducto);
	}
	
}
