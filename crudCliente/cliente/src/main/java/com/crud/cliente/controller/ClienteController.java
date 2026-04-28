package com.crud.cliente.controller;
import com.crud.cliente.entity.ClienteEntity;
import com.crud.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController

@RequestMapping("/api/clientes")
//define a url base da api > tudo começa com /api/clientes

public class ClienteController {
    @Autowired
    //injeta automaticamente o Cliente Service (nao precisa instaciar com new)
    private ClienteService service;

    //Listar todos
    @GetMapping
    //mapeia requisição GET > http://localhost:800/api/clientes
    public List<ClienteEntity> listarTodos(){
        return service.listarTodos();
        //chama o service e retorna todos os clientes do banco
    }
    
    //Buscar por ID
    @GetMapping("/{id}")
    //mapeia GET com parametro > /api/clientes/1
    public ClienteEntity buscarPorId(@PathVariable Long id){
        //@PathVariable pega o valor da URL e joga na variavel "id"
        return service.buscarPorId(id);
        //Busca cliente pelo ID
    }

    //CRIAR
    @PostMapping
    //mapeia a requisição POST > criação de novo cliente
    public ClienteEntity salvar(@RequestBody ClienteEntity cliente){
        //@RequestBody converte JSON > objeto ClienteEntity
        return service.salvar(cliente);
        //salva no banco e retorna o cliente salvo
    }

    //ATUALIZAR
    @PostMapping
    //Mapeia requisição PUT > atualizar cliente existente
    public ClienteEntity atualizar(@PathVariable Long id, @RequestBody ClienteEntity cliente){
        //recebe ID pela URL e dados pelo corpo (JSON)
        return service.atualizar(id, cliente);
        //atualiza os dados no banco
    }

    //DELETAR
    @DeleteMapping("/{id}")
    //mapeia requisição DELETE > remover cliente
    public void deletar(@PathVariable Long id){
        service.deletar(id);
        //deleta o cliente pelo ID
    }
}
