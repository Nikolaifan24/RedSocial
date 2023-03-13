package com.mintic.tienda.servicio;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.mintic.tienda.dto.ClienteDto;
import com.mintic.tienda.dto.LoginDto;
import com.mintic.tienda.dto.UsuarioDto;
import com.mintic.tienda.entities.Usuarios;


/*
 * Aqui se definen los metodos que se van a utilizar (el contrato)
 * */
public interface IUsuarioService {

	List<Usuarios> listarUsuarios() ;
	
	void crearUsuario(UsuarioDto usuarioDto);

	void eliminarUsuario(String nombreUsuario);

	void actualizarUsuario(String nombreUsuario, UsuarioDto usuarioDto);

	UsuarioDto buscarUsuarioPorNombre(String nombreUsuario); 

}
