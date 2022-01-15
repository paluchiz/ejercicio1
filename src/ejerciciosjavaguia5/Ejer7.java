/*
7. Crear un programa que dado un numero determine si es par o impar.
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

public class Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un numero ");
        int num = leer.nextInt();
        if (num==0) {
            System.out.println("El numero es igual a cero");
        } else if ((num%2)==0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
    