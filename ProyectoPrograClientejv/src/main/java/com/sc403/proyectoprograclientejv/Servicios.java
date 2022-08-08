
package com.sc403.proyectoprograclientejv;

public abstract class Servicios {
    protected int precio;
    protected String tipo;
    protected String Instalacion;

    public Servicios(int precio, String tipo, String Instalacion) {
        this.precio = precio;
        this.tipo = tipo;
        this.Instalacion = Instalacion;
    }
    
    public Servicios() {
        this.precio = 0;
        this.tipo = "";
        this.Instalacion = "";
    }

   

    public abstract void pedir_datos ();
    
    public void imprimir_datos (){
        
    }
    
}
