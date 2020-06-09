package com.geco.demo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.geco.demo.modelo.Persona;
@Repository
public interface Persona1 extends CrudRepository<Persona, Integer> {

}
