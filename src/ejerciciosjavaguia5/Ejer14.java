/*
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Ejer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese un numero");
        double num1 = leer.nextDouble();
        System.out.println("Ingrese otro numero");
        double num2 = leer.nextDouble();
        int opc;
        String salir;
        salir = "s";

        do {
            System.out.println("-----------------MENU-----------------");
            System.out.println("Elija una opcion valida");
            System.out.println("Opcion 1 para Sumar ");
            System.out.println("Opcion 2 para Restar");
            System.out.println("Opcion 3 para Multiplicar");
            System.out.println("Opcion 4 para Dividir");
            System.out.println("Opcion 5 para salir ");
            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("La suma de los numeros es " + num1 + " y " + num2 + " es igual a " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La suma de los numeros es " + num1 + "y " + num2 + " es igual a " + (num1 + num2));
                    break;
                case 3:
                    System.out.println("La multiplicacion entre el " + num1 + " y " + num2 + " es igual a " + (num1 * num2));
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero");
                    } else {
                        System.out.println("La division entre " + num1 + " y " + num2 + " es igual a " + (num1 / num2));
                    }
                    break;
                case 5:
                    System.out.println("Seguro que desea salir S/N?");
                    salir = leer.next();
                    salir = salir.toUpperCase();
                    break;
                default:
                    System.out.println("La opcion elegida es incorrecta.");
            }

        }while (!salir.equals("S"));
        }
       
    
    }
    