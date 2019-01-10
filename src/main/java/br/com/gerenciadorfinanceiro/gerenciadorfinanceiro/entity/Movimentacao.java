/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gerenciadorfinanceiro.gerenciadorfinanceiro.entity;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jonata.oliveira
 */

@Entity
@Table(name = "MOVIMENTACAO")
public class Movimentacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    
    @Size(min = 1, max = 20)
    @Column(name = "TIPO", length = 20, nullable = false)
    private String tipo;
    
    @Size(min = 1, max = 100)
    @Column(name = "NOME", length = 100, nullable = false)
    private String nome;
    
    @NotNull
    @Digits(integer = 9, fraction = 2)
    @Column(name = "VALOR", precision = 6, scale = 2, nullable = false)
    private String valor;
    
    @Column(name = "VENCIMENTO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date vencimento;
    
    @Column(name = "PARCELAS", precision = 10, scale = 2)
    private Integer parcelas;
    
    private Boolean status;
    
    private Boolean fixa;
    
    
    
}
