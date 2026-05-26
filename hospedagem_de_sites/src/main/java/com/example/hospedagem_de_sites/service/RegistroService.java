package com.example.hospedagem_de_sites.service;

import com.example.hospedagem_de_sites.entity.RegistroEntity;
import com.example.hospedagem_de_sites.repository.RegistroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistroService {

    @Autowired
    private RegistroRepository repository;

    public List<RegistroEntity> listarTodos() {
        return repository.findAll();
    }

    public RegistroEntity buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public RegistroEntity salvar(RegistroEntity registro) {
        return repository.save(registro);
    }

    public RegistroEntity atualizar(Long id, RegistroEntity registro) {

        RegistroEntity registroExistente = buscarPorId(id);

        if (registroExistente != null) {

            registroExistente.setUsuario(registro.getUsuario());
            registroExistente.setStatus(registro.getStatus());

            return repository.save(registroExistente);
        }

        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}