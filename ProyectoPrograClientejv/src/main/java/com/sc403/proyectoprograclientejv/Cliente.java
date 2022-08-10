package com.sc403.proyectoprograclientejv;


import javax.swing.JOptionPane;

/**
 *
 * @author Michael Arias Becerra
 */
public class Cliente extends Persona {

    private String Num_contrato;
    private String Servicio;
    private String Nom_Barrio;

    public Cliente(String Nom_Cliente, String Cedula,
            String Primer_Apellido, String Segundo_Apellido,
            String Num_contrato, String Servicio, String Nom_Barrio) {
        this.Nom_Cliente = Nom_Cliente;
        this.Cedula = Cedula;
        this.Primer_Apellido = Primer_Apellido;
        this.Segundo_Apellido = Segundo_Apellido;
        this.Num_contrato = Num_contrato;
        this.Servicio = Servicio;
        this.Nom_Barrio = Nom_Barrio;
    }

    public Cliente() {
        this.Nom_Cliente = "";
        this.Cedula = "";
        this.Primer_Apellido = "";
        this.Segundo_Apellido = "";
        this.Num_contrato = "";
        this.Servicio = "";
        this.Nom_Barrio = "";

    }

    public String getNom_Cliente() {
        return Nom_Cliente;
    }

    public void setNom_Cliente(String Nom_Cliente) {
        this.Nom_Cliente = Nom_Cliente;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getPrimer_Apellido() {
        return Primer_Apellido;
    }

    public void setPrimer_Apellido(String Primer_Apellido) {
        this.Primer_Apellido = Primer_Apellido;
    }

    public String getSegundo_Apellido() {
        return Segundo_Apellido;
    }

    public void setSegundo_Apellido(String Segundo_Apellido) {
        this.Segundo_Apellido = Segundo_Apellido;
    }

    public String getNum_contrato() {
        return Num_contrato;
    }

    public void setNum_contrato(String Num_contrato) {
        this.Num_contrato = Num_contrato;
    }

    public String getServicio() {
        return Servicio;
    }

    public void setServicio(String Servicio) {
        this.Servicio = Servicio;
    }

    public String getNom_Barrio() {
        return Nom_Barrio;
    }

    public void setNom_Barrio(String Nom_Barrio) {
        this.Nom_Barrio = Nom_Barrio;
    }

    public void pedir_datos() {

        this.Nom_Cliente = JOptionPane.showInputDialog(null, "Digite el nombre "
                + "del cliente");
        this.Cedula = JOptionPane.showInputDialog(null, "Digite la cédula "
                + "del cliente");
        this.Primer_Apellido = JOptionPane.showInputDialog(null, "Digite el "
                + "primer apellido del cliente");
        this.Segundo_Apellido = JOptionPane.showInputDialog(null, "Digite el "
                + "segundo apellido del cliente");
        this.Num_contrato = JOptionPane.showInputDialog(null, "Digite el numero "
                + "de contrato del cliente");
        this.Servicio = JOptionPane.showInputDialog(null, "Digite el nombre "
                + "del servicio por el cual está suscrito en el sistema");
        this.Nom_Barrio = JOptionPane.showInputDialog(null, "Digite el nombre "
                + "del barrio en el cual se va a realizar la instalación");
    }

}
