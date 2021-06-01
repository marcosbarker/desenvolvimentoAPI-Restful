package com.residencia.biblioteca.services;

import com.residencia.biblioteca.entities.Alunos;
import com.residencia.biblioteca.repositories.AlunosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunosService {

    @Autowired
    public AlunosRepository alunosRepository;

    public Alunos findById(Integer id) {
        return alunosRepository.findById(id).get();
        
    }

    public List<Alunos> findAll() {
        return alunosRepository.findAll();
    }

    public Long count() {
        return alunosRepository.count();
    }

    public Alunos save(Alunos alunos) {
        Alunos novoAluno = alunosRepository.save(alunos);
        if (novoAluno.getNumeroMatriculaAluno() != null)
            return novoAluno;
        else {
            return null;
        }

    }
    public Alunos update(Integer id, Alunos aluno){
        Alunos atualizaAluno = alunosRepository.findById(id).get();
        atualizaAluno.setCpfAluno(aluno.getCpfAluno());
        atualizaAluno.setBairro(aluno.getBairro());
        atualizaAluno.setNumeroMatriculaAluno(aluno.getNumeroMatriculaAluno());
        atualizaAluno.setNomeAluno(aluno.getNomeAluno());
        atualizaAluno.setCidade(aluno.getCidade());
        atualizaAluno.setComplemento(aluno.getComplemento());
        atualizaAluno.setListaEmprestimosAluno(aluno.getListaEmprestimosAluno());
        atualizaAluno.setLogradouro(aluno.getLogradouro());
        atualizaAluno.setNumeroLogradouro(aluno.getNumeroLogradouro());
        return alunosRepository.save(atualizaAluno);

    }
}