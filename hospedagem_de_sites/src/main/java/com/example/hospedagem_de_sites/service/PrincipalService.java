package com.example.hospedagem_de_sites.service;

import com.example.hospedagem_de_sites.entity.UsuarioEntity;
import com.example.hospedagem_de_sites.repository.PrincipalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrincipalService {

    @Autowired
    private PrincipalRepository repository;

    public List<UsuarioEntity> listarTodos(){
        return repository.findAll();
    }

    public UsuarioEntity buscarPorId(Long id){
        return repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public UsuarioEntity salvar(UsuarioEntity usuario){
        return repository.save(usuario);
    }

    public UsuarioEntity atualizar(Long id, UsuarioEntity usuario){
        UsuarioEntity existente = buscarPorId(id);

        existente.setNomeUsuario(usuario.getNomeUsuario());
        existente.setEmail(usuario.getEmail());
        existente.setTelefone(usuario.getTelefone());

        return repository.save(existente);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}