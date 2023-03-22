/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/** Implementar una función que permita obtener un número entero 
 *  aleatorio comprendido entre dos límites que introduciremos por 
 *  teclado. El número obtenido se debe mostrar por pantalla.
 *
 * @author Mario Romero
 */
public class EJ1Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero limite como minimo");
        int limite1 = read.nextInt();
        System.out.println("Ahora, ingrese un numero limite como maximo");
        int limite2 = read.nextInt();
        int numAl = aleatorio(limite1, limite2);
        System.out.println("El numero aleatorio entre "+limite1+" y "+limite2+" es "+numAl);
    }
    
    public static int aleatorio(int limite1, int limite2){
        int num= (int) (Math.floor((Math.random()*(limite2-limite1+1))+limite1));
        System.out.println(num);
        return num;
    }
}
