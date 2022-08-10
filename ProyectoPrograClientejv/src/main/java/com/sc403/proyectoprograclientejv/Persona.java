
package com.sc403.proyectoprograclientejv;


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
    
    
}
