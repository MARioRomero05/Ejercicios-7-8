/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/**
 *
 * @author Mario Romero
 */
public class EJ4Extra {

    /** 4. Crea un programa que pida el nombre al usuario y lo escriba al 
     *  revés (de la última letra a la primera).
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = read.next();
        invertir(nombre);
    }
    
    public static void invertir(String nombre){
        String invertido="";
        for (int i = 0; i < nombre.length(); i++) {
            String original = nombre.substring(i,i+1);
            for (int j = 0; nombre.length() < j; j--) {
                invertido=invertido.concat(original);
            }
        }
        System.out.println("Su nombre al reves es: "+invertido);
    }
}
