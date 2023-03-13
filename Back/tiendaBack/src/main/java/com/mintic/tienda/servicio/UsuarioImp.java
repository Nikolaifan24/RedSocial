
package com.mintic.tienda.servicio;

import java.util.ArrayList;
import java.util.HashMap;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mintic.tienda.dto.LoginDto;
import com.mintic.tienda.dto.UsuarioDto;
import com.mintic.tienda.entities.Usuarios;
import com.mintic.tienda.repositories.IUsuario;

@Service 
public class UsuarioImp implements IUsuarioService {

	
	@Autowired
	IUsuario iUsuario;
	
	
	@Override
	public List<Usuarios> listarUsuarios() {
		return (List<Usuarios>) iUsuario.findAll();
	}



	@Override
	public void crearUsuario(UsuarioDto usuarioDto) {
		iUsuario.save(buildUsuario(usuarioDto));
		
	}

	private Usuarios buildUsuario(UsuarioDto usuarioDto) {
		Usuarios myusuario = new Usuarios();
		
		String nombre= usuarioDto.getNombre();
		String apellido = usuarioDto.getApellido();
		String nombreUsuario = usuarioDto.getNombreUsuario();
		String emailUsuario = usuarioDto.getCorreo();
		String password = usuarioDto.getContrasena();
		String correo  = usuarioDto.getCorreo();
		// myusuario.setID(id);
		
		if(nombre != null) {
			myusuario.setNombre(nombreUsuario);
		}
		if(apellido != null) {
			myusuario.setApellido(apellido);
		}
		if(nombreUsuario != null) {
			myusuario.setNombreUsuario(nombreUsuario);
		}
		if(password != null) {
			myusuario.setContrasena(correo);
		}
		if(correo != null) {
			myusuario.setCorreo(correo);
		}
		
		
		return myusuario;
		
	}
	
	private void updateUsuario(UsuarioDto usuarioDto, Usuarios myusuario) {
		
		String nombre= usuarioDto.getNombre();
		String apellido = usuarioDto.getApellido();
		String nombreUsuario = usuarioDto.getNombreUsuario();
		String emailUsuario = usuarioDto.getCorreo();
		String password = usuarioDto.getContrasena();
		String correo  = usuarioDto.getCorreo();
		// myusuario.setID(id);
		
		if(nombre != null) {
			myusuario.setNombre(nombreUsuario);
		}
		if(apellido != null) {
			myusuario.setApellido(apellido);
		}
		if(nombreUsuario != null) {
			myusuario.setNombreUsuario(nombreUsuario);
		}
		if(password != null) {
			myusuario.setContrasena(correo);
		}
		if(correo != null) {
			myusuario.setCorreo(correo);
		}
		
		iUsuario.save(myusuario);
	}
	

	@Override
	public void eliminarUsuario(String nombreUsuario) {
		Usuarios usuario = iUsuario.buscarUsuarioPornombreUsuario(nombreUsuario);
		iUsuario.delete(usuario);
		
	}

	@Override
	public void actualizarUsuario(String nombreUsuario, UsuarioDto usuarioDto) {
		
		Usuarios usuario = iUsuario.buscarUsuarioPornombreUsuario(nombreUsuario);
		updateUsuario(usuarioDto, usuario);
		
	}

	@Override
	public UsuarioDto buscarUsuarioPorNombre(String nombreUsuario) {
		Usuarios Usuario = null;
		try {
			Usuario = iUsuario.buscarUsuarioPornombreUsuario(nombreUsuario);
			UsuarioDto  UsuarioDto = mapUsuarioDto(Usuario);
			return UsuarioDto;
		} catch (Exception e) {
			return null;
		}
		
	}

	private UsuarioDto mapUsuarioDto(Usuarios usuario) {
		return new UsuarioDto(
				usuario.getIDUsuario(),
				usuario.getNombre(),
				usuario.getApellido(),
				usuario.getNombreUsuario(),
				usuario.getContrasena(),
				usuario.getCorreo()
				
			);		
	}

	



}

