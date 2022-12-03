package com.convertidor.controller;

import com.convertidor.enums.Masa;

public class ConversorMasaController extends ConversorController{
    public ConversorMasaController() {
        super("Conversor De Masa", Masa.values());
    }
}
