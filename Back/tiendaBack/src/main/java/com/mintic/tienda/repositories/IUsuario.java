package com.mintic.tienda.repositories;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mintic.tienda.entities.Usuarios;

/*
 * Aqui se realizan las opereciones crud    los parametros son la entidad  y el tipo de datos que se definio como @id en la entidad  
 * 
 * ejemplo entidad Usuario
 *	 @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	el id es long debe ir igual en el crud repository <Usuario, Long>
 * 
 * 
 * */
public interface IUsuario extends CrudRepository<Usuarios, Long> {

	@Query(value = "SELECT * FROM Usuarios u where u.nombreUsuario =:nombreUsuario", nativeQuery = true)
	Usuarios buscarUsuarioPornombreUsuario(@Param("nombreUsuario") String nombreUsuario);

}
