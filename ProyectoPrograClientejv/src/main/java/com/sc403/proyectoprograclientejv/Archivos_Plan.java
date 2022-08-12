
package com.sc403.proyectoprograclientejv;

import com.sc403.proyectoprograclientejv.Cliente;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

public class Archivos_Plan {
    private String ruta;
    private String nombre_archivo;
    private Plan obj_Plan;

    public Archivos_Plan(String ruta, String nombre_archivo, Plan obj_Plan) {
        this.ruta = ruta;
        this.nombre_archivo = nombre_archivo;
        this.obj_Plan = obj_Plan;
    }

    public Archivos_Plan() {
        this.ruta = "";
        this.nombre_archivo = "Plan.txt";
        this.obj_Plan = new Plan();
    }

    public Archivos_Plan(Plan obj_Plan) {
        this.ruta = "";
        this.nombre_archivo = "Plan.txt";
        this.obj_Plan = obj_Plan;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getNombre_archivo() {
        return nombre_archivo;
    }

    public void setNombre_archivo(String nombre_archivo) {
        this.nombre_archivo = nombre_archivo;
    }

    public Plan getobj_Plan() {
        return obj_Plan;
    }

    public void setobj_Plan(Plan obj_Plan) {
        this.obj_Plan = obj_Plan;
    }

    public void agregar_Plan() {

        try {

            File file = new File(this.ruta + this.nombre_archivo);

            if (!file.exists()) {
                file.createNewFile();
            }

            
            FileWriter fw = new FileWriter(file, true);

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(this.obj_Plan.getNombre() + ","
                    + this.obj_Plan.getMegas() + ","
                    + this.obj_Plan.getSimetrico()+ "," );

            bw.flush();
            bw.newLine();

            bw.close();

            JOptionPane.showMessageDialog(null, "El Plan fue Ingresado "
                    + "Correctamente en el archivo!!!");

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }

    public void mostrar_reporte_de_Planes() {

        try {

            String registro;
            File file = new File(this.ruta + this.nombre_archivo);


            if (!file.exists()) {
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "No hay registros de Planes!!!");

                return;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String lectura = "";
            int contador = 0;

            lectura = "Lista de informacion de los Planes\n"
                    + "Detalle en el siguiente orden (Nombre del Plan,"
                    + "Megas, Simetrico. )\n\n";

            while ((registro = br.readLine()) != null) {

                contador++;
                
                StringTokenizer st = new StringTokenizer(registro, ",");

                lectura = lectura + st.nextToken() + " " + st.nextToken() + " "
                        + st.nextToken() + "\n";

            }

            br.close();

            if (contador > 0) {
                JOptionPane.showMessageDialog(null, lectura);
            } else {
                JOptionPane.showMessageDialog(null, "No hay Planes en el archivo");
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }


    public void borrar_por_Nombre_dePlan() {

        try {

            String registro;
            String nombre, megas, simetrico, nombreP;
            int contador = 0;

            File tempDB = new File(this.ruta + "Plan_temporal.txt");
            File db = new File(this.ruta + this.nombre_archivo);

            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));

            nombreP = JOptionPane.showInputDialog(null, "Digite "
                    + "el nombre del plan que desea eliminar");

            while ((registro = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(registro, ",");

                nombre = st.nextToken();
                megas = st.nextToken();
                simetrico = st.nextToken();
                if (!nombre.equals(nombreP)) {
                    bw.write(registro);
                    bw.flush();
                    bw.newLine();
                } else {
                    contador++;
                }
            }

            br.close();
            bw.close();

       
            db.delete();


            tempDB.renameTo(db);

            if (contador > 0) {
                JOptionPane.showMessageDialog(null, "Plan eliminado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Plan no fue encontrado");
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    public void Modificar_informacion_del_Plan() {

        try {

            
            String nuevoNombre = "", nuevoMega = "", nuevoSimetrico = "", 
                     registro, nom, registro2;
            String nombre, megas, simetrico, Segundo_Apellido, Num_contrato, Servicio, Nom_Barrio;
            
            int contador = 0;

            File db = new File(this.ruta + this.nombre_archivo);
            BufferedReader br = new BufferedReader(new FileReader(db));

            File tempDB = new File(this.ruta + "Plan_temporal.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));

            nom = JOptionPane.showInputDialog(null, "Digite el nombre del plan el cual desea modificar: ");

            while ((registro = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(registro, ",");
                nombre = st.nextToken();
                megas = st.nextToken();
                simetrico = st.nextToken();
                

                if (nom.equals(nombre)) {
                    contador++;
                    JOptionPane.showMessageDialog(null, "Los datos del Plan son: \n"
                            + "Nombre del Plan: " + nombre + "\n"
                            + "Cantidad de megas: " + megas + "\n"
                            + "Simetrico: " + simetrico + "\n");
                }

            }

            br.close();

            if (contador == 1) {

                nuevoNombre = JOptionPane.showInputDialog(null, "Digite el nuevo nombre del cliente");
                nuevoMega = JOptionPane.showInputDialog(null, "Digite el nueva cedula del cliente");
                nuevoSimetrico = JOptionPane.showInputDialog(null, "Digite el nuevo primer apellido del cliente");
               

                BufferedReader br2 = new BufferedReader(new FileReader(db));

                while ((registro2 = br2.readLine()) != null) {

                    StringTokenizer st2 = new StringTokenizer(registro2, ",");
                    nombre = st2.nextToken();
                    megas = st2.nextToken();
                    simetrico = st2.nextToken();
                    if (nom.equals(nombre)) {
                        bw.write(nuevoNombre + "," + nuevoNombre + ","
                                + nuevoMega + "," + nuevoSimetrico);
                    } else {
                        bw.write(registro2);
                    }
                    bw.flush();
                    bw.newLine();
                }

                bw.close();
                br2.close();
                db.delete();
                tempDB.renameTo(db);

                JOptionPane.showMessageDialog(null, "El Plan "
                        + "fue actualizado correctamente!!!");

            } else {
                JOptionPane.showMessageDialog(null, "El nombre del cliente "
                        + "no fue encontrada en el sistema!!!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    /* 
    
    
    Plan obj_Plan = new Plan();
    Archivos_Plan obj_Archivos = new Archivos_Plan();
    
    Agregar******
    
    obj_Plan.pedir_datos();
    obj_Archivos.setObj_Cliente(obj_Plan);
    obj_Archivos.agregar_Plan();
    
    MOstrar Planes***********
    obj_Archivos.mostrar_Planes();
    
    Borrar****
    obj_Archivos.borrar_por_Nombre_dePlan();
    
    Modificar Plan***
    obj_Archivos.Modificar_informacion_del_Plan();
    
    */
}
