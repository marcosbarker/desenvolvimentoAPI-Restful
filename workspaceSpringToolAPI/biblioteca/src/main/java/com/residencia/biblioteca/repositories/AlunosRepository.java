package com.residencia.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.residencia.biblioteca.entities.Alunos;

@Repository
public interface AlunosRepository extends JpaRepository<Alunos, Integer>{ //'Alunos' = entidade(classe), 'Integer' = mesma variavel que esta em ID alunos

}


