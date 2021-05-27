package com.residencia.biblioteca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.repositories.LivrosRepository;

@Service
public class LivrosServices {

	@Autowired
	public LivrosRepository livrosRepository;

}
