package com.sysobras.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sysobras.domain.Cliente;
import com.sysobras.repositories.ClienteRepository;
import com.sysobras.services.execption.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;


    public List<Cliente> listAll() {
        return clienteRepository.findAll();
    }
     
    public void save(Cliente cliente) {
    	clienteRepository.save(cliente);
    }
     
    public Cliente get(Long id) {
    	Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.orElseThrow( () -> new ObjectNotFoundException("Objeto nao encontrado com o ID: " 
		                                                              + id + " " + Cliente.class.getName()));
    }
     
    public void delete(Long id) {
    	clienteRepository.deleteById(id);
    }
	
	
	

}
