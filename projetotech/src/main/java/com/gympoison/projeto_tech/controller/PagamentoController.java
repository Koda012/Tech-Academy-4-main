package com.gympoison.projeto_tech.controller;

import com.gympoison.projeto_tech.repository.ProdutoRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class PagamentoController {

    private ProdutoRepository repository;

    @GetMapping
    public ResponseEntity<List<ProdutoController>> findAll(){
        List<Pagamento> pagamento = this.repository.findAll();
        return ResponseEntity.ok(pagamento);
    }
}
