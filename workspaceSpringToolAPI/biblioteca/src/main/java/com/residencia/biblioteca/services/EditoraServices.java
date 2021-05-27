package com.residencia.biblioteca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.repositories.EditoraRepository;

@Service
public class EditoraServices {

	@Autowired
	public EditoraRepository editoraRepository;

}
