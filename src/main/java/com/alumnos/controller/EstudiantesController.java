package com.alumnos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alumnos.impl.EstudiantesImplement;
import com.persistence_escuela.entity.Estudiantes;
import com.persistence_escuela.request.EstudiantesRequest;


@RestController
@RequestMapping("estudiantes/")
public class EstudiantesController {

	@Autowired
	EstudiantesImplement logic;
	
	@PostMapping
	ResponseEntity<Estudiantes> guardar(@RequestBody EstudiantesRequest request){
		Estudiantes e = logic.guardar(request);
		return new ResponseEntity<Estudiantes>(e, HttpStatus.OK);
	}
	
	@PutMapping
	ResponseEntity<Estudiantes> actualizar(@RequestBody EstudiantesRequest request){
		Estudiantes e = logic.actualizar(request);
		return new ResponseEntity<Estudiantes>(e, HttpStatus.OK);
	}
	
	@GetMapping
	ResponseEntity<List<Estudiantes>> mostrar(){
		List<Estudiantes> estudiantes = logic.mostrar();
		return new ResponseEntity<List<Estudiantes>>(estudiantes, HttpStatus.OK);
	}
	
	@GetMapping("buscar-por-id/{id}")
	ResponseEntity<Estudiantes> buscar(@PathVariable int id){
		Estudiantes e = logic.buscar(id);
		return new ResponseEntity<Estudiantes>(e, HttpStatus.OK);
	}
	
	@GetMapping("buscar-por-nombre/{name}")
	ResponseEntity<Estudiantes> buscar(@PathVariable String name){
		Estudiantes e = logic.buscar(name);
		return new ResponseEntity<Estudiantes>(e, HttpStatus.OK);
	}
	
	@DeleteMapping("eliminar/{id}")
	ResponseEntity<String> eliminar(@PathVariable int id){
		String m = logic.eliminar(id);
		return new ResponseEntity<String>(m, HttpStatus.OK);
	}
}
