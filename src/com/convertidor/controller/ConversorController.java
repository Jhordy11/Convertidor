package com.convertidor.controller;

import com.convertidor.interfaces.Transformable;

public abstract class ConversorController {
    private String titulo ;
    private Transformable[] unidades;
    public ConversorController(String titulo,Transformable[] unidades) {
        this.unidades = unidades;
        this.titulo = titulo;
    }

    public Double convertir(Double valor, Transformable tipo1 , Transformable tipo2){
        return (valor / tipo2.obtenerValorReferencial()) * tipo1.obtenerValorReferencial();
    }

    public String getTitulo() {
        return titulo;
    }

    public Transformable[] getUnidades() {
        return unidades;
    }
}
