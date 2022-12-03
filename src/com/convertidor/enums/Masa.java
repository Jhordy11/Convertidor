package com.convertidor.enums;

import com.convertidor.interfaces.Transformable;

public enum Masa implements Transformable {
    GRAMO(1.0,"g", "Gramo"),
    KILOGRAMO(1000.0,"kg","Kilogramo"),
    ONZA(28.3495,"oz","Onza"),
    LIBRA(453.592,"lb","Libra"),
    STONE(6350.288,"st","Stone");

    private Double valorEnGramos;
    private String simbolo;
    private String nombre;
    private Masa(Double valorEnGramos , String simbolo, String nombre){
        this.valorEnGramos = valorEnGramos;
        this.simbolo = simbolo;
        this.nombre = nombre;
    }

    @Override
    public Double obtenerValorReferencial() {
        return valorEnGramos;
    }

    @Override
    public String obtenerUnidad() {
        return simbolo;
    }


    @Override
    public String toString() {
        return nombre;
    }
}
