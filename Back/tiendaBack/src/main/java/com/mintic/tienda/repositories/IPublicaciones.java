package com.mintic.tienda.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.mintic.tienda.entities.Publicaciones;

public interface IPublicaciones extends CrudRepository<IPublicaciones, Long> {
	
	@Query(value = "SELECT * FROM Proveedores c where c.nitProveedor=:nitProveedor", nativeQuery = true)
	IPublicaciones buscarProveedorPorNit(@Param("nitProveedor") Long nitProveedor);
}
