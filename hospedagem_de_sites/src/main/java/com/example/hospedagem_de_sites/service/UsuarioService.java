package com.example.hospedagem_de_sites.service;

import com.example.hospedagem_de_sites.entity.UsuarioEntity;
import com.example.hospedagem_de_sites.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository repository;

    public List<UsuarioEntity> listarTodos() {
        return repository.findAll();
    }

    public UsuarioEntity buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public UsuarioEntity salvar(UsuarioEntity usuario) {
        return repository.save(usuario);
    }

    public UsuarioEntity atualizar(Long id, UsuarioEntity usuario) {

        UsuarioEntity usuarioExistente = buscarPorId(id);

        if (usuarioExistente != null) {

            usuarioExistente.setNomeUsuario(usuario.getNomeUsuario());
            usuarioExistente.setEmail(usuario.getEmail());
            usuarioExistente.setTelefone(usuario.getTelefone());

            return repository.save(usuarioExistente);
        }

        return null;
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}