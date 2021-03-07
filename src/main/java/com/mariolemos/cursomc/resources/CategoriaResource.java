package com.mariolemos.cursomc.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mariolemos.cursomc.domain.Categoria;
import com.mariolemos.cursomc.services.CategoriaService;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;	

	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);		
	}

	/*@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	 public ResponseEntity<Void> salvar(@RequestBody Categoria obj) {
		 service.salvar(obj);
		 return ResponseEntity.ok().build();
	 }
	@RequestMapping(method = RequestMethod.GET)
	 public ResponseEntity<List<Categoria>> listarTodos() {
		 List<Categoria> obj = service.buscarTodos();
		 return ResponseEntity.ok().body(obj);
	 }*/

}
