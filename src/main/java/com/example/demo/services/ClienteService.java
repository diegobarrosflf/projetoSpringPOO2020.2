package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.Cliente;
import com.example.demo.repositories.ClienteRepository;
import com.example.demo.services.exception.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repositorio;
	
	public Cliente find(Integer id) {
		Optional<Cliente> obj = repositorio.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado id:" + id + "Tipo: " + Cliente.class.getName())
				);
	}
	

}
