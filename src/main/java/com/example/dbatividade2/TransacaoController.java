package com.example.dbatividade2;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/transaction")
public class TransacaoController {
    private final TransacaoRepository transacaoRepository;


    public TransacaoController(TransacaoRepository transacaoRepository) {
        this.transacaoRepository = transacaoRepository;
    }

    @GetMapping("/selecionarTudo")
    public List<Transacao> visualizarTransacoes() {
        return transacaoRepository.findAll();
    }


}
