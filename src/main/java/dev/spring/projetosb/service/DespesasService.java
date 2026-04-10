package dev.spring.projetosb.service;
import dev.spring.projetosb.dto.DespesasRelatorios;
import dev.spring.projetosb.model.Despesas;
import dev.spring.projetosb.repository.DespesasRepository;


import java.util.List;

@org.springframework.stereotype.Service
public class DespesasService {


    private final DespesasRepository repository;

    public DespesasService(DespesasRepository repository) {
        this.repository = repository;
    }

    public Despesas salvar(Despesas despesas) {
        if (despesas.getValor() < 0){
            throw new RuntimeException("O valor de despesa não pode ser negativo");
        }
        return repository.save(despesas);
    }
    public List<Despesas> todasDespesas() {
        return repository.findAll();
    }
    public List<Despesas> filtarCategoria(String categoria){
        return repository.findByCategoria(categoria);
    }
    public Long pegarID(){
        return (long) repository.findAll().size();
    }
    public Double calcularTotal(){
        return repository.findAll().stream().mapToDouble(Despesas::getValor).sum();
    }
    public Double calcularMedia(){
        return repository.findAll().stream().mapToDouble(Despesas::getValor).average().orElse(0.0);
    }
    public Double maiorValor(){
        return repository.findAll().stream().mapToDouble(Despesas::getValor).max().orElse(0.0);
    }
    public Double menorValor(){
        return repository.findAll().stream().mapToDouble(Despesas::getValor).min().orElse(0.0);
    }
    public DespesasRelatorios obterRelatorio() {
        return new DespesasRelatorios(
                pegarID(),
                calcularTotal(),
                calcularMedia(),
                maiorValor(),
                menorValor()
        );
    }
    public void excluir(Long id){
        repository.deleteById(id);
    }
    public Despesas atualizar(Long id, Despesas dadosNovos){
        return repository.findById(id).map(despesas -> {
            despesas.setValor(dadosNovos.getValor());
            despesas.setCategoria(dadosNovos.getCategoria());
            return repository.save(despesas);
        }).orElseThrow(() -> new RuntimeException("Despesa não encontrada"));
    }
}