package com.beneai.bene_ai_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "metas")
@Data
public class Meta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private BigDecimal valorMeta;

    private BigDecimal valorAtual;

    private Integer progresso;

    private Boolean destaque;

    private String cor;
}