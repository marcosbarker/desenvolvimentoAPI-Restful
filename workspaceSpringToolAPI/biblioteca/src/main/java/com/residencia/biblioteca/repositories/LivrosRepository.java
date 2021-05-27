package com.residencia.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.residencia.biblioteca.entities.Livros;

public interface LivrosRepository extends JpaRepository<Livros, Integer>{

}
