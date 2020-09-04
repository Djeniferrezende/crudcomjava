package com.sinfloo.CrudSpringBoot.interfaces;

import com.sinfloo.CrudSpringBoot.models.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPessoa extends CrudRepository<Pessoa, Integer> {
}
