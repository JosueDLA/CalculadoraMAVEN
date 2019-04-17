package com.mycompany.calculadoramaven.controller;

import com.mycompany.calculadoramaven.model.Estudiante;
import com.mycompany.calculadoramaven.service.EstudianteService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
    
    @Autowired
    private EstudianteService estudianteser;
    
    @GetMapping("/user")
    public Estudiante estudiante(){
        Estudiante user = new Estudiante("123", "Josue", "Apellido", "Dir", "Correo", new Date());
        return user;
    }
    
    @PostMapping("/insert")
    public Estudiante ingresar(@RequestBody(required = true) Estudiante e1){
        return this.estudianteser.insert(e1);
    }
    
    @GetMapping("/select")
    public Estudiante seleccionar(@RequestParam int id){
        return this.estudianteser.selectId(id);
    }
    
    @GetMapping("/selectall")
    public List<Estudiante> seleccionartodo(){
        return this.estudianteser.selectall();
    }
    
    @DeleteMapping("/delete/{id}")
    public String borrar(@PathVariable(required = true) int id){
        this.estudianteser.deleteId(id);
        return "Estudiante Eliminado";
    }
    
    @PutMapping("/update/{id}")
    public Estudiante actualizar(@PathVariable(required = true) int id, @RequestBody(required = true) Estudiante e1){
        return this.estudianteser.update(e1);
    }
    
    @PutMapping("/update/{id}/{apellido}")
    public Estudiante actualizarApellido(@PathVariable(required = true) int id, @PathVariable(required = true) String apellido){
        return this.estudianteser.updateApellido(id, apellido);
    }
    
    @GetMapping("/selectreporte")
    public String reporte(){
        return this.estudianteser.reporteEstudiante();
    }
    
}