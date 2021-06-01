package com.residencia.biblioteca.entities;

import java.util.Calendar;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "livros")
public class Livros {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigolivro")
    private Integer codigoLivro;

    @OneToMany(mappedBy = "livros")
    private List<Emprestimo> listEmprestimo;

    @OneToOne
    @JoinColumn(name= "codigoeditora", referencedColumnName = "codigoEditora")
    private Editora instanciaEditora;

    @Column(name = "nomelivro")
    private String nomeLivro;

    @Column(name = "nomeautor")
    private String nomeAutor;

    @Column(name = "datalancamento")
    private Calendar dataLancamento;

    @Column(name = "codigoisbn")
    private String codigoIsbn;

	public Integer getCodigoLivro() {
		return codigoLivro;
	}

	public void setCodigoLivro(Integer codigoLivro) {
		this.codigoLivro = codigoLivro;
	}

	public List<Emprestimo> getListEmprestimo() {
		return listEmprestimo;
	}

	public void setListEmprestimo(List<Emprestimo> listEmprestimo) {
		this.listEmprestimo = listEmprestimo;
	}

	public Editora getInstanciaEditora() {
		return instanciaEditora;
	}

	public void setInstanciaEditora(Editora instanciaEditora) {
		this.instanciaEditora = instanciaEditora;
	}

	public String getNomeLivro() {
		return nomeLivro;
	}

	public void setNomeLivro(String nomeLivro) {
		this.nomeLivro = nomeLivro;
	}

	public String getNomeAutor() {
		return nomeAutor;
	}

	public void setNomeAutor(String nomeAutor) {
		this.nomeAutor = nomeAutor;
	}

	public Calendar getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Calendar dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getCodigoIsbn() {
		return codigoIsbn;
	}

	public void setCodigoIsbn(String codigoIsbn) {
		this.codigoIsbn = codigoIsbn;
	}

}