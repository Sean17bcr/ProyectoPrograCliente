package com.sc403.proyectoprograclientejv;


import javax.swing.JOptionPane;

/**
 *
 * @author Michael Arias Becerra
 */
public class Cliente extends Persona {

    private String num_contrato;
    private String servicio;
    private String nom_Barrio;

    public Cliente(String num_contrato, String servicio, String nom_Barrio, String nom_Cliente, String cedula, String primer_Apellido, String segundo_Apellido) {
        super(nom_Cliente, cedula, primer_Apellido, segundo_Apellido);
        this.num_contrato = num_contrato;
        this.servicio = servicio;
        this.nom_Barrio = nom_Barrio;
    }
    
    public Cliente() {
        this.num_contrato = "";
        this.servicio = "";
        this.nom_Barrio = "";
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
    
    
    @Override
    public void pedir_datos() {

        this.num_contrato = JOptionPane.showInputDialog(null, "Digite el numero "
                + "de contrato del cliente");
        this.servicio = JOptionPane.showInputDialog(null, "Digite el nombre "
                + "del servicio por el cual está suscrito en el sistema");
        this.nom_Barrio = JOptionPane.showInputDialog(null, "Digite el nombre "
                + "del barrio en el cual se va a realizar la instalación");
    }

}
