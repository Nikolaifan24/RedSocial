package com.mintic.tienda.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mintic.tienda.entities.Seguidores;

public interface ISeguidores extends CrudRepository<Seguidores, Long> {

	@Query(value = "SELECT COUNT(*) FROM seguidores s INNER JOIN usuario u ON s.IDUsuario = u.IDUsuario WHERE u.NombreUsuario =: nombreUsuario ", nativeQuery = true)
	int ContadorSeguidos(@Param("nombreUsuario") String nombreUsuario);

	@Query(value = "SELECT * FROM Seguidores s INNER JOIN Usuarios u ON s.IDUsuario = u.IDUsuario where s.nombreUsuario =:nombreUsuario", nativeQuery = true)
	Seguidores buscarUsuarioPornombreUsuario(@Param("nombreUsuario") String nombreUsuario);
	

}
