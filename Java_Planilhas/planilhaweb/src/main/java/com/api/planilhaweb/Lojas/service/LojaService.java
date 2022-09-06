package com.api.planilhaweb.Lojas.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.api.planilhaweb.Lojas.model.Loja;
import com.api.planilhaweb.Lojas.repository.ILojaRepository;

@Service
public class LojaService {
    private final ILojaRepository iLojaRepository;

    public LojaService(ILojaRepository iLojaRepository) {
        this.iLojaRepository = iLojaRepository;
    }

    public List<Loja> findAll() {
        return iLojaRepository.findAll();
    }

}