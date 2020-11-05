package com.sysobras.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sysobras.domain.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>{}

	
	


