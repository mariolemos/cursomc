package com.mariolemos.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mariolemos.cursomc.domain.Cliente;
import com.mariolemos.cursomc.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;	

	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);		
	}

	/*@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	 public ResponseEntity<Void> salvar(@RequestBody Cliente obj) {
		 service.salvar(obj);
		 return ResponseEntity.ok().build();
	 }
	@RequestMapping(method = RequestMethod.GET)
	 public ResponseEntity<List<Cliente>> listarTodos() {
		 List<Cliente> obj = service.buscarTodos();
		 return ResponseEntity.ok().body(obj);
	 }*/

}
