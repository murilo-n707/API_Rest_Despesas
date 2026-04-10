package dev.spring.projetosb.controller;

import dev.spring.projetosb.dto.DespesasRelatorios;
import dev.spring.projetosb.model.Despesas;
import dev.spring.projetosb.service.DespesasService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/despesas")
public class DespesasController {

    private final DespesasService service;

    public DespesasController(DespesasService service) {
        this.service = service;
    }

    @PostMapping
    public Despesas cadastrar(@RequestBody Despesas despesas){
        return service.salvar(despesas);
    }
    @GetMapping("/categoria/{cat}")
    public List<Despesas> buscarPorCategoria(@PathVariable String cat) {
        return service.filtarCategoria(cat);
    }
    @GetMapping("/listaDespesas")
    public List<Despesas> listar(){
        return service.todasDespesas();
    }
    @GetMapping("/dashboard")
    public DespesasRelatorios getDashboard() {
        return service.obterRelatorio();
    }
    @DeleteMapping("deletar/{id}")
    public void deletar(@PathVariable Long id) {
        service.excluir(id);
    }

    @PutMapping("atualizar/{id}")
    public Despesas editar(@PathVariable Long id, @RequestBody Despesas despesa) {
        return service.atualizar(id, despesa);
    }

}
