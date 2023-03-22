
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/** Crea una aplicación que le pida dos números al usuario y este pueda
    elegir entre sumar, restar, multiplicar y dividir. La aplicación debe tener
    una función para cada operación matemática y deben devolver sus
    resultados para imprimirlos en el main.
 *
 * @author Mario Romero
 */
public class EJ1GuiaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese dos numeros:");
        int n1 = leer.nextInt(), n2 =leer.nextInt();
        System.out.println("Que operacion desea ejecutar?\nS-Sumar\nR-Restar\nM-Multiplicar\nD-Dividir");
        String op=leer.next();
        switch(op) {
             case "S": 
                 System.out.println(suma(n1, n2));
             break;
             case "R": 
                 System.out.println(resta(n1, n2));
             break;
             case "M": 
                 System.out.println(multi(n1, n2));
             break;
             case "D": 
                 System.out.println(divi(n1, n2));
             break;
             default:
                 System.out.println("Opcion Incorrecta");
    }
}
    public static int suma(int n1, int n2){
        int s=n1+n2;
        return s;
    }
    public static int resta(int n1, int n2){
        int r=n1-n2;
        return r;
    }
    public static int multi(int n1, int n2){
        int m=n1*n2;
        return m;
    }
    public static double divi(double n1, double n2){
        double d=n1/n2;
        return d;
    }
}
