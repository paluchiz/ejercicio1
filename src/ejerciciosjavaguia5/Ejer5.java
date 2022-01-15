/*
 Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función
Math.sqrt().
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner leer= new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
      System.out.println("Ingrese un numero ");
      int num=leer.nextInt();
      System.out.println("El doble del numero es " + num*2);
      System.out.println ("El triple del numero es " + num*3);
      System.out.println("La raiz del numero es " + Math.sqrt(num));
    }
    
}
