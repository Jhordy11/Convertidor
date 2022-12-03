package com.convertidor.view;

import com.convertidor.controller.ConversorController;
import com.convertidor.interfaces.Transformable;

import javax.swing.*;

public class ConversorFrame extends JFrame {
    private JPanel pnlConversor;
    private JTextField textField1;
    private JComboBox comboBox1;
    private JComboBox comboBox2;
    private JButton btnEvaluar;
    private JLabel lbCambio;
    private JButton btnRegresar;
    private JLabel lbTitulo;
    private Transformable[] unidades;
    private ConversorController conversorController;

    public ConversorFrame(ConversorController conversorController){
        crearFrame();
        this.conversorController = conversorController;
        unidades = this.conversorController.getUnidades();
        configurarComboBox(comboBox1);
        configurarComboBox(comboBox2);
        estilizarAdicionales();

        configurarAccionesFormulario();
    }

    public void crearFrame() {
        setSize(700, 375);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        add(pnlConversor);
        setVisible(true);
    }

    public void configurarComboBox(JComboBox comboBox){
        for(Transformable unidad : unidades){
            comboBox.addItem(unidad);
        }
    }

    public void estilizarAdicionales(){
        textField1.setBorder(null);
        btnRegresar.setBorder(null);
        lbTitulo.setText(conversorController.getTitulo());
    }

    public void evaluarCambio(){

        if (textField1.getText().isBlank()) {
            JOptionPane.showMessageDialog(this, "El campo valor es requerido ");
            return;
        }

        Double cantidadDouble;

        try {
            cantidadDouble = Double.parseDouble(textField1.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El campo cantidad debe ser numérico. Se recomienda usar punto.");
            return;
        }

        Transformable tipo1 = (Transformable) comboBox1.getSelectedItem();
        Transformable tipo2 = (Transformable) comboBox2.getSelectedItem();

        textField1.requestFocus();

        String cambioFinal = String.format("%.2f", conversorController.convertir(cantidadDouble,tipo1,tipo2) );
        lbCambio.setText(cambioFinal+" "+tipo2.obtenerUnidad());
    }

    public void configurarAccionesFormulario(){
        btnEvaluar.addActionListener(e ->  {
            evaluarCambio();
        });

        btnRegresar.addActionListener(e ->  {
            dispose();
            new InicioFrame();
        });
    }
}
