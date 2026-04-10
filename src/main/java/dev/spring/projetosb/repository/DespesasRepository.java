package dev.spring.projetosb.repository;
import dev.spring.projetosb.model.Despesas;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@org.springframework.stereotype.Repository
public interface DespesasRepository extends JpaRepository<Despesas, Long> {

    List<Despesas> findByCategoria(String categoria);

}
