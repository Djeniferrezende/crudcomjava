package com.sinfloo.CrudSpringBoot.controller;

import com.sinfloo.CrudSpringBoot.interfaceService.IPessoaService;

import com.sinfloo.CrudSpringBoot.models.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import javax.validation.Valid;

@Controller
@RequestMapping
public class PessoaController {

    @Autowired
    private IPessoaService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Pessoa>pessoas = service.listar();
        model.addAttribute("pessoas", pessoas);
        return "index";
    }

    @GetMapping("/new")
    public String juntar(Model model){
        model.addAttribute("pessoa",new Pessoa());
        return "form";
    }

    @PostMapping("/save")
    public String salvar(@Valid Pessoa p, Model model){
        service.save(p);
        return "redirect:/listar";

    }
}
