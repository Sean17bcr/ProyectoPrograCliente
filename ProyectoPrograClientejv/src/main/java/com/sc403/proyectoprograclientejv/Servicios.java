
package com.sc403.proyectoprograclientejv;

public abstract class Servicios {
    protected double precio;
    protected String tipo;
    protected String Instalacion;

    public Servicios(double precio, String tipo, String Instalacion) {
        this.precio = precio;
        this.tipo = tipo;
        this.Instalacion = Instalacion;
    }
    
    public Servicios() {
        this.precio = 0;
        this.tipo = "";
        this.Instalacion = "";
    }

   

    public abstract int calcularcantidaddeMG();
    public abstract double calcular_precio();
    
    public void imprimir_datos (){
        
    }
    
}
