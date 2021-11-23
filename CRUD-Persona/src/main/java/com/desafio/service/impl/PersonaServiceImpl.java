package com.desafio.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.desafio.commons.GenericServiceImpl;
import com.desafio.dao.api.PersonaDaoAPI;
import com.desafio.model.Persona;
import com.desafio.service.api.PersonaServiceAPI;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaServiceAPI{
	
	@Autowired
	private PersonaDaoAPI personaDaoAPI;

	@Override
	public CrudRepository<Persona, Long> getDao(){
		return personaDaoAPI;
	}
}
