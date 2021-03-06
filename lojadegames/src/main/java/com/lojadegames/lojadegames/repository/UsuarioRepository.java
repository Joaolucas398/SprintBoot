package com.lojadegames.lojadegames.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.lojadegames.lojadegames.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	//Optional é pq ele pode retornar nulo
	public Optional<Usuario> findByUsuario(String usuario);
	

}
