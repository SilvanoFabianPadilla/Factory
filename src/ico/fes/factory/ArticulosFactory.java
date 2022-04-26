/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import ico.fes.articulos.Computadora;
import ico.fes.articulos.Smartphone;
import ico.fes.articulos.Tablet;

/**
 *
 * @author Lenovo
 */
public class ArticulosFactory {
    public static Articulos createArticulos (int tipo){
        switch (tipo){
            case Articulos.DELL_Alienware_M15:
                return new Computadora("Dell", "Ryzen 7", 13, "500 GB", "10 Horas");
            case Articulos.Lenovo_Legion_5:
                return new Computadora("Lenovo", "Intel Core i7", 15, "1 TB", "12 Horas");
            case Articulos.Xiaomi_Poco_M3:
                return new Smartphone("Snapdragon 8", "Amoled", 48, 2, true);
            case Articulos.Xiaomi_Redmi_Note_11:
                return new Smartphone("Snapdragon 7", "Oled", 50, 1, true);
            case Articulos.Microsoft_Surface_Pro_7:
                return new Tablet("ligera", 1499900, "Wi-Fi 4G", 500, true);
            case Articulos.Tab_P11:
                return new Tablet("Pesada", 1899900, "Wi-Fi 5G", 1, true);
                
            default:
                throw  new AssertionError();
        }
    }
}
