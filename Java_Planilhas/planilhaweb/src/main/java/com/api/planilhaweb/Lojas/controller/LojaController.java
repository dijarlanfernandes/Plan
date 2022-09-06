package com.api.planilhaweb.Lojas.controller;

import java.util.List;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.planilhaweb.Lojas.dto.LojaDto;
import com.api.planilhaweb.Lojas.model.Loja;
import com.api.planilhaweb.Lojas.service.LojaService;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/lojas")
public class LojaController {

    private final LojaService lojaService;

    public LojaController(LojaService lojaService) {
        this.lojaService = lojaService;
    }

    @GetMapping
    public ResponseEntity<List<Loja>> GetAll() {
        return ResponseEntity.status(HttpStatus.OK).body(lojaService.findAll());
    }
    /*
     * @PostMapping("admin/lojas/save")
     * public ResponseEntity<Object> SaveLoja(@RequestBody @Validated LojaDto
     * lojaDto) {
     * var loja = lojaService.findAll();
     * BeanUtils.copyProperties(loja, lojaDto);
     * 
     * return
     * ResponseEntity.status(HttpStatus.CREATED).body(lojaService.save(lojaDto));
     * }
     */

}