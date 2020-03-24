package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Cliente;

@Repository
public interface IClienteDao extends JpaRepository<Cliente, Long>{
	
	public List<Cliente> findAll();

}
