package com.geco.demo.interfaceService;

import com.geco.demo.modelo.Persona;
import java.util.List;
import java.util.Optional;


public interface IpersonaService {
	public List<Persona>Listar();
	public Optional<Persona>ListarId(int id);
	public int save(Persona p);
	public void delete (int Id);

}
