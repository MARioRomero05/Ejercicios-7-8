/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosExtra;

import java.util.Scanner;

/** 3. Diseñar un procedimiento que permita convertir coordenadas polares 
 *  (radio, ángulo) en cartesianas (x,y). NOTA: x=radio*cos(ángulo) 
 *  e y=radio*sen(ángulo).
 *
 * @author Mario Romero
 */
public class EJ3Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el radio de la coordenada polar");
        double rad = read.nextInt();
        System.out.println("Ingrese el angulo de la coodernada (0-360)");
        double ang = read.nextDouble();
        conversion(rad, ang);
    }
    
    public static void conversion(double rad, double ang){
        double x = Math.toRadians(rad);
        double y = Math.toRadians(ang);
        System.out.println("Coordenas cartesianas:\nX:"+Math.cos(x)+"\nY:"+Math.sin(y));        
    }
}
