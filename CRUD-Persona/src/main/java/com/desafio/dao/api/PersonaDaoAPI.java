package com.desafio.dao.api;

import org.springframework.data.repository.CrudRepository;

import com.desafio.model.Persona;

public interface PersonaDaoAPI extends CrudRepository<Persona, Long>{

}
