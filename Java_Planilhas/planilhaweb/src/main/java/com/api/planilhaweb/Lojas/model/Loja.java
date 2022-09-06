package com.api.planilhaweb.Lojas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "loja")
public class Loja {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public int id;
    @Column(nullable = false, length = 255)
    public String nome;
    @Column(nullable = false, length = 150)
    public String endereco;
    @Column(nullable = false, length = 120)
    public String bairro;
    @Column(nullable = false, length = 150)
    public String cidade;
    @Column(nullable = false, length = 2)
    public String uf;
    @Column(nullable = false, length = 150)
    public String email;
    @Column(nullable = false, length = 15)
    public String cnpj;
    @Column(nullable = false, length = 15)
    public String insc_estadual;
    @Column(nullable = false, length = 50)
    public String horario_funcionamento;

}