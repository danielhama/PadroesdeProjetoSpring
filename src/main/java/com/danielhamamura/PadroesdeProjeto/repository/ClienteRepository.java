package com.danielhamamura.PadroesdeProjeto.repository;


import com.danielhamamura.PadroesdeProjeto.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
