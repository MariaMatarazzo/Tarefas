package com.mapTarefas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mapTarefas.entidade.Tarefas;

public interface TarefasRepository extends JpaRepository<Tarefas, Long> {



}
