package com.convertidor.controller;

import com.convertidor.enums.Temperatura;
import com.convertidor.interfaces.Transformable;

public class ConversorTemperaturaController extends ConversorController{
    public ConversorTemperaturaController() {
        super("Conversor De Temperatura", Temperatura.values());
    }
    @Override
    public Double convertir(Double valor, Transformable tipo1 , Transformable tipo2){
        return transformarATipoFinal(transformarACelsius(valor ,(Temperatura) tipo1),(Temperatura) tipo2) ;
    }

    public double transformarATipoFinal(Double valor, Temperatura tipo){
        if( tipo == Temperatura.FAHRENHEIT){
            return ((valor * 9/5) + 32);
        }
        if( tipo == Temperatura.KELVIN){
            return (valor + 273.15);
        }
        return valor;
    }
    public double transformarACelsius(Double valor, Temperatura tipo){
        if( tipo == Temperatura.FAHRENHEIT){
            return ((valor - 32) * 5/9);
        }
        if( tipo == Temperatura.KELVIN){
            return (valor - 273.15);
        }
        return valor;
    }

}
