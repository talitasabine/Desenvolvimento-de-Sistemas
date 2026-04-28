package com.crud.cliente.service;
import com.crud.cliente.entity.ClienteEntity;
import com.crud.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class ClienteService {
    @Autowired
    //injeta automaticamente o ClienteRepository (sem precisar usar "new")
    private ClienteRepository repository;

    //LISTAR TODOS
    public List<ClienteEntity> listarTodos(){
        return repository.findAll();
        //busca todos os clientes no banco
    }
    //buscar por id
    public ClienteEntity buscarPorId(Long id){
        return repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
            //tenta buscar pelo ID
            //se nao encontrar, lança erro (evita retornar null)
    }

    //SALVAR
    public ClienteEntity salvar(ClienteEntity cliente){
        return repository.save(cliente);
        //salva um novo cliente no banco
        //se o id for null > insert
        //se tiver id > update
    }

    //ATUALIZAR 
    public ClienteEntity atualizar(Long id, ClienteEntity cliente){
        ClienteEntity existente = buscarPorId(id);
        //primeiro busca o cliente existente no banco
        existente.setNome(cliente.getNome());
        existente.setSobrenome(cliente.getSobrenome());
        existente.setEmail(cliente.getEmail());
        existente.setTelefone(cliente.getTelefone());
        existente.setCpf(cliente.getCpf());
        existente.setEndereco(cliente.getEndereco());
        existente.setCidade(cliente.getCidade());
        existente.setEstado(cliente.getEstado());
        existente.setCep(cliente.getCep());
        // Atualiza campo por campo (boa prática para evitar sobrescrever dados errados)

        return repository.save(existente);
        // Salva o objeto atualizado no banco
    }

    // DELETAR
    public void deletar(Long id) {
        repository.deleteById(id);
        // Deleta o cliente pelo ID
    }
}
