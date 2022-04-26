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
public class Computadora implements Articulos{
    private String marca;
    private String procesador;
    private int pantalla;
    private String disco;
    private String bateria;

    public Computadora() {
    }

    public Computadora(String marca, String procesador, int pantalla, String disco, String bateria) {
        this.marca = marca;
        this.procesador = procesador;
        this.pantalla = pantalla;
        this.disco = disco;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public int getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public String getDisco() {
        return disco;
    }

    public void setDisco(String disco) {
        this.disco = disco;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", procesador=" + procesador + ", pantalla=" + pantalla + ", disco=" + disco + ", bateria=" + bateria + '}';
    }
    
    
}
