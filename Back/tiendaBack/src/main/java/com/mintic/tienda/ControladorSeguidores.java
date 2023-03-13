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
import com.mintic.tienda.dto.SeguidoresDto;
import com.mintic.tienda.dto.PublicacionesDto;
import com.mintic.tienda.dto.UsuarioDto;
import com.mintic.tienda.entities.Seguidores;
import com.mintic.tienda.entities.Usuarios;
import com.mintic.tienda.servicio.IUsuarioService;

@RestController
public class ControladorSeguidores {
	
	@Autowired
	IUsuarioService iUsuario;
	
	UsuarioDto UsuarioDto;
	
	@CrossOrigin(origins = "http://localhost:8091")
	@GetMapping("/usuario/{nombreUsuario}")
	public UsuarioDto MostarUsuarioPorNombre(@PathVariable String nombreUsuario) {
		return iUsuario.buscarUsuarioPorNombre(nombreUsuario);
	}
	
	
	@PostMapping("/crearUsuario")
	public void crearUsuario(@RequestBody UsuarioDto UsuarioDto) {
		iUsuario.crearUsuario(UsuarioDto);
	}
	
	@DeleteMapping("/eliminarUsuario/{nombreUsuario}")
	public void eliminarUsuario(@PathVariable String nombreUsuario) {
		iUsuario.eliminarUsuario(nombreUsuario);
	}
	
	@PatchMapping("/actualizarUsuario/{nombreUsuario}")
	public void actualizaralUsuario(@PathVariable String nombreUsuario, @RequestBody UsuarioDto UsuarioDto) {
		iUsuario.actualizarUsuario(nombreUsuario, UsuarioDto);;
	}
	
	@GetMapping("/usuarioslistar")
	public List<Usuarios> listaUsuario() {
		return iUsuario.listarUsuarios();
	}
	

	
}
