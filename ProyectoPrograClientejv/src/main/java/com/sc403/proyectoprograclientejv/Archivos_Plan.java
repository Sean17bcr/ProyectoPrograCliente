
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
        this.nombre_archivo = "Cliente.txt";
        this.obj_Plan = new Plan();
    }

    public Archivos_Plan(Cliente obj_Cliente) {
        this.ruta = "";
        this.nombre_archivo = "Cliente.txt";
        this.obj_Cliente = obj_Cliente;
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

    public Cliente getObj_Cliente() {
        return obj_Cliente;
    }

    public void setObj_Cliente(Cliente obj_Cliente) {
        this.obj_Cliente = obj_Cliente;
    }

    public void agregar_persona() {

        try {

            File file = new File(this.ruta + this.nombre_archivo);

            if (!file.exists()) {
                file.createNewFile();
            }

            //True parámetro, permite que al archivo se le pueda adicionar información 
            FileWriter fw = new FileWriter(file, true);

            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(this.obj_Cliente.getNom_Cliente() + ","
                    + this.obj_Cliente.getCedula() + ","
                    + this.obj_Cliente.getPrimer_Apellido()
                    + "," + this.obj_Cliente.getSegundo_Apellido() + ","
                    + this.obj_Cliente.getNum_contrato() + ","
                    + this.obj_Cliente.getServicio() + ","
                    + this.obj_Cliente.getNom_Barrio() + ",");

            //Adiciona la información en el archivo 
            bw.flush();
            bw.newLine();

            bw.close();

            JOptionPane.showMessageDialog(null, "El Cliente fue Ingresad(a) "
                    + "Correctamente en el archivo!!!");

        } catch (Exception ex) {

            ex.printStackTrace();

        }

    }

    public void mostrar_reporte_de_Clientes() {

        try {

            String registro;
            File file = new File(this.ruta + this.nombre_archivo);


            if (!file.exists()) {
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "No hay registros de Clientes!!!");

                return;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String lectura = "";
            int contador = 0;

            lectura = "Lista de informacion de los clientes\n"
                    + "Detalle en el siguiente orden (Nombre del cliente,"
                    + "Cédula, Primer pellido,Segundo Apellido, Num_contrato ,"
                    + "Servicio, Nombre del barrio. )\n\n";

            while ((registro = br.readLine()) != null) {

                contador++;
                
                StringTokenizer st = new StringTokenizer(registro, ",");

                lectura = lectura + st.nextToken() + " " + st.nextToken() + " " + st.nextToken() + " "
                        + " " + st.nextToken() + " " + st.nextToken() + " " + st.nextToken() + " "
                        + " " + st.nextToken() + "\n";

            }

            br.close();

            if (contador > 0) {
                JOptionPane.showMessageDialog(null, lectura);
            } else {
                JOptionPane.showMessageDialog(null, "No hay Clientes en el archivo");
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

   
    public void buscar_Cliente_por_Num_Cedula() {

        try {

            String registro;
            String Nom_Cliente, Cedula, Primer_Apellido, Segundo_Apellido, Num_contrato, Servicio, Nom_Barrio, ced;

            File file = new File(this.ruta + this.nombre_archivo);

            
            if (!file.exists()) {
                file.createNewFile();
                JOptionPane.showMessageDialog(null, "No hay registros del "
                        + "Cliente!!!");
                
                return;
            }

            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);

            String lectura = "";
            int contador = 0;

            lectura = "INFORMACIÓN DEL CLIENTE\n"
                    + "Detalle en el siguiente orden (Nombre del cliente , "
                    + " Cedula, Primer apellido,Segundo apellido, Num_contrato"
                    + "Servicio, Nom_Barrio )\n\n";

            ced = JOptionPane.showInputDialog(null, "Digite el numero de "
                    + "cedula del cliente al cual desea encontrar");

            while ((registro = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(registro, ",");

                Nom_Cliente = st.nextToken();
                Cedula = st.nextToken();
                Primer_Apellido = st.nextToken();
                Segundo_Apellido = st.nextToken();
                Num_contrato = st.nextToken();
                Servicio = st.nextToken();
                Nom_Barrio = st.nextToken();

                //Compara una cédula con otra para verificar si son iguales
                if (Cedula.equals(ced)) {
                    contador++;
                    lectura = lectura + Nom_Cliente + " " + Cedula + " " + Primer_Apellido + " "
                            + " " + Segundo_Apellido + " " + Num_contrato + " " + Servicio + " "
                            + " " + Nom_Barrio + "\n";

                }
            }

            br.close();

            if (contador > 0) {
                JOptionPane.showMessageDialog(null, lectura);
            } else {
                JOptionPane.showMessageDialog(null, "El Cliente no fue "
                        + "encontrado en el Sistama!!!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }

    }

    public void borrar_por_Num_contrato() {

        try {

            String registro;
            String Nom_Cliente, Cedula, Primer_Apellido, Segundo_Apellido,
                   Num_contrato, Servicio, Nom_Barrio, primer_apellido, contra;
            int contador = 0;

            File tempDB = new File(this.ruta + "Cliente_temporal.txt");
            File db = new File(this.ruta + this.nombre_archivo);

            BufferedReader br = new BufferedReader(new FileReader(db));
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));

            contra = JOptionPane.showInputDialog(null, "Digite "
                    + "el número de contrato del cliente al cuál desea eliminar");

            while ((registro = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(registro, ",");

                Nom_Cliente = st.nextToken();
                Cedula = st.nextToken();
                Primer_Apellido = st.nextToken();
                Segundo_Apellido = st.nextToken();
                Num_contrato = st.nextToken();
                Servicio = st.nextToken();
                Nom_Barrio = st.nextToken();
                if (!Num_contrato.equals(contra)) {
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
                JOptionPane.showMessageDialog(null, "Cliente eliminado correctamente");
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no fue encontrado");
            }

        } catch (Exception ex) {
            ex.printStackTrace();

        }
    }

    public void Modificar_informacion_del_Cliente() {

        try {

            
            String nuevoNombre = "", nuevoPrimerApellido = "", nuevoSegundoApellido = "",
                    nuevoSintoma = "", nuevoNom_Barrio = "", nuevoDiagnostico = "", nuevaCedula = "", registro, ced, registro2;
            String Nom_Cliente, Cedula, Primer_Apellido, Segundo_Apellido, Num_contrato, Servicio, Nom_Barrio;
            int nuevaEdad = 0;
            int contador = 0;

            File db = new File(this.ruta + this.nombre_archivo);
            BufferedReader br = new BufferedReader(new FileReader(db));

            File tempDB = new File(this.ruta + "Clientes_temporal.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(tempDB));

            ced = JOptionPane.showInputDialog(null, "Digite el número de cédula del cliente el cual desea modificar");

            while ((registro = br.readLine()) != null) {

                StringTokenizer st = new StringTokenizer(registro, ",");
                Nom_Cliente = st.nextToken();
                Cedula = st.nextToken();
                Primer_Apellido = st.nextToken();
                Segundo_Apellido = st.nextToken();
                Num_contrato = st.nextToken();
                Servicio = st.nextToken();
                Nom_Barrio = st.nextToken();

                if (ced.equals(Cedula)) {
                    contador++;
                    JOptionPane.showMessageDialog(null, "Los datos del cliente son: \n"
                            + "Nombre del paciente: " + Nom_Cliente + "\n"
                            + "La cedula del cliente: " + Cedula + "\n"
                            + "Primer Apellido: " + Primer_Apellido + "\n"
                            + "Segundo Apellido: " + Segundo_Apellido + "\n"
                            + "Num_contrato: " + Num_contrato + "\n"
                            + "Servicio: " + Servicio + "\n"
                            + "Nom_Barrio: " + Nom_Barrio + "\n");
                }

            }

            br.close();

            if (contador == 1) {

                nuevoNombre = JOptionPane.showInputDialog(null, "Digite el nuevo nombre del cliente");
                nuevaCedula = JOptionPane.showInputDialog(null, "Digite el nueva cedula del cliente");
                nuevoPrimerApellido = JOptionPane.showInputDialog(null, "Digite el nuevo primer apellido del cliente");
                nuevoSegundoApellido = JOptionPane.showInputDialog(null, "Digite el nuevo segundo apellido del cliente");
                String nuevo_Nom_Contrato = JOptionPane.showInputDialog(null, "Digite el nuevo numero de contrato del cliente");
                String nuevaServicio = JOptionPane.showInputDialog(null, "Digite el nombre del nuevo servicio que desea adquirir");
                nuevoNom_Barrio = JOptionPane.showInputDialog(null, "Digite el nombre del barrio");

                BufferedReader br2 = new BufferedReader(new FileReader(db));

                while ((registro2 = br2.readLine()) != null) {

                    StringTokenizer st2 = new StringTokenizer(registro2, ",");
                    Nom_Cliente = st2.nextToken();
                    Cedula = st2.nextToken();
                    Primer_Apellido = st2.nextToken();
                    Segundo_Apellido = st2.nextToken();
                    Num_contrato = st2.nextToken();
                    Servicio = st2.nextToken();
                    Nom_Barrio = st2.nextToken();
                    if (ced.equals(Cedula)) {
                        bw.write(nuevoNombre + "," + nuevaCedula + ","
                                + nuevoPrimerApellido + "," + nuevoSegundoApellido + "," + nuevo_Nom_Contrato
                                + "," + nuevaServicio + "," + nuevoNom_Barrio);
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

                JOptionPane.showMessageDialog(null, "El cliente "
                        + "fue actualizadao correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "La cédula del cliente "
                        + "no fue encontrada en el sistema");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
    
}
