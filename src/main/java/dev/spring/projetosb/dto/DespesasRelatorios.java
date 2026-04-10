package dev.spring.projetosb.dto;

import lombok.Getter;

@Getter
public class DespesasRelatorios {

        private Long despesas_quantidade;
        private Double total;
        private Double media;
        private Double maior;
        private Double menor;

        public DespesasRelatorios(Long despesas_quantidade, Double total, Double media, Double maior, Double menor) {
            this.despesas_quantidade = despesas_quantidade;
            this.total = total;
            this.media = media;
            this.maior = maior;
            this.menor = menor;
        }
}
