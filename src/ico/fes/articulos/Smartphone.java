/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.articulos;

import ico.fes.factory.Articulos;

/**
 *
 * @author Lenovo
 */
public class Smartphone implements Articulos{
    private String procesador;
    private String pantalla;
    private int camara;
    private int almacenamiento;
    private boolean huella;

    public Smartphone() {
    }

    public Smartphone(String procesador, String pantalla, int camara, int almacenamiento, boolean huella) {
        this.procesador = procesador;
        this.pantalla = pantalla;
        this.camara = camara;
        this.almacenamiento = almacenamiento;
        this.huella = huella;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getPantalla() {
        return pantalla;
    }

    public void setPantalla(String pantalla) {
        this.pantalla = pantalla;
    }

    public int getCamara() {
        return camara;
    }

    public void setCamara(int camara) {
        this.camara = camara;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean isHuella() {
        return huella;
    }

    public void setHuella(boolean huella) {
        this.huella = huella;
    }

    @Override
    public String toString() {
        return "Smartphone{" + "procesador=" + procesador + ", pantalla=" + pantalla + ", camara=" + camara + ", almacenamiento=" + almacenamiento + ", huella=" + huella + '}';
    }
    
    
}
