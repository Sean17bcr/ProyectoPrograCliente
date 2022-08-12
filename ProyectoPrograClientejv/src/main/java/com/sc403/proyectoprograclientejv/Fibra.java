
package com.sc403.proyectoprograclientejv;

import javax.swing.JOptionPane;


public class Fibra extends Internet{
    private String simetrico;
    private String ping;

    public Fibra(String simetrico, String ping, int Megas, String Router, double precio, String tipo, String Instalacion) {
        super(Megas, Router, precio, tipo, Instalacion);
        this.simetrico = simetrico;
        this.ping = ping;
    }
    
    public Fibra() { 
        this.simetrico = "";
        this.ping = "";
    }

    public String getSimetrico() {
        return simetrico;
    }

    public void setSimetrico(String simetrico) {
        this.simetrico = simetrico;
    }

    public String getPing() {
        return ping;
    }

    public void setPing(String ping) {
        this.ping = ping;
    }
    
    
    

    @Override
    public void pedir_datos() {
        this.ping = JOptionPane.showInputDialog(null, "El ping por la ubicacion va a ser de: ");
        this.simetrico = JOptionPane.showInputDialog(null, "Ingrese : ");
    }
    
    
    
    @Override
    public void imprimir_datos() {
        JOptionPane.showMessageDialog(null, "Ping: "
                + " "+ this.ping + "\n" 
                + "El lugar de la instalacion es: " +this.Instalacion+ "\n"
                + "Router: "+this.Router+ "\n"
                + "La cantidad de megas solicitadas son: "+ this.Megas);
    }
}
