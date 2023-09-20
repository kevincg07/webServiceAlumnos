package com.alumnos.service;

import java.util.List;

import com.persistence_escuela.entity.Estudiantes;
import com.persistence_escuela.request.EstudiantesRequest;

public interface EstudiantesService {
	
	Estudiantes guardar(EstudiantesRequest request);
	Estudiantes actualizar(EstudiantesRequest request);
	Estudiantes buscar(int id);
	Estudiantes buscar(String name);
	String eliminar(int id);
	List mostrar();
	
}
