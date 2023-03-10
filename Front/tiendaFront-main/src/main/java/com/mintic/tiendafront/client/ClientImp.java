package com.mintic.tiendafront.client;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClientResponseException;

import com.mintic.tiendafront.dto.LoginDto;
import com.mintic.tiendafront.dto.TipoDocumento;
import com.mintic.tiendafront.dto.Usuario;
import com.mintic.tiendafront.dto.UsuarioResponse;

import reactor.core.publisher.Mono;

@Service
public class ClientImp implements IClientTienda {

	private static final String URL = "http://localhost:8090/tienda";

	@Autowired
	private WebClient.Builder webClient;

	@Override
	public int login(LoginDto loginDto) {
		try {
			/*
			 * aqui nos conectamos al back  directamente al controlador donde estan las rutas 
			 * el back espera recibir un dto  por eso enviamos el dto login dto
			  * */

			Mono<Integer> response = webClient.build().post().uri(URL + "/loginclient")
					.accept(MediaType.APPLICATION_JSON).body(Mono.just(loginDto), LoginDto.class).retrieve()
					.bodyToMono(Integer.class);

			//Aqui se captura la respuesta del back 
			return response.block();

		} catch (WebClientResponseException e) {
			e.getMessage();
			System.out.println("---->" + e.getMessage());
			return 0;
		}

	}

	@Override
	public List<UsuarioResponse> getUsuarios() {

		try {
			Mono<List> response = webClient.build().get().uri(URL + "/usuarios").retrieve()
					.bodyToMono(List.class);

			return response.block();
		} catch (Exception e) {

			return null;
		}

	}

	@Override
	public UsuarioResponse nuevoUsuario(Usuario usuarioDto) {

		try {

			UsuarioResponse u = null;
			Mono<UsuarioResponse> response = webClient.build().post().uri(URL + "/usuarios")
					.body(Mono.just(usuarioDto), UsuarioResponse.class).retrieve().bodyToMono(UsuarioResponse.class);

			u = response.block();
			return u;

		} catch (WebClientResponseException e) {
			e.getMessage();
			System.out.println("---->" + e.getMessage());
			return null;
		}

	}

	@Override
	public UsuarioResponse buscarUsuario(Long id) {
		// TODO Auto-generated method stub
		try {

			Mono<UsuarioResponse> response = webClient.build().get().uri(URL + "/usuarios/" + id)
					.retrieve().bodyToMono(UsuarioResponse.class);

			return response.block();
		} catch (Exception e) {

			return null;
		}

	}

	@Override
	public int borrarUsuario(Long id) {
		try {

			Mono<Integer> response = webClient.build().delete().uri(URL + "/usuarios/" + id)
					.retrieve().bodyToMono(Integer.class);

			return response.block();

		} catch (WebClientResponseException e) {
			e.getMessage();
			System.out.println("---->" + e.getMessage());
			return 0;
		}
	}

	@Override
	public List<TipoDocumento> getTipoDocumento() {
		try {
			Mono<List> response = webClient.build().get().uri(URL + "/tipodocumento").retrieve()
					.bodyToMono(List.class);

			return response.block();
		} catch (Exception e) {

			return null;
		}

	}

}
