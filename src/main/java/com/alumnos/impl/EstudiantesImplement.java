package com.alumnos.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alumnos.service.EstudiantesService;
import com.persistence_escuela.entity.Estudiantes;
import com.persistence_escuela.repository.EstudiantesRepository;
import com.persistence_escuela.request.EstudiantesRequest;

@Service
public class EstudiantesImplement implements EstudiantesService{
	
	@Autowired
	EstudiantesRepository repo;

	@Override
	public Estudiantes guardar(EstudiantesRequest request) {
		Estudiantes e = new Estudiantes();
		e.setNombre(request.getNombre());
		e.setTelefono(request.getTelefono());
		e.setEmail(request.getEmail());
		e.setFechaIngreso(request.getFechaIngreso());
		e.setCarrera(request.getCarrera());
		e.setColegiatura(request.getColegiatura());
		
		repo.save(e);
		return e;
	}

	@Override
	public Estudiantes actualizar(EstudiantesRequest request) {
		Estudiantes e = repo.findById(request.getIdEstudiante()).get();
		e.setNombre(request.getNombre());
		e.setTelefono(request.getTelefono());
		e.setEmail(request.getEmail());
		e.setFechaIngreso(request.getFechaIngreso());
		e.setCarrera(request.getCarrera());
		e.setColegiatura(request.getColegiatura());
		repo.save(e);
		return e;
	}

	@Override
	public Estudiantes buscar(int id) {
		
		return repo.findById(id).get();
	}


	@Override
	public String eliminar(int id) {
		repo.deleteById(id);
		return "Borrado";
	}

	@Override
	public List mostrar() {
		
		return repo.findAll();
	}

	@Override
	public Estudiantes buscar(String name) {
		Estudiantes e = null;
		if(repo.findByName(name).isPresent()) {
			e = repo.findByName(name).get();
			return e;
		}else {
			return e;
		}
	}

	

}
