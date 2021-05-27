package com.residencia.biblioteca.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.entities.Alunos;
import com.residencia.biblioteca.repositories.AlunosRepository;

@Service
public class AlunosServices {

	@Autowired // simplifica a instanciacao
	public AlunosRepository alunosRepository;

	public Alunos findByDi(Integer id) { // finById = retorna um 'aluno'
		return alunosRepository.findById(id).get(); // recebe ID
	}

	public List<Alunos> findAll() {
		return alunosRepository.findAll(); // nao recebe, devolve lista
	}

	public Long count() {
		return alunosRepository.count();
	}

	public Alunos save(Alunos alunos) { //
		Alunos novoAluno = alunosRepository.save(alunos);
		return novoAluno;
	}

}
