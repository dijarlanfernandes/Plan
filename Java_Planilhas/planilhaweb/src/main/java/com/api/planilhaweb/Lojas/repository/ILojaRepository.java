package com.api.planilhaweb.Lojas.repository;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.planilhaweb.Lojas.model.Loja;

@Repository
public interface ILojaRepository extends JpaRepository<Loja, Id> {

}