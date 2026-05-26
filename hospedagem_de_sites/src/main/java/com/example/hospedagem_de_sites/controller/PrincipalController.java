package com.example.hospedagem_de_sites.controller;

import com.example.hospedagem_de_sites.entity.PrincipalEntity;
import com.example.hospedagem_de_sites.service.PrincipalService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/principal")
public class PrincipalController {

    @Autowired
    private PrincipalService service;

    @GetMapping
    public List<PrincipalEntity> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public PrincipalEntity buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PostMapping
    public PrincipalEntity salvar(@RequestBody PrincipalEntity principal) {
        return service.salvar(principal);
    }

    @PutMapping("/{id}")
    public PrincipalEntity atualizar(@PathVariable Long id,
                                     @RequestBody PrincipalEntity principal) {

        return service.atualizar(id, principal);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}