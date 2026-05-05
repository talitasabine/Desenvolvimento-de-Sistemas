package com.example.hospedagem_de_sites.controller;

import com.example.hospedagem_de_sites.entity.HospedagemEntity;
import com.example.hospedagem_de_sites.service.HospedagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/clientes")

public class HospedagemController {

    @Autowired
    private HospedagemService service;

    @GetMapping
    public List<HospedagemEntity> listarTodos(){
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public HospedagemEntity buscarPorId(@PathVariable Long id){
        return service.buscarPorId(id);
    }

    @PostMapping
    public HospedagemEntity salvar(@RequestBody HospedagemEntity cliente){
        return service.salvar(cliente);
    }

    @PutMapping("/{id}") // ✅ corrigido
    public HospedagemEntity atualizar(@PathVariable Long id, @RequestBody HospedagemEntity cliente){
        return service.atualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        service.deletar(id);
    }
}