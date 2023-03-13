package com.mintic.tienda.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mintic.tienda.dto.ClienteDto;
import com.mintic.tienda.dto.SeguidoresDto;
import com.mintic.tienda.entities.Seguidores;
import com.mintic.tienda.repositories.ISeguidores;

@Service
public class SeguidoresImp implements ISeguidoresService {

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
		Seguidores mySeguidor= new Seguidores();
		
		String nombreUsuario= SeguidoresDto.getNombreUsuario();
		int numeroSeguidores = SeguidoresDto.getNumeroSeguidores();
		
		
		
		if(nombreUsuario != null) {
			mySeguidor.setNombreUsuario(nombreUsuario);
		}
		if(numeroSeguidores != 0) {
			mySeguidor.setNumeroSeguidores(numeroSeguidores);
		}
				
		
		return mySeguidor;
		
	}
	
	private void updateSeguidor(SeguidoresDto SeguidoresDto, Seguidores mySeguidor) {
		
		String nombreUsuario= SeguidoresDto.getNombreUsuario();
		int numeroSeguidores = SeguidoresDto.getNumeroSeguidores();
		
		
		if(nombreUsuario != null) {
			mySeguidor.setNombreUsuario(nombreUsuario);
		}
		if(numeroSeguidores != 0) {
			mySeguidor.setNumeroSeguidores(numeroSeguidores);
		}
		
		iSeguidor.save(mySeguidor);
	}
	

	@Override
	public void eliminarSeguidor(String nombreUsuario) {
		Seguidores Seguidores= iSeguidor.buscarUsuarioPornombreUsuario(nombreUsuario);
		iSeguidor.delete(Seguidores);
		
	}

	@Override
	public void actualizarSeguidor(String nombreUsuario, SeguidoresDto SeguidoresDto) {
		
		Seguidores Seguidores= iSeguidor.buscarUsuarioPornombreUsuario(nombreUsuario);
		updateSeguidor(SeguidoresDto, Seguidores);
		
	}

	@Override
	public SeguidoresDto buscarSeguidorPorNombre(String nombreUsuario) {
		Seguidores Seguidores= null;
		try {
			Seguidores= iSeguidor.buscarUsuarioPornombreUsuario(nombreUsuario);
			SeguidoresDto  SeguidoresDto = mapSeguidoresDto(Seguidores);
			return SeguidoresDto;
		} catch (Exception e) {
			return null;
		}
		
	}

	private SeguidoresDto mapSeguidoresDto(Seguidores Seguidor) {
		return new SeguidoresDto(
				Seguidor.getIDSeguidor(),
				Seguidor.getNombreUsuario(),
				Seguidor.getNumeroSeguidores()
				
			);		
	}



	
}
