package com.convertidor.enums;

import com.convertidor.interfaces.Transformable;

public enum Moneda implements Transformable {
    USD(1.00,"$", "USD Dólar"),
    EUR(0.95,"€","EUR Euro"),
    GBP(0.81,"£","GBP Libra esterlina"),
    JPY(134.47,"¥","JPY Yen japonés"),
    KRW(1301.67,"₩","KRW Won surcoreano");

    private Double valorDeUnDolar;
    private String simbolo;
    private String nombre;
    private Moneda(Double valorDeUnDolar , String simbolo, String nombre){
        this.valorDeUnDolar = valorDeUnDolar;
        this.simbolo = simbolo;
        this.nombre = nombre;
    }

    @Override
    public Double obtenerValorReferencial() {
        return valorDeUnDolar;
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
