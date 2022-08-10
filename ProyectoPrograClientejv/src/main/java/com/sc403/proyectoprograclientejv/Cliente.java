package com.sc403.proyectoprograclientejv;


import javax.swing.JOptionPane;

/**
 *
 * @author Michael Arias Becerra
 */
public class Cliente {

    private String nom_Cliente;
    private String cedula;
    private String primer_Apellido;
    private String segundo_Apellido;
    private String num_contrato;
    private String servicio;
    private String nom_Barrio;

    public Cliente() {
    }

    public Cliente(String nom_Cliente, String cedula, String primer_Apellido, String segundo_Apellido, String num_contrato, String servicio, String nom_Barrio) {
        this.nom_Cliente = nom_Cliente;
        this.cedula = cedula;
        this.primer_Apellido = primer_Apellido;
        this.segundo_Apellido = segundo_Apellido;
        this.num_contrato = num_contrato;
        this.servicio = servicio;
        this.nom_Barrio = nom_Barrio;
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

    public String getNum_contrato() {
        return num_contrato;
    }

    public void setNum_contrato(String num_contrato) {
        this.num_contrato = num_contrato;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public String getNom_Barrio() {
        return nom_Barrio;
    }

    public void setNom_Barrio(String nom_Barrio) {
        this.nom_Barrio = nom_Barrio;
    }

   
    public void pedir_datos() {

        this.nom_Cliente = JOptionPane.showInputDialog(null, "Digite el nombre "
                + "del cliente");
        this.cedula = JOptionPane.showInputDialog(null, "Digite la cédula "
                + "del cliente");
        this.primer_Apellido = JOptionPane.showInputDialog(null, "Digite el "
                + "primer apellido del cliente");
        this.segundo_Apellido = JOptionPane.showInputDialog(null, "Digite el "
                + "segundo apellido del cliente");
        this.num_contrato = JOptionPane.showInputDialog(null, "Digite el numero "
                + "de contrato del cliente");
        this.servicio = JOptionPane.showInputDialog(null, "Digite el nombre "
                + "del servicio por el cual está suscrito en el sistema");
        this.nom_Barrio = JOptionPane.showInputDialog(null, "Digite el nombre "
                + "del barrio en el cual se va a realizar la instalación");
    }

}
