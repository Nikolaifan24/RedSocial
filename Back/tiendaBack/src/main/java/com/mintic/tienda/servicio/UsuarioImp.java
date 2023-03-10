
package com.mintic.tienda.servicio;

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
	public int login(LoginDto usuarioDto) {
		int u = iUsuario.findByNombreUsuarioAndPassword(usuarioDto.getNombreUsuario(), usuarioDto.getPassword());
		return u;
	}
	
	@Override
	public Usuarios loginUsuario(LoginDto usuarioDto) {
		//return iUsuario.findByNameAndPassword(usuarioDto.getNombreUsuario(), usuarioDto.getPassword());
		return null;
	}

	@Override
	public List<Usuarios> getUsuarios() {

		return (List<Usuarios>) iUsuario.findAll();
	}


	@Override
	public UsuarioDto buscarUsuarioPorCedula(Long cedulaUsuario) {
		Usuarios usuario = null;
		try {
			
			usuario = iUsuario.buscarUsuarioPorCedula(cedulaUsuario);
			UsuarioDto usuarioDto = mapUsuarioDto(usuario);
			return usuarioDto;
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

	

	@Override
	public void crearUsuario(UsuarioDto usuarioDto) {
		iUsuario.save(buildUsuario(usuarioDto));
		
	}

	private Usuarios buildUsuario(UsuarioDto usuarioDto) {
		Usuarios myusuario = new Usuarios();
			
		String nombre = usuarioDto.getNombre();
		String apellido = usuarioDto.getApellido();
		String nombreUsuario = usuarioDto.getNombreUsuario();
		String password = usuarioDto.getContrasena();
		String correo = usuarioDto.getCorreo();

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
		
		String nombre = usuarioDto.getNombre();
		String apellido = usuarioDto.getApellido();
		String nombreUsuario = usuarioDto.getNombreUsuario();
		String password = usuarioDto.getContrasena();
		String correo = usuarioDto.getCorreo();

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
	public void eliminarUsuario(Long cedulaUsuario) {
		Usuarios usuario = iUsuario.buscarUsuarioPorCedula(cedulaUsuario);
		iUsuario.delete(usuario);
		
	}

	@Override
	public void actualizarUsuario(Long cedulaUsuario, UsuarioDto usuarioDto) {
		
		Usuarios usuario = iUsuario.buscarUsuarioPorCedula(cedulaUsuario);
		updateUsuario(usuarioDto, usuario);
		
	}

	
	
	


}

