/*
 Escribir un programa que pida dos números enteros por teclado y calcule la suma
de los dos. El programa deberá después mostrar el resultado de la suma
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

/**
 
 */
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada= new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese un numero");
        int nro1 = entrada. nextInt();
        
        System.out.println("Ingrese otro numero");
        int nro2=entrada. nextInt();
        
        System.out.println("La suma de los numeros ingresados es igual a " +(nro1+nro2) );
    }
    
}
