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
public class Tablet implements Articulos{
    private String portabilidad;
    private int precio;
    private String conectividad;
    private int almacenamiento;
    private boolean bluetooth;

    public Tablet() {
    }

    public Tablet(String portabilidad, int precio, String conectividad, int almacenamiento, boolean bluetooth) {
        this.portabilidad = portabilidad;
        this.precio = precio;
        this.conectividad = conectividad;
        this.almacenamiento = almacenamiento;
        this.bluetooth = bluetooth;
    }

    public String getPortabilidad() {
        return portabilidad;
    }

    public void setPortabilidad(String portabilidad) {
        this.portabilidad = portabilidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getConectividad() {
        return conectividad;
    }

    public void setConectividad(String conectividad) {
        this.conectividad = conectividad;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    @Override
    public String toString() {
        return "Tablet{" + "portabilidad=" + portabilidad + ", precio=" + precio + ", conectividad=" + conectividad + ", almacenamiento=" + almacenamiento + ", bluetooth=" + bluetooth + '}';
    }
    
    
}
