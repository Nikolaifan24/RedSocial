package com.mintic.tienda.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.tienda.dto.ClienteDto;
import com.mintic.tienda.dto.SeguidoresDto;
import com.mintic.tienda.entities.Seguidores;
import com.mintic.tienda.repositories.ISeguidores;

@Service
public class SeguidoresImp implements ISeguidoreService {

	@Autowired
	ISeguidores iSeguidor;
	
	
	@Override
	public List<Seguidores> listarSeguidores() {
		return (List<Seguidores>) iSeguidor.findAll();
	}



	@Override
	public void crearSeguidor(SeguidoresDto SeguidoresDto) {
		iSeguidor.save(buildSeguidor(SeguidoresDto));
		
	}

	private Seguidores buildSeguidor(SeguidoresDto SeguidoresDto) {
		Seguidores mySeguidores= new Seguidores();
		
		String nombre= SeguidoresDto.getNombre();
		String apellido = SeguidoresDto.getApellido();
		String nombreSeguidores= SeguidoresDto.getNombreSeguidor();
		String emailSeguidores= SeguidoresDto.getCorreo();
		String password = SeguidoresDto.getContrasena();
		String correo  = SeguidoresDto.getCorreo();
		// mySeguidor.setID(id);
		
		if(nombre != null) {
			mySeguidor.setNombre(nombreSeguidor);
		}
		if(apellido != null) {
			mySeguidor.setApellido(apellido);
		}
		if(nombreSeguidores!= null) {
			mySeguidor.setNombreSeguidor(nombreSeguidor);
		}
		if(password != null) {
			mySeguidor.setContrasena(correo);
		}
		if(correo != null) {
			mySeguidor.setCorreo(correo);
		}
		
		
		return mySeguidor;
		
	}
	
	private void updateSeguidor(SeguidoresDto SeguidoresDto, Seguidores mySeguidor) {
		
		String nombre= SeguidoresDto.getNombre();
		String apellido = SeguidoresDto.getApellido();
		String nombreSeguidores= SeguidoresDto.getNombreSeguidor();
		String emailSeguidores= SeguidoresDto.getCorreo();
		String password = SeguidoresDto.getContrasena();
		String correo  = SeguidoresDto.getCorreo();
		// mySeguidor.setID(id);
		
		if(nombre != null) {
			mySeguidor.setNombre(nombreSeguidor);
		}
		if(apellido != null) {
			mySeguidor.setApellido(apellido);
		}
		if(nombreSeguidores!= null) {
			mySeguidor.setNombreSeguidor(nombreSeguidor);
		}
		if(password != null) {
			mySeguidor.setContrasena(correo);
		}
		if(correo != null) {
			mySeguidor.setCorreo(correo);
		}
		
		iSeguidor.save(mySeguidor);
	}
	

	@Override
	public void eliminarSeguidor(String nombreSeguidor) {
		Seguidores Seguidores= iSeguidor.buscarSeguidorPornombreSeguidor(nombreSeguidor);
		iSeguidor.delete(Seguidor);
		
	}

	@Override
	public void actualizarSeguidor(String nombreSeguidor, SeguidoresDto SeguidoresDto) {
		
		Seguidores Seguidores= iSeguidor.buscarSeguidorPornombreSeguidor(nombreSeguidor);
		updateSeguidor(SeguidoresDto, Seguidor);
		
	}

	@Override
	public SeguidoresDto buscarSeguidorPorNombre(String nombreSeguidor) {
		Seguidores Seguidores= null;
		try {
			Seguidores= iSeguidor.buscarSeguidorPornombreSeguidor(nombreSeguidor);
			SeguidoresDto  SeguidoresDto = mapSeguidoresDto(Seguidor);
			return SeguidoresDto;
		} catch (Exception e) {
			return null;
		}
		
	}

	private SeguidoresDto mapSeguidoresDto(Seguidores Seguidor) {
		return new SeguidoresDto(
				Seguidor.getIDSeguidor(),
				Seguidor.getNombre(),
				Seguidor.getApellido(),
				Seguidor.getNombreSeguidor(),
				Seguidor.getContrasena(),
				Seguidor.getCorreo()
				
			);		
	}

	


	
}
