package com.example.crud_Spring2931.repository;


import com.example.crud_Spring2931.model.PessoaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long> {
    //Jpa gera automaticamente
    //Save(), findAll(), findById()
    //DeleteById()
}