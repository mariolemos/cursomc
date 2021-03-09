package com.mariolemos.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mariolemos.cursomc.domain.Pedido;
import com.mariolemos.cursomc.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {
	
	@Autowired
	private PedidoService service;	

	@RequestMapping(value = "/{id}",method = RequestMethod.GET)
	public ResponseEntity<Pedido> find(@PathVariable Integer id) {
		Pedido obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);		
	}

	/*@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	 public ResponseEntity<Void> salvar(@RequestBody Pedido obj) {
		 service.salvar(obj);
		 return ResponseEntity.ok().build();
	 }
	@RequestMapping(method = RequestMethod.GET)
	 public ResponseEntity<List<Pedido>> listarTodos() {
		 List<Pedido> obj = service.buscarTodos();
		 return ResponseEntity.ok().body(obj);
	 }*/

}
