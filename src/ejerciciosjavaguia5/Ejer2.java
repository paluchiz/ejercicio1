/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer= new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         System.out.println(" Ingrese su nombre ");
        String nombre = leer. next();
         System.out.println("Su nombre es " + nombre);
    }
    
}
