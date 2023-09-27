package com.example.dbatividade2;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransacaoRepository extends JpaRepository<Transacao, Long> {
//    List<Transacao> findByTipo_transacao(String tpTransacao);
}
