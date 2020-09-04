package com.sinfloo.CrudSpringBoot.interfaceService;

import com.sinfloo.CrudSpringBoot.domain.Pessoa;

import java.util.List;
import java.util.Optional;

public interface IPessoaService {
    public List<Pessoa> listar();
    public Optional<Pessoa>listarId(int id);
    public int save(Pessoa pessoa);
    public void delete(int id);
}
