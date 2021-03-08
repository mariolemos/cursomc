package com.mariolemos.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariolemos.cursomc.domain.Cliente;
import com.mariolemos.cursomc.repositories.ClienteRepository;
import com.mariolemos.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto nâo encontrado! Id: " + id + ", Tipo:" + Cliente.class.getName()));
	}
	
/*	public void salvar(Cliente obj) {
		repo.save(obj);
	}
	
	public List<Cliente> buscarTodos() {
		List<Cliente> obj = repo.findAll();
		return obj;
		
	}*/

}
