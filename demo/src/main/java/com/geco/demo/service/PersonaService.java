package com.geco.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.geco.demo.interfaceService.IpersonaService;
import com.geco.demo.interfaces.Persona1;
import com.geco.demo.modelo.Persona;


@Service
public class PersonaService implements IpersonaService{
	
	@Autowired
	private Persona1 data;
	
	
	@Override
	public List<Persona> Listar() {
		
		return (List<Persona>)data.findAll();
	}

	@Override
	public Optional<Persona> ListarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Persona p) {
		int res = 0;
		Persona persona=data.save(p);
		if(!persona.equals (null)) {
			res=1;
		}
		return res;
	}

	@Override
	public void delete(int Id) {
		data.deleteById(Id);
		
	}

}
