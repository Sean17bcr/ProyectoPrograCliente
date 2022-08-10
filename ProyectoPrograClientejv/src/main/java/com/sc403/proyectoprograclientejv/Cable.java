
package com.sc403.proyectoprograclientejv;

import javax.swing.JOptionPane;


public class Cable extends Servicios implements Datos {
    protected int Canales;
    protected String cajaDigital;
    protected String CanalExclusivo;

    public Cable(int Canales, String cajaDigital, String CanalExclusivo, 
            double precio, String tipo, String Instalacion) {
        super(precio, tipo, Instalacion);
        this.Canales = Canales;
        this.cajaDigital = cajaDigital;
        this.CanalExclusivo = CanalExclusivo;
    }
    
    public Cable() {
        this.Canales = 0;
        this.cajaDigital = "";
        this.CanalExclusivo = "";
    }

    public int getCanales() {
        return Canales;
    }

    public void setCanales(int Canales) {
        this.Canales = Canales;
    }

    public String getCajaDigital() {
        return cajaDigital;
    }

    public void setCajaDigital(String cajaDigital) {
        this.cajaDigital = cajaDigital;
    }

    public String getCanalExclusivo() {
        return CanalExclusivo;
    }

    public void setCanalExclusivo(String CanalExclusivo) {
        this.CanalExclusivo = CanalExclusivo;
    }
    
    

    @Override
    public double calcular_precio() {
        return (this.precio); 
    }
    

    @Override
    public void pedir_datos() {
        this.tipo = JOptionPane.showInputDialog(null, "Ingrese el tipo de"
                + " servicio que desea adquirir: ");
        this.Instalacion= JOptionPane.showInputDialog(null, "Ingrese el "
                + "lugar donde desea realizar la instalacion: "); 
        this.cajaDigital= JOptionPane.showInputDialog(null, "Ingrese si "
                + "desea adquirir la caja digital: ");
        this.Canales= Integer.parseInt(JOptionPane.showInputDialog(null, 
                "Digite la cantidad de megas que desea adquirir: "));
        this.CanalExclusivo= JOptionPane.showInputDialog(null, "Ingrese "
                + "Si desea adquirir un canal Preimum y cual seria: ");
    }

    @Override
    public int calcularcantidaddeMG() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void imprimir_datos() {
        JOptionPane.showMessageDialog(null, "El tipo de servicio solicitado es:"
                + " "+ this.tipo + "\n" 
                + "El lugar de la instalacion es: " +this.Instalacion+ "\n"
                + "Caja Digital: "+this.cajaDigital+ "\n"
                + "La cantidad de megas solicitadas son: "+ this.Canales+ "\n"
                + "Canal Premium"+ this.CanalExclusivo);
    }

    

    
    
}
