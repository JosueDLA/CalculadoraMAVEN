package com.mycompany.calculadoramaven.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdvanceOperationsController {
    
    @GetMapping("/avanzadas/factorial")
    public long factorial(@RequestParam(name="n", required=true)int n){
        int factorial = 1;
        while(n != 0){
            factorial = factorial*n;
            n--;
        }
        return factorial;
    }
    
    @GetMapping("/avanzadas/cuadrado")
    public long sqr(@RequestParam(name="x", required=true) int x){
        long square = (long) Math.pow(x, 2);
        return square;
    }
    
    @GetMapping("/avanzadas/potencia")
    public long pow(@RequestParam(name="x", required=true) int x,@RequestParam(name="y", required=true) int y){
        long potencia = (long) Math.pow(x, y);
        return potencia;
    }
    
    @GetMapping("/avanzadas/raiz")
    public long sqrt(@RequestParam(name="a", required=true) int a){
        long raiz = (long) Math.sqrt(a);
        return raiz;
    }
    
    @GetMapping("/avanzadas/absoluto")
    public long abs(@RequestParam(name="a", required=true) int a){
        long ab = Math.abs(a);
        return ab;
    }
}