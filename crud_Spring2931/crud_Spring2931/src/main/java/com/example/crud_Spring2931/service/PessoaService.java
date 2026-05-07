package com.example.crud_Spring2931.service;

import com.example.crud_Spring2931.model.PessoaModel;
import com.example.crud_Spring2931.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class PessoaService {

    private final PessoaRepository repository;
    //Read

    public List<PessoaModel> listar(){
        return repository.findAll();
    }

    //read buscar por id

    public PessoaModel buscarPorId(long id){
        return repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Pessoa não encontrada."));
    }

    //create
    public PessoaModel salvar(PessoaModel pessoa){
        return repository.save(pessoa);
    }

    //update
    public PessoaModel atualizar(Long id, PessoaModel dados){
        PessoaModel pessoa = buscarPorId(id);
        pessoa.setNome(dados.getNome());
        pessoa.setIdade(dados.getIdade());
        return repository.save(pessoa);
    }

    //delete
    public void excluir(Long id){
        repository.deleteById(id);
    }
}
