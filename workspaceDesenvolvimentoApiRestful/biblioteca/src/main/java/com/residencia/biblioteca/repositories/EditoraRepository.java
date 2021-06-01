package com.residencia.biblioteca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.residencia.biblioteca.entities.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Integer> {

}