
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
				usuario.getId(),
				usuario.getCedulaUsuario(),
				usuario.getEmailUsuario(),
				usuario.getNombreUsuario(),
				usuario.getPassword(),
				usuario.getUsuario()
		);
	}

	

	@Override
	public void crearUsuario(UsuarioDto usuarioDto) {
		iUsuario.save(buildUsuario(usuarioDto));
		
	}

	private Usuarios buildUsuario(UsuarioDto usuarioDto) {
		Usuarios myusuario = new Usuarios();
		
		Long id = usuarioDto.getId();
		Long cedulaUsuario = usuarioDto.getCedulaUsuario();
		String emailUsuario = usuarioDto.getEmailUsuario();
		String nombreUsuario = usuarioDto.getNombreUsuario();
		String password = usuarioDto.getPassword();
		String usuario = usuarioDto.getUsuario();
		myusuario.setId(id);
		if(cedulaUsuario != null) {
			myusuario.setCedulaUsuario(cedulaUsuario);
		}
		if(emailUsuario != null) {
			myusuario.setEmailUsuario(emailUsuario);
		}
		if(nombreUsuario != null) {
			myusuario.setNombreUsuario(nombreUsuario);
		}
		if(password != null) {
			myusuario.setPassword(password);
		}
		if(usuario != null) {
			myusuario.setUsuario(usuario);
		}
		return myusuario;
		
	}
	
	private void updateUsuario(UsuarioDto usuarioDto, Usuarios myusuario) {
		
		Long id = usuarioDto.getId();
		Long cedulaUsuario = usuarioDto.getCedulaUsuario();
		String emailUsuario = usuarioDto.getEmailUsuario();
		String nombreUsuario = usuarioDto.getNombreUsuario();
		String password = usuarioDto.getPassword();
		String usuario = usuarioDto.getUsuario();
		
		if(cedulaUsuario != null) {
			myusuario.setCedulaUsuario(cedulaUsuario);
		}
		if(emailUsuario != null) {
			myusuario.setEmailUsuario(emailUsuario);
		}
		if(nombreUsuario != null) {
			myusuario.setNombreUsuario(nombreUsuario);
		}
		if(password != null) {
			myusuario.setPassword(password);
		}
		if(usuario != null) {
			myusuario.setUsuario(usuario);
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
