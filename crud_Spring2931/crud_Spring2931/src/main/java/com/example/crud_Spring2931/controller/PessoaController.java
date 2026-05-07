package com.example.crud_Spring2931.controller;

import com.example.crud_Spring2931.model.PessoaModel;
import com.example.crud_Spring2931.service.PessoaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pessoas")
@RequiredArgsConstructor

public class PessoaController {

    private final PessoaService service;

    //Get /pessoas (listar todas)
    @GetMapping
    public List<PessoaModel>listar(){
        return service.listar();
    }

    //GET /pessoas/{id} (busca por id)
    @GetMapping("/{id}")
    public ResponseEntity <PessoaModel> buscar(@PathVariable Long id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    //Post //pessoa/{id}
    @PostMapping
    public ResponseEntity <PessoaModel> salvar(@RequestBody PessoaModel pessoa){
        return ResponseEntity.ok(service.salvar(pessoa));
    }

    //PUT /pessoas/{id} (Atualizar)
    public ResponseEntity <PessoaModel> atualizar(@PathVariable long id, @RequestBody PessoaModel dados){
        return ResponseEntity.ok(service.atualizar(id, dados));
    }

    //DELETE /pessoas{id}
    @DeleteMapping("/{id}")
    public ResponseEntity <Void> excluir(@PathVariable Long id){
        service.excluir(id);
        return ResponseEntity.noContent().build();
    }

}
