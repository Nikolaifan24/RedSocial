package com.mintic.tienda.servicio;

import java.util.List;

import com.mintic.tienda.dto.SeguidoresDto;
import com.mintic.tienda.entities.Seguidores;

public interface ISeguidoresService {

	List<Seguidores> listarSeguidores();

	void crearSeguidor(SeguidoresDto SeguidoresDto);

	SeguidoresDto buscarProductoPorCodigo(Long codigoProducto);

	List<Seguidores> getSeguidores();
}
