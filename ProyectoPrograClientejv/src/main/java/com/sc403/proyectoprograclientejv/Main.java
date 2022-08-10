package com.sc403.proyectoprograclientejv;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
       
        iniciar_sistema();

        /*Cliente obj_Cliente = new Cliente();
        ManejoArchivos obj_archivos = new ManejoArchivos();
   
        String opcion, cont = "s";

        while (cont.equalsIgnoreCase("s")) {

            opcion = JOptionPane.showInputDialog(null, "Sistema de información de los cientes \n\n"
                    + "1. Agregar un nuevo cliente al Sistema\n"
                    + "2. Ver reporte completo de los cientes en el Sistema\n"
                    + "3. Borrar a un cliente del Sistema\n"
                    + "4. Buscar un cliente en el Sistema\n"
                    + "5. Modificar la informacion del cliente en el Sistema\n"
                    + "**Ingrese la opción de que desee: ");

            if (opcion.equals("1")) {
                obj_Cliente.pedir_datos();
                obj_archivos.setObj_Cliente(obj_Cliente);
                obj_archivos.agregar_persona();
            } else if (opcion.equals("2")) {
                obj_archivos.mostrar_reporte_de_Clientes();
            } else if (opcion.equals("3")) {
                obj_archivos.borrar_por_Num_contrato();
            } else if (opcion.equals("4")) {
                obj_archivos.buscar_Cliente_por_Num_Cedula();
            } else if (opcion.equals("5")) {
               obj_archivos.Modificar_informacion_del_Cliente();
           };

            cont = JOptionPane.showInputDialog(null, "Desea Continuar) s/n");
        }*/
    }

    public static void iniciar_sistema() {

        Principal frmPrincipal = new Principal();

        frmPrincipal.setTitle("Bienvenido");

        //Centrar un formulario en pantalla
        frmPrincipal.setLocationRelativeTo(null);

        //Mostrar en pantalla un formulario 
        frmPrincipal.setVisible(true);
    }
}
