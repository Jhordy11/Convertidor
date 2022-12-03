package com.convertidor.enums;

import com.convertidor.interfaces.Transformable;

public enum Temperatura implements Transformable {
    CELSIUS("°C", "Grado Celsius"),
    FAHRENHEIT("°F","Grado Fahrenheit"),
    KELVIN("°K","Grado Kelvin");


    private String simbolo;
    private String nombre;
    private Temperatura(String simbolo, String nombre){
        this.simbolo = simbolo;
        this.nombre = nombre;
    }

    @Override
    public Double obtenerValorReferencial() {
        return null;
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