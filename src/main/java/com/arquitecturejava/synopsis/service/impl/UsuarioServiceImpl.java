package com.arquitecturejava.synopsis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.arquitecturejava.synopsis.commons.GenericServiceImpl;
import com.arquitecturejava.synopsis.dao.api.UsuarioDaoAPI;
import com.arquitecturejava.synopsis.model.Usuario;
import com.arquitecturejava.synopsis.service.api.UsuarioServiceAPI;


@Service
public class UsuarioServiceImpl extends GenericServiceImpl<Usuario, Long> implements UsuarioServiceAPI{

	@Autowired
	private UsuarioDaoAPI usuarioDaoAPI;
	
	@Override
	public CrudRepository<Usuario, Long> getDao() {	
		return usuarioDaoAPI;
	}

}
