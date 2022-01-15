/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa
frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”. Nota: investigar la función Substring y equals() de Java.
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;


public class Ejer10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un frase ");
        String frase = leer.next();
        if (frase.substring(0,1).equals("A")){
        System.out.println("Correcto");}
        else{
            System.out.println("Incorrecto");
        }
    }
    
}
