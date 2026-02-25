package com.cf.school_2.repositories;

import com.cf.school_2.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<AlunoModel,Long> {
}
