package com.arquitecturejava.synopsis.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.arquitecturejava.synopsis.model.Usuario;



public interface UsuarioDaoAPI extends CrudRepository<Usuario, Long> {

}
