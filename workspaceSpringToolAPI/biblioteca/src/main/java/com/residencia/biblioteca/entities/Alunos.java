package com.residencia.biblioteca.entities;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/*
 * @author Marcos Paulo Marques Corrêa
 * @date 26/05/2021
 */

@Entity
@Table(name = "alunos") // tabela do banco de dados - mesmo nome, relaciona a entidade

public class Alunos {

	// todos atributos sao privados
	@Id // restrita(unica), coluna chave primaria, identificador da propriedade
	@GeneratedValue(strategy = GenerationType.IDENTITY) // estrategia de geracao da chave primaria
	@Column(name = "numeromatriculaaluno") // atribui coluna
	private Integer numeroMatriculaAluno; // nome de referencia para restante do projeto, pode ser nome escolhido

	@OneToMany(mappedBy = "aluno") // mappedBy = 'nome da instancia', sem relacao com a tabela do BD
	private List<Emprestimo> listEmprestimo; // <refetente a classe> + nome de referencia

	@Column(name = "nome")
	private String nome;

	@Column(name = "datadenascimento")
	private Calendar dataDeNascimento;

	@Column(name = "cpf")
	private String cpf;

	@Column(name = "logradouro")
	private String logradouro;

	@Column(name = "numerologradouro")
	private Integer numeroLogradouro;

	@Column(name = "complemento")
	private String complento;

	@Column(name = "bairro")
	private String bairro;

	@Column(name = "cidade")
	private String cidade;

	public List<Emprestimo> getListEmprestimo() {
		return listEmprestimo;
	}

	public void setListEmprestimo(List<Emprestimo> listEmprestimo) {
		this.listEmprestimo = listEmprestimo;
	}

	public Integer getNumeroMatriculaAluno() {
		return numeroMatriculaAluno;
	}

	public void setNumeroMatriculaAluno(Integer numeroMatriculaAluno) {
		this.numeroMatriculaAluno = numeroMatriculaAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Integer getNumeroLogradouro() {
		return numeroLogradouro;
	}

	public void setNumeroLogradouro(Integer numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}

	public String getComplento() {
		return complento;
	}

	public void setComplento(String complento) {
		this.complento = complento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

}

/*
 * referencias: -
 * https://dev.to/jhonifaber/hibernate-onetoone-onetomany-manytoone-and-
 * manytomany-8ba -
 * https://ankitkamboj18.medium.com/a-guide-to-jpa-with-hibernate-relationship-
 * mappings-onetoone-onetomany-manytoone-310ce31df3f6 -
 * https://www.baeldung.com/jpa-many-to-many
 * 
 * A anotação @JoinColumn indica que a classe na qual você está utilizando-a é a
 * dona ou o lado forte do relacionamento. Isso apenas adciona uma coluna
 * estrangeira ao lado forte.
 * 
 * Já o parametro mappedBy que fica dentro do @OneToMany é usado no lado fraco
 * do relacionamento.
 * 
 * O mappedBy faz com que o relacionamento fique bidirecional.
 */