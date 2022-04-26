/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.factory;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class TestArticulosFactory {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int eleccion = 0;

        //Menu
        System.out.println("¿Que articulos desea adquirir?");
        System.out.println(Articulos.DELL_Alienware_M15 + ") Laptop Dell DELL_Alienware M15");
        System.out.println(Articulos.Lenovo_Legion_5 + ") Laptop Lenovo Legin 5");
        System.out.println(Articulos.Xiaomi_Poco_M3 + ") Smartphone Xiaomi Poco M3");
        System.out.println(Articulos.Xiaomi_Redmi_Note_11 + ") Smartphone Xiaomi Redmi Note 11");
        System.out.println(Articulos.Microsoft_Surface_Pro_7 + ") Tablet Microsoft Surface Pro 7");
        System.out.println(Articulos.Tab_P11 + ") Tablet P11");

        //trycatch
        try {
            System.out.print("Elige una opcion: ");
            eleccion = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("No capturaste ninguna opcion");
        }

        Articulos articulos = ArticulosFactory.createArticulos(eleccion);
        System.out.println(articulos.toString());
    }
}
