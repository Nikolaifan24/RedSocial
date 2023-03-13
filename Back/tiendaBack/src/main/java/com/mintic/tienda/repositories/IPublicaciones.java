package com.mintic.tienda.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import java.util.List;

import com.mintic.tienda.entities.Publicaciones;


public interface IPublicaciones extends CrudRepository<IPublicaciones, Long> {
	
	@Query(value = "SELECT * FROM publicaciones p INNER JOIN usuario u ON p.IDUsuario = u.IDUsuario WHERE u.NombreUsuario =: nombreUsuario ", nativeQuery = true)
	List<Publicaciones> buscarPublicacionesPorNombreUsuario(@Param("nombreUsuario") String nombreUsuario);
}
