package com.cf.school_2.services;

import com.cf.school_2.models.AlunoModel;
import com.cf.school_2.repositories.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    public AlunoModel create(AlunoModel alunoModel) {
        return alunoRepository.save(alunoModel);
    }

    public List<AlunoModel> findAll(){
        return alunoRepository.findAll();
    }

    public void deleteById(Long id){
        alunoRepository.deleteById(id);
    }

}
