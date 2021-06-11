package com.residencia.dell.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.residencia.dell.entities.Category;


@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{
	
}
