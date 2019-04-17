package com.mycompany.calculadoramaven.service;

import com.mycompany.calculadoramaven.model.Estudiante;
import com.mycompany.calculadoramaven.dao.EstudianteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {
    @Autowired
    private EstudianteRepository estudianterep;
    
    public Estudiante insert(Estudiante e1){
        return this.estudianterep.save(e1);
    }
    
    public Estudiante selectId(int id){
        Estudiante e1 = this.estudianterep.findById(id).get();
        e1.setApellido(e1.getApellido().toUpperCase());
        return e1;
    }
    
    public List<Estudiante> selectall(){
        List<Estudiante> lista = (List<Estudiante>) this.estudianterep.findAll();
        return lista;
    }
    
    public void deleteId(int id){
        this.estudianterep.deleteById(id);
    }
    
    public Estudiante update(Estudiante e1){
        return this.estudianterep.save(e1);
    }
    
    public Estudiante updateApellido(int id, String apellido){
        Estudiante e1 = this.estudianterep.findById(id).get();
        e1.setApellido(apellido);
        return this.estudianterep.save(e1);
    }
    
    public String reporteEstudiante(){
        List<Estudiante> lista = (List<Estudiante>) this.estudianterep.findAll();
        StringBuilder s1= new StringBuilder();
        s1.append("Nombre \t carne \t correo \n ");
        for (Estudiante e1 : lista){
            s1.append(e1.getNombre());
            s1.append("\t");
            s1.append(e1.getCarne());
            s1.append("\t");
            s1.append(e1.getCorreo());
            s1.append("\n");
        }
        return s1.toString();
    }
}
