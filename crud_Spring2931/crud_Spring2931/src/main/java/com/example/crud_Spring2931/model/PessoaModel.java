package com.example.crud_Spring2931.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "pessoas")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class PessoaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private int idade;
    //Lombook gera tudo automaticamente
    //get id, get nome, get idade
    //set id, set nome, set idade

}
