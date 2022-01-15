/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas. Nota: investigar la función toUpperCase() y
toLowerCase() en Java.
 */
package Ejer3;

import java.util.Locale;
import java.util.Scanner;


public class java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese una frase");
        String frase= leer. next();
        System.out.println("Su frase en mayuscula es " + frase.toUpperCase());
        System.out.println("Su frase en miniscula es " + frase.toLowerCase());
    }
    
}
