package dev.spring.projetosb.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;

@Getter
@Setter
@Table(name = "despesas")
@Entity
public class Despesas {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private double valor;
    private LocalDate data;
    private String categoria;

}
