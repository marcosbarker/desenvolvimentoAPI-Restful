package com.residencia.biblioteca.entities;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emprestimo")
public class Emprestimo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigoemprestimo")
    private Integer codigoEmprestimo;

    @ManyToOne
    @JoinColumn(name = "numeromatriculaaluno", referencedColumnName = "numeromatriculaaluno")
    private Alunos instanciaAlunos;

    @ManyToOne
    @JoinColumn(name = "codigolivro", referencedColumnName = "codigolivro")
    private Livros livros;

    @Column(name = "dataemprestimo")
    private Calendar dataEmprestimo;

    @Column(name = "valoremprestimo")
    private BigDecimal valorEmprestimo;

	public Integer getCodigoEmprestimo() {
		return codigoEmprestimo;
	}

	public void setCodigoEmprestimo(Integer codigoEmprestimo) {
		this.codigoEmprestimo = codigoEmprestimo;
	}

	public Alunos getInstanciaAlunos() {
		return instanciaAlunos;
	}

	public void setInstanciaAlunos(Alunos instanciaAlunos) {
		this.instanciaAlunos = instanciaAlunos;
	}

	public Livros getLivros() {
		return livros;
	}

	public void setLivros(Livros livros) {
		this.livros = livros;
	}

	public Calendar getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Calendar dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public BigDecimal getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(BigDecimal valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}
    
}