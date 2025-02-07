package com.desafio_magalu.agendamento_notificacao_api.infrastructure.repositories;

import com.desafio_magalu.agendamento_notificacao_api.infrastructure.entities.Agendamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgendamentoRepository extends JpaRepository<Agendamento, Long > {
}
