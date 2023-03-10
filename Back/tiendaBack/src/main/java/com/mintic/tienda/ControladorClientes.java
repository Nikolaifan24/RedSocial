package com.mintic.tienda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
import com.mintic.tienda.dto.PublicacionesDto;
import com.mintic.tienda.dto.UsuarioDto;
import com.mintic.tienda.entities.Clientes;
import com.mintic.tienda.entities.Usuarios;
import com.mintic.tienda.servicio.IClienteService;
import com.mintic.tienda.servicio.IUsuarioService;

@RestController
public class ControladorClientes {

	@Autowired
	IClienteService iCliente;
	
	ClienteDto clienteDto;
	
	@CrossOrigin(origins = "http://localhost:8080")
	@GetMapping("/cliente/{cedulaCliente}")
	public ClienteDto buscarClienteByNumeroDocumento(@PathVariable Long cedulaCliente) {
		return iCliente.buscarClientePorCedula(cedulaCliente);
	}
	
	@PostMapping("/cliente")
	public void crearCliente(@RequestBody ClienteDto clienteDto) {
		iCliente.crearCliente(clienteDto);
	}
	
	@DeleteMapping("/cliente/{cedulaCliente}")
	public void eliminarCliente(@PathVariable Long cedulaCliente) {
		iCliente.eliminarCliente(cedulaCliente);
	}
	
	@PatchMapping("/cliente/{cedulaCliente}")
	public void actualizarCliente(@PathVariable Long cedulaCliente, @RequestBody ClienteDto clienteDto) {
		iCliente.actualizarCliente(cedulaCliente, clienteDto);
	}
	
	@GetMapping("/cliente")
	public List<Clientes> listaCliente() {
		return iCliente.listaCliente();
	}
	
}
