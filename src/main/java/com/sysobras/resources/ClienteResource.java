package com.sysobras.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sysobras.domain.Cliente;
import com.sysobras.services.ClienteService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id) {
		Cliente cliente = service.get(id);
		return ResponseEntity.ok(cliente);
		
	}
	
	@RequestMapping(value="/addCliente", method = RequestMethod.POST)
	public void add(@RequestBody Cliente cliente) {
	    service.save(cliente);
	}
	
	@RequestMapping(value="/listaClientes", method = RequestMethod.GET)
	public List<Cliente> listAll(){
		return service.listAll();
	}

	@RequestMapping(value="/removeCliente/{id}", method = { RequestMethod.GET, RequestMethod.POST} )
	public ResponseEntity<?> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
