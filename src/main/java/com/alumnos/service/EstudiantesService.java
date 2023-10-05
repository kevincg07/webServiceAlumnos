package com.alumnos.service;

import java.util.List;

import com.alumnos.exception.CarreraNotFounfException;
import com.alumnos.exception.IdAlumnoNotFoundException;
import com.persistence_escuela.entity.Estudiantes;
import com.persistence_escuela.request.EstudiantesRequest;

public interface EstudiantesService {
	
	Estudiantes guardar(EstudiantesRequest request)throws CarreraNotFounfException;
	Estudiantes actualizar(EstudiantesRequest request)throws CarreraNotFounfException;
	Estudiantes buscar(int id)throws IdAlumnoNotFoundException;
	Estudiantes buscar(String name);
	String eliminar(int id)throws IdAlumnoNotFoundException;
	List mostrar();
	
}
