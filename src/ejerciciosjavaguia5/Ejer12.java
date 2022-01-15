/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;


public class Ejer12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese una nota ");
        int nota = leer.nextInt();
        while (nota<0 || nota>10){
            System.out.println("Error, ingrese una nota de 0 a 10");
            nota=leer.nextInt();
        } System.out.println("La nota ingresada es "+nota);
    }
    
}
