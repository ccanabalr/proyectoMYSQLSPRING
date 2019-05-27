package com.bolsadeideas.springboot.apirest.models.services;

import com.bolsadeideas.springboot.apirest.models.entity.Usuario;

public interface IUsuarioService {
	
	public Usuario findByUsername(String username);
}
