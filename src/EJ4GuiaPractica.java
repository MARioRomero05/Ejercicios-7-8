
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
public class EJ4GuiaPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese un numero para analizar");
        int num = read.nextInt();
        primo(num);
    }
    
    public static void primo(int num){
        boolean confirm;
        int cont=0;
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                cont++;
                break;
            }    
        }
        if (cont==1) {
            confirm=false;
        } else {
            confirm=true;
        }
        System.out.println("El numero "+num+"es primo? "+confirm);
    }
    
}
