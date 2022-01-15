/*
 Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;


public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner leer= new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
         double F;
        System.out.println("Ingrese una temperatura ");
        int grados= leer. nextInt();
        F = 32+(9 * (grados/ 5));
        System.out.println(" La temperatura en grados Fahrenheit es " + F );
    }
    
}
