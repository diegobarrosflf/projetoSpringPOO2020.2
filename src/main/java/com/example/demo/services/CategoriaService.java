package com.example.demo.services;

import java.util.Optional;

import com.example.demo.domain.Categoria;
import com.example.demo.repositories.CategoriaRespository;

public class CategoriaService {
	
	
	private CategoriaRespository repository;

	public Categoria find(Integer id) {

		Optional<Categoria> obj = repository.findById(id);
		
		return obj.orElse(null);
	}
	
	

}
