package com.convertidor.enums;

import com.convertidor.interfaces.Transformable;

public enum Tiempo implements Transformable {
    HORA(1.0,"Horas"),
    DIA(24.0,"Dias"),
    SEMANA(168.0,"Semanas"),
    MES(730.0,"Meses"),
    ANIO(8760.0,"Años");

    private Double valorEnHoras;
    private String nombre;
    private  Tiempo(Double valorEnHoras, String nombre){
        this.valorEnHoras = valorEnHoras;
        this.nombre = nombre;
    }

    @Override
    public Double obtenerValorReferencial() {
        return valorEnHoras;
    }

    @Override
    public String obtenerUnidad() {
        return nombre;
    }


    @Override
    public String toString() {
        return nombre;
    }
}
