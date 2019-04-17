package com.mycompany.calculadoramaven.dao;

import com.mycompany.calculadoramaven.model.Estudiante;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Integer> {
    
}
