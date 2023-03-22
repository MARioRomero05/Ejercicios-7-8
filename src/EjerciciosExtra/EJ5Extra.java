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
public class EJ5Extra {

    /** 5. Crea un programa que pida el nombre al usuario y lo escriba alternando mayúsculas y minúsculas
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = read.next();
        alterado(nombre);
    }
    
    public static void alterado(String nombre){
        String nueva="";
        for (int i = 0; i < nombre.length(); i++) {
            String letraActual = nombre.substring(i, i + 1);
            if (i%2==0) {
                String letraNueva = letraActual.toUpperCase();
                nueva=nueva.concat(letraNueva);
            } else {
                String letraNueva = letraActual;
                nueva=nueva.concat(letraNueva);
            }
        }
        System.out.println(nueva);
    }
}
