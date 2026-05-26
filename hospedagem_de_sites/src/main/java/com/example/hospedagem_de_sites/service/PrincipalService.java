package com.example.hospedagem_de_sites.service;

import com.example.hospedagem_de_sites.entity.PrincipalEntity;
import com.example.hospedagem_de_sites.repository.PrincipalRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrincipalService {

    @Autowired
    private PrincipalRepository repository;

    public List<PrincipalEntity> listarTodos() {
        return repository.findAll();
    }

    public PrincipalEntity buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public PrincipalEntity salvar(PrincipalEntity principal) {
        return repository.save(principal);
    }

    public PrincipalEntity atualizar(Long id, PrincipalEntity principal) {

        PrincipalEntity principalExistente = buscarPorId(id);

        if (principalExistente != null) {

            principalExistente.setNome(principal.getNome());
            principalExistente.setDescricao(principal.getDescricao());

            return repository.save(principalExistente);
        }

        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}