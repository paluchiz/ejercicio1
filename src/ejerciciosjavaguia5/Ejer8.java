/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota:
investigar la función equals() en Java.
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

public class Ejer8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un frse ");
        String frase = leer.next();
        if (frase.equals("eureka")){
            System.out.println("Correcto");
        } else System.out.println("Incorrecto");
    }
    
}
