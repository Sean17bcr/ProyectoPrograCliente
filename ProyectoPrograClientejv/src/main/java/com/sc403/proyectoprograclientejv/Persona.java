
package com.sc403.proyectoprograclientejv;

import javax.swing.JOptionPane;


public class Persona {
    protected String nom_Cliente;
    protected String cedula;
    protected String primer_Apellido;
    protected String segundo_Apellido;

    public Persona(String nom_Cliente, String cedula, String primer_Apellido, String segundo_Apellido) {
        this.nom_Cliente = nom_Cliente;
        this.cedula = cedula;
        this.primer_Apellido = primer_Apellido;
        this.segundo_Apellido = segundo_Apellido;
    }
    
    public Persona() {
        this.nom_Cliente = "";
        this.cedula = "";
        this.primer_Apellido = "";
        this.segundo_Apellido = "";
    }

    public String getNom_Cliente() {
        return nom_Cliente;
    }

    public void setNom_Cliente(String nom_Cliente) {
        this.nom_Cliente = nom_Cliente;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getPrimer_Apellido() {
        return primer_Apellido;
    }

    public void setPrimer_Apellido(String primer_Apellido) {
        this.primer_Apellido = primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return segundo_Apellido;
    }

    public void setSegundo_Apellido(String segundo_Apellido) {
        this.segundo_Apellido = segundo_Apellido;
    }
    
     public void pedir_datos(){
         this.nom_Cliente = JOptionPane.showInputDialog(null, "Digite el nombre "
                + "del cliente");
        this.cedula = JOptionPane.showInputDialog(null, "Digite la cédula "
                + "del cliente");
        this.primer_Apellido = JOptionPane.showInputDialog(null, "Digite el "
                + "primer apellido del cliente");
        this.segundo_Apellido = JOptionPane.showInputDialog(null, "Digite el "
                + "segundo apellido del cliente");
     }
}
