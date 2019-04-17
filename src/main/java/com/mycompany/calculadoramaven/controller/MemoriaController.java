package com.mycompany.calculadoramaven.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/memoria")
public class MemoriaController {
    
    private int m1, m2;
    
    @PostMapping("/m1/create")
    public String crear(@RequestParam int m1){
        this.m1=m1;
        return "exito :D";
    }
    
    @PutMapping("/m1/update")
    public String actualizar(@RequestParam int m1){
        this.m1=m1;
        return "Dato Actualizado";
    }
    
    @DeleteMapping("/m1/delete")
    public String eliminar(){
        this.m1=0;
        return "Eliminado";
    }
    
    @GetMapping("/m1/select")
    public int obtener(){
        return this.m1;
    }
    
}
