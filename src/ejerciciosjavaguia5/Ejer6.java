/*
 Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

public class Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer= new Scanner (System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
      System.out.println("Ingrese un numero ");
      int num1=leer.nextInt();
      System.out.println("Ingrese un numero ");
      int num2=leer.nextInt();
      if (num1>num2){
          System.out.println("El primer numero ingresado es mayor");
          
      }
      else if (num2>num1){
          System.out.println("El segundo numero es mayor");        
                }
      else {
          System.out.println("Los numeros son iguales");}
      
    }
    
}
5