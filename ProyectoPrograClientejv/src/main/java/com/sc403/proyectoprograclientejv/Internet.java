
package com.sc403.proyectoprograclientejv;

import javax.swing.JOptionPane;


public class Internet extends Servicios implements Datos {
    protected int Megas;
    protected String Router;

    public Internet(int Megas, String Router, double precio, String tipo, String Instalacion) {
        super(precio, tipo, Instalacion);
        this.Megas = Megas;
        this.Router = Router;
    }
    
    public Internet(int Megas, String Router) {
        this.Megas = Megas;
        this.Router = Router;
    }
    
    public Internet() {
        this.Megas = 0;
        this.Router = "";
    }

    public int getMegas() {
        return Megas;
    }

    public void setMegas(int Megas) {
        this.Megas = Megas;
    }

    public String getRouter() {
        return Router;
    }

    public void setRouter(String Router) {
        this.Router = Router;
    }
    
    @Override
    public int calcularcantidaddeMG() {
        return(this.Megas);
    }
    
    @Override
    public double calcular_precio() {
        return (this.precio);
    }

    @Override
    public void pedir_datos() {
        this.tipo = JOptionPane.showInputDialog(null, "Ingrese el tipo de servicio que desea adquirir: ");
        this.Instalacion= JOptionPane.showInputDialog(null, "Ingrese el lugar donde desea realizar la instalacion: "); 
        this.Router= JOptionPane.showInputDialog(null, "Ingrese si desea adquirir un router: ");
        this.Megas= Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad de megas que desea adquirir: "));
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
