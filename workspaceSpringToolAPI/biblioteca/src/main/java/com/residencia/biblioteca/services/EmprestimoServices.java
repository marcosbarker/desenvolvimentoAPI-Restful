package com.residencia.biblioteca.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.residencia.biblioteca.repositories.EmprestimoRepository;

@Service
public class EmprestimoServices {

	@Autowired
	public EmprestimoRepository emprestimoRepository;

}
