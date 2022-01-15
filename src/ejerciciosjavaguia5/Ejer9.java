/*
 Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

public class Ejer9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un palabra ");
        String palabra = leer.next();
        if (palabra.length()==8){
            System.out.println("Correcto");
        }
        else {System.out.println("Incorrecto");
    }
    
}
