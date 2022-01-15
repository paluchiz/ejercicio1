/*
 Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Ejer15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int suma, num;
        suma = 0;
        for (int i = 1; i < 20; i++) {
            System.out.println("Ingrese un numero");
            num = leer.nextInt();
            if (num > 0) {
                suma = suma + num;
            } else if (num == 0) {
                System.out.println("El numero ingresado es cero");
                break;
            }
        }
        {
            System.out.println("La suma de los numeros ingresados es igual a " + suma);
        }
    }

    
        

