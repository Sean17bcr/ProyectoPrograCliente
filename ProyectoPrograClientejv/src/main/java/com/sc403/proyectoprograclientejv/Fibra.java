
package com.sc403.proyectoprograclientejv;

import javax.swing.JOptionPane;


public class Fibra extends Internet{
    private String simetrico;
    private;

    @Override
    public void pedir_datos() {
        super.pedir_datos(); 
        this.simetrico = JOptionPane.showMessageDialog(null, "");
    }
    
    
    
    
    @Override
    public void imprimir_datos() {
        JOptionPane.showMessageDialog(null, "El tipo de servicio solicitado es:"
                + " "+ this.tipo + "\n" 
                + "El lugar de la instalacion es: " +this.Instalacion+ "\n"
                + "Router: "+this.Router+ "\n"
                + "La cantidad de megas solicitadas son: "+ this.Megas);
    }
}
