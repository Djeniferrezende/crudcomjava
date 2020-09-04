package com.sinfloo.CrudSpringBoot.repository;

import com.sinfloo.CrudSpringBoot.domain.Pessoa;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPessoa extends CrudRepository<Pessoa, Integer> {
}
