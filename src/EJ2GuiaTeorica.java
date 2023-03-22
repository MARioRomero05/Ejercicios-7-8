
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mario Romero
 */
public class EJ2GuiaTeorica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println(" Ingrese dos numeros");
        int n1 = leer.nextInt(), n2 = leer.nextInt();
        EsMultiplo(n1, n2);
    }

    public static void EsMultiplo(int n1, int n2) {
        if (n1 % n2 == 0) {
            System.out.println(" Es multiplo.");
        } else {
            System.out.println(" No es multiplo");
        }
    }
    
}
