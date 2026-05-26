package com.example.hospedagem_de_sites.controller;

import com.example.hospedagem_de_sites.entity.UsuarioEntity;
import com.example.hospedagem_de_sites.service.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*")
@Controller
@RequestMapping("/hospedagem-html")
public class HospedagemHtmlController {

    @Autowired
    private UsuarioService service;

    // =========================
    // CREATE
    // =========================
    @PostMapping("/salvar")
    public String salvarUsuario(

            @RequestParam String nomeUsuario,
            @RequestParam String email,
            @RequestParam String telefone

    ) {

        UsuarioEntity usuario = new UsuarioEntity();

        usuario.setNomeUsuario(nomeUsuario);
        usuario.setEmail(email);
        usuario.setTelefone(telefone);

        service.salvar(usuario);

        return "redirect:/usuarios.html";
    }

    // =========================
    // READ
    // =========================
    @GetMapping("/buscar")
    @ResponseBody
    public UsuarioEntity buscarUsuario(@RequestParam Long id) {

        return service.buscarPorId(id);
    }

    // =========================
    // UPDATE
    // =========================
    @PostMapping("/atualizar")
    public String atualizarUsuario(

            @RequestParam Long id,
            @RequestParam String nomeUsuario,
            @RequestParam String email,
            @RequestParam String telefone

    ) {

        UsuarioEntity usuario = new UsuarioEntity();

        usuario.setNomeUsuario(nomeUsuario);
        usuario.setEmail(email);
        usuario.setTelefone(telefone);

        service.atualizar(id, usuario);

        return "redirect:/usuarios-crud.html";
    }

    // =========================
    // DELETE
    // =========================
    @PostMapping("/excluir")
    public String excluirUsuario(@RequestParam Long id) {

        service.deletar(id);

        return "redirect:/usuarios-crud.html";
    }
}