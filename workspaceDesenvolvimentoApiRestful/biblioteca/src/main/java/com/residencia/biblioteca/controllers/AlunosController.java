package com.residencia.biblioteca.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.residencia.biblioteca.entities.Alunos;
import com.residencia.biblioteca.services.AlunosService;

@RestController
@RequestMapping("/alunos")
public class AlunosController {

	@Autowired
    private AlunosService alunosService;
	
	@GetMapping("/{id}")
	public ResponseEntity<Alunos> findById(@PathVariable Integer id) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(alunosService.findById(id), 
				headers, HttpStatus.OK);
	}
	
	@GetMapping
	public ResponseEntity<List<Alunos>> findAll() 
					throws Exception {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(alunosService.findAll(), 
				headers, HttpStatus.OK);
	}

	@GetMapping("/matricula")
	public ResponseEntity<List<Alunos>> listByMatricula(@RequestParam(required = true) Integer matricula) {
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<>(alunosService.listByMatricula(matricula), headers, HttpStatus.OK);
	}
	
	@GetMapping("/count")
	public Long count() {
		return alunosService.count();
	}
	
	@PostMapping
	public ResponseEntity<Alunos> save(Alunos alunos){
		//return alunoService.save(aluno);
		HttpHeaders headers = new HttpHeaders();
		
		if(null != alunosService.save(alunos))
			return new ResponseEntity<>(alunosService.save(alunos), headers, HttpStatus.OK);
		else
			return new ResponseEntity<>(alunosService.save(alunos), headers, HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping
    public Alunos update(Alunos alunos){
       return alunosService.update(alunos);
    }
	
}
