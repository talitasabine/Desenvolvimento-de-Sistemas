package com.example.hospedagem_de_sites.controller;

import com.example.hospedagem_de_sites.entity.UsuarioEntity;
import com.example.hospedagem_de_sites.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")

public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @GetMapping
    public List<UsuarioEntity> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public UsuarioEntity buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PostMapping
    public UsuarioEntity salvar(@RequestBody UsuarioEntity usuario){
        return service.salvar(usuario);
    }

    @PutMapping("/{id}")
    public UsuarioEntity atualizar(@PathVariable Long id, @RequestBody UsuarioEntity usuario){
        return service.atualizar(id, usuario);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}
