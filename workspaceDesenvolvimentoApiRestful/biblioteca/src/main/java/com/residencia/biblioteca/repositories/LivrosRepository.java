package com.residencia.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.residencia.biblioteca.entities.Livros;


@Repository
public interface LivrosRepository extends JpaRepository<Livros, Integer>{
	
}
