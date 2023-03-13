package com.mintic.tienda;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mintic.tienda.dto.ClienteDto;
import com.mintic.tienda.dto.LoginDto;
import com.mintic.tienda.dto.SeguidoresDto;
import com.mintic.tienda.dto.PublicacionesDto;
import com.mintic.tienda.dto.SeguidoresDto;
import com.mintic.tienda.entities.Seguidores;
import com.mintic.tienda.servicio.ISeguidoresService;

@RestController
public class ControladorSeguidores {
	
	@Autowired
	ISeguidoresService iSeguidores;
	
	SeguidoresDto SeguidoresDto;
	
	@CrossOrigin(origins = "http://localhost:8091")
	@GetMapping("/Seguidores/{nombreSeguidores}")
	public SeguidoresDto MostarSeguidoresPorNombre(@PathVariable String nombreSeguidores) {
		return iSeguidores.buscarSeguidorPorNombre(nombreSeguidores);
	}
	
	
	@PostMapping("/crearSeguidores")
	public void crearSeguidores(@RequestBody SeguidoresDto SeguidoresDto) {
		iSeguidores.crearSeguidor(SeguidoresDto);
	}
	
	@DeleteMapping("/eliminarSeguidores/{nombreSeguidores}")
	public void eliminarSeguidores(@PathVariable String nombreSeguidores) {
		iSeguidores.eliminarSeguidor(nombreSeguidores);
	}
	
	@PatchMapping("/actualizarSeguidores/{nombreSeguidores}")
	public void actualizaralSeguidores(@PathVariable String nombreSeguidores, @RequestBody SeguidoresDto SeguidoresDto) {
		iSeguidores.actualizarSeguidor(nombreSeguidores, SeguidoresDto);;
	}
	
	@GetMapping("/Seguidoresslistar")
	public List<Seguidores> listaSeguidores() {
		return iSeguidores.listarSeguidores();
	}
	

	
}
