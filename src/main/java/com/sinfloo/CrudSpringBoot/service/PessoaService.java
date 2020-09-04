package com.sinfloo.CrudSpringBoot.service;

import com.sinfloo.CrudSpringBoot.repository.IPessoaRepository;
import com.sinfloo.CrudSpringBoot.domain.Pessoa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService implements IPessoaService {

    @Autowired
    private IPessoaRepository data;

    @Override
    public List<Pessoa> listar() {

        return (List<Pessoa>)data.findAll();
    }

    @Override
    public Optional<Pessoa> listarId(int id) {

        return data.findById(id);
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
        data.deleteById(id);

    }
}
