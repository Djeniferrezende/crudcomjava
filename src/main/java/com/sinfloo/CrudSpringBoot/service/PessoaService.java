package com.sinfloo.CrudSpringBoot.service;

import com.sinfloo.CrudSpringBoot.interfaceService.IPessoaService;
import com.sinfloo.CrudSpringBoot.interfaces.IPessoa;
import com.sinfloo.CrudSpringBoot.models.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService implements IPessoaService {

    @Autowired
    private IPessoa data;

    @Override
    public List<Pessoa> listar() {
        return (List<Pessoa>)data.findAll();
    }

    @Override
    public Optional<Pessoa> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public int save(Pessoa p) {
        int resposta=0;
        Pessoa pessoa = data.save(p);
        if(!pessoa.equals(null)){
            resposta=1;
        }
        return resposta;
    }

    @Override
    public void delete(int id) {

    }
}
