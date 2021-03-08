package com.mariolemos.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mariolemos.cursomc.domain.Pedido;
import com.mariolemos.cursomc.repositories.PedidoRepository;
import com.mariolemos.cursomc.services.exceptions.ObjectNotFoundException;


@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(()-> new ObjectNotFoundException("Objeto nâo encontrado! Id: " + id + ", Tipo:" + Pedido.class.getName()));
	}
	
/*	public void salvar(Pedido obj) {
		repo.save(obj);
	}
	
	public List<Pedido> buscarTodos() {
		List<Pedido> obj = repo.findAll();
		return obj;
		
	}*/

}
