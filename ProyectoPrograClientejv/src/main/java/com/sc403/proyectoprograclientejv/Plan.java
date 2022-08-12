
package com.sc403.proyectoprograclientejv;

import javax.swing.JOptionPane;


public class Plan {
    private String nombre;
    private String megas;
    private String Simetrico;

    public Plan(String nombre, String megas, String Simetrico) {
        this.nombre = nombre;
        this.megas = megas;
        this.Simetrico = Simetrico;
    }
    
    public Plan() {
        this.nombre = "";
        this.megas = "";
        this.Simetrico = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMegas() {
        return megas;
    }

    public void setMegas(String megas) {
        this.megas = megas;
    }

    public String getSimetrico() {
        return Simetrico;
    }

    public void setSimetrico(String Simetrico) {
        this.Simetrico = Simetrico;
    }
    
    public void pedir_datos(){
         this.nombre = JOptionPane.showInputDialog(null, "Digite el nombre "
                + "del plan: ");
        this.megas = JOptionPane.showInputDialog(null, "Digite las megas"
                + " del plan: ");
        this.Simetrico = JOptionPane.showInputDialog(null, "Digite el "
                + "si el plan es simetrico: ");
    }
    
      
}
