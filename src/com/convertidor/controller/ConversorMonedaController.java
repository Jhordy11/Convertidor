package com.convertidor.controller;

import com.convertidor.enums.Moneda;
import com.convertidor.interfaces.Transformable;

public class ConversorMonedaController extends ConversorController{
    public ConversorMonedaController() {
        super("Conversor De Monedas", Moneda.values());
    }

    @Override
    public Double convertir(Double valor, Transformable tipo1 , Transformable tipo2){
        return (valor / tipo1.obtenerValorReferencial()) * tipo2.obtenerValorReferencial();
    }
}
