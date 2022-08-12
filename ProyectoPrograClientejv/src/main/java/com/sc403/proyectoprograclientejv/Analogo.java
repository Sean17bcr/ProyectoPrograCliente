
package com.sc403.proyectoprograclientejv;

import javax.swing.JOptionPane;


public class Analogo extends Cable {
    private String calidadVideo;

    public Analogo(String calidadVideo, int Canales, String CanalExclusivo, double precio, String tipo, String Instalacion) {
        super(Canales, CanalExclusivo, precio, tipo, Instalacion);
        this.calidadVideo = calidadVideo;
    }
    
    public Analogo() {
        
        this.calidadVideo = "";
    }

    public String getCalidadVideo() {
        return calidadVideo;
    }

    public void setCalidadVideo(String calidadVideo) {
        this.calidadVideo = calidadVideo;
    }

    @Override
    public void pedir_datos() {
        this.calidadVideo = JOptionPane.showInputDialog(null, "Ingrese la "
                + "calidad de video del cliente: ");
    }

    @Override
    public void imprimir_datos() {
        JOptionPane.showMessageDialog(null, "La calidad de video: "
                + " "+ this.calidadVideo );
    }
    
    
    
}
