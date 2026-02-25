package com.cf.school_2.controllers;

import com.cf.school_2.models.AlunoModel;
import com.cf.school_2.repositories.AlunoRepository;
import com.cf.school_2.services.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/alunos")
public class alunoController {

    @Autowired
    private AlunoService alunoService;

    @PostMapping
    public AlunoModel create(@RequestBody AlunoModel alunoModel){
        return alunoService.create(alunoModel);
    }

    @GetMapping
    public List<AlunoModel> findAll(){
        return alunoService.findAll();
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        alunoService.deleteById(id);
    }
}
