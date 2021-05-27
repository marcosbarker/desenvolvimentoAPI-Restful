package com.residencia.biblioteca.entities;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * @author Marcos Paulo Marques Corrêa
 * @date 26/05/2021
 */

@Entity
@Table(name = "emprestimo")

public class Emprestimo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numeromatriculaaluno")
	private Integer numeroMatriculaAluno; // 'chave primaria', tabela 'alunos'

	@ManyToOne // mapeametno para aluno
	@JoinColumn(name = "numeromatriculaaluno", referencedColumnName = "numeromatriculaaluno") // numeromatriculaaluno =
	private Alunos aluno; // Alunos = 'Classe' - aluno = 'instancia(referencia)'

	@ManyToOne
	@JoinColumn(name = "codigolivro", referencedColumnName = "codigolivro")
	private Livros livro;

	@OneToMany(mappedBy = "livros")
	private List<Livros> listLivros;

	@Column(name = "codigoemprestimo")
	private Integer codigoEmprestimo;

	@Column(name = "codigolivro")
	private Integer codigoLivro;

	@Column(name = "dataemprestimo")
	private Calendar dataEmprestimo;

	@Column(name = "dataentrega")
	private Calendar dataEntrega;

	@Column(name = "valoremprestimo")
	private BigDecimal valorEmprestimo;

	public Alunos getAluno() {
		return aluno;
	}

	public void setAluno(Alunos aluno) {
		this.aluno = aluno;
	}

	public Livros getLivro() {
		return livro;
	}

	public void setLivro(Livros livro) {
		this.livro = livro;
	}

	public List<Livros> getListLivros() {
		return listLivros;
	}

	public void setListLivros(List<Livros> listLivros) {
		this.listLivros = listLivros;
	}

	public Integer getCodigoEmprestimo() {
		return codigoEmprestimo;
	}

	public void setCodigoEmprestimo(Integer codigoEmprestimo) {
		this.codigoEmprestimo = codigoEmprestimo;
	}

	public Integer getNumeroMatriculaAluno() {
		return numeroMatriculaAluno;
	}

	public void setNumeroMatriculaAluno(Integer numeroMatriculaAluno) {
		this.numeroMatriculaAluno = numeroMatriculaAluno;
	}

	public Integer getCodigoLivro() {
		return codigoLivro;
	}

	public void setCodigoLivro(Integer codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

	public Calendar getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Calendar dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Calendar getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(Calendar dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public BigDecimal getValorEmprestimo() {
		return valorEmprestimo;
	}

	public void setValorEmprestimo(BigDecimal valorEmprestimo) {
		this.valorEmprestimo = valorEmprestimo;
	}

}