package com.mariolemos.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariolemos.cursomc.domain.Categoria;
import com.mariolemos.cursomc.repositories.CategoriaRepository;


@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	public void salvar(Categoria obj) {
		repo.save(obj);
	}
	
	public List<Categoria> buscarTodos() {
		List<Categoria> obj = repo.findAll();
		return obj;
		
	}

}
