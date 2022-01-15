/*
  Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial.*/
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

public class Ejer13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int suma,valor;
        System.out.println("Ingrese el limite ");
        int limite = leer.nextInt();
        suma=0;
        while(suma<limite){
            System.out.println("Ingrese un numero");
            valor=leer.nextInt();
            suma=suma+valor;}
        System.out.println("La suma es de " + suma);
    }
    
}
