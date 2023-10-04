package com.alumnos.service;

import java.util.List;

import com.alumnos.exception.CarreraNotFounfException;
import com.persistence_escuela.entity.Estudiantes;
import com.persistence_escuela.request.EstudiantesRequest;

public interface EstudiantesService {
	
	Estudiantes guardar(EstudiantesRequest request)throws CarreraNotFounfException;
	Estudiantes actualizar(EstudiantesRequest request)throws CarreraNotFounfException;
	Estudiantes buscar(int id);
	Estudiantes buscar(String name);
	String eliminar(int id);
	List mostrar();
	
}
