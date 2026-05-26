package com.example.hospedagem_de_sites.controller;

import com.example.hospedagem_de_sites.entity.RegistroEntity;
import com.example.hospedagem_de_sites.service.RegistroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/registro")

@CrossOrigin(origins = "*")

public class RegistroController {

    @Autowired
    private RegistroService service;

    @GetMapping
    public List<RegistroEntity> listarTodos() {

        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public RegistroEntity buscarPorId(@PathVariable Long id) {

        return service.buscarPorId(id);
    }

    @PostMapping
    public RegistroEntity salvar(@RequestBody RegistroEntity registro) {

        return service.salvar(registro);
    }

    @PutMapping("/{id}")
    public RegistroEntity atualizar(
            @PathVariable Long id,
            @RequestBody RegistroEntity registro
    ) {

        return service.atualizar(id, registro);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {

        service.deletar(id);
    }
}