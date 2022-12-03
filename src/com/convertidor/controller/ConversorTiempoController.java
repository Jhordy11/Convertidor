package com.convertidor.controller;

import com.convertidor.enums.Tiempo;
import com.convertidor.interfaces.Transformable;

public class ConversorTiempoController extends ConversorController{
    public ConversorTiempoController() {
        super("Conversor de Tiempo", Tiempo.values());
    }
}