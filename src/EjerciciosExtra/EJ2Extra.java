/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/** 2. Implementar una función que permita obtener el valor absoluto 
 *  de un número positivo y otra que obtenga la raíz cuadrada. Para 
 *  ello utilice los métodos abs() y sqrt() de la clase Math.
 *
 * @author Mario Romero
 */
public class EJ2Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero para utilizar");
        int n = read.nextInt();
        procedimiento(n);
    }
    
    public static void procedimiento (int n){
        int abs=Math.abs(n);
        System.out.println("El absoluto de "+n+" es "+abs);
        double raizC=Math.sqrt(n);
        System.out.println("La raiz cuadrada de "+n+ " es "+raizC);
    }
}
