/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Ejer18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int num;
               for (int i = 0; i < 4; i++) {
               System.out.println(" Ingrese un numero entre 1 y 20 ");
               num = leer.nextInt();
                       System.out.println("");

        
        while (num < 1 || num > 20) {
            System.out.println("Error! ingrese un numero correcto");
            num = leer.nextInt();
        }

        switch(i) {
            case 0:
                System.out.print(" " + num);
                for (int j = 0; j < num; j++) {
                    System.out.print(" * ");
                }
                break;
            case 1:
                System.out.print("" + num);
                for (int j = 0; j < num; j++) {
                    System.out.print(" * ");
                }
                break;
            case 2:
                System.out.print(" " + num);
                for (int j = 0; j < num; j++) {
                    System.out.print(" * ");
                }
                break;    

            case 3: 
             
                System.out.print(" "+num);
                 for (int j=0;j < num; j++);
                 {
                 System.out.print(" * ");
         
    }
                 break;
    }
    }
}
}

