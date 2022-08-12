
package com.sc403.proyectoprograclientejv;

import javax.swing.JOptionPane;


public class Digital extends Cable{
    private String cajaDigital;

    public Digital(String cajaDigital, int Canales, String CanalExclusivo, double precio, String tipo, String Instalacion) {
        super(Canales, CanalExclusivo, precio, tipo, Instalacion);
        this.cajaDigital = cajaDigital;
    }
    
    public Digital() {
        this.cajaDigital = "";
    }

    public String getCajaDigital() {
        return cajaDigital;
    }

    public void setCajaDigital(String cajaDigital) {
        this.cajaDigital = cajaDigital;
    }

    @Override
    public void pedir_datos() {
        this.cajaDigital = JOptionPane.showInputDialog(null, "Ingrese la cantidad "
                + "de cajas a instalar: ");
    }
    
    
    @Override
    public void imprimir_datos() {
        JOptionPane.showMessageDialog(null, "Cantidad de cajas digitales: "
                + " "+ this.cajaDigital);
    }
    
}
