package com.sinfloo.CrudSpringBoot.resource;

import com.sinfloo.CrudSpringBoot.interfaceService.IPessoaService;

import com.sinfloo.CrudSpringBoot.domain.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import java.util.Optional;
import javax.validation.Valid;

@Controller
@RequestMapping
public class PessoaController {

    @Autowired
    private IPessoaService service;

    @GetMapping("/listar")
    public String listar(Model model){
        List<Pessoa>pessoa = service.listar();
        model.addAttribute("pessoa", pessoa);
        return "index";
    }

    @GetMapping("/new")
    public String juntar(Model model){
        model.addAttribute("pessoa",new Pessoa());
        return "form";
    }

    @PostMapping("/save")
    public String salvar(@Valid Pessoa p){
        service.save(p);
        return "redirect:/listar";

    }
    @GetMapping("/editar/{id}")
    public String editar(@PathVariable int id, Model model){
        Optional<Pessoa>pessoa=service.listarId(id);
        model.addAttribute("pessoa", pessoa);
        return "form";
    }
    @GetMapping("/excluir/{id}")
    public String excluir(Model model, @PathVariable int id){
        service.delete(id);
        return "redirect:/listar";
    }
}
