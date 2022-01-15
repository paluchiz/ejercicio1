/*
 Crea una aplicación que a través de una función nos convierta una cantidad de
euros introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o
libras. La función tendrá como parámetros, la cantidad de euros y la moneda a
converir que será una cadena, este no devolverá ningún valor y mostrará un
mensaje indicando el cambio (void).
El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Ejer19 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double cantidad = 0;
        String moneda="moneda";
        conversor(cantidad,moneda);
   }
    public static void conversor(double cantidad,String moneda){
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        double resultado=0;
        boolean correcto=true;
        System.out.println("Elija la cantidad de euros convertir");
        cantidad= leer .nextDouble();
        System.out.println("*************Elija la moneda que desea convertir*************");
        System.out.println("Opcion 1 moneda libras");
        System.out.println("Opcion 2 moneda dolares");
        System.out.println("Opcion 3 moneda yenes");
        int opc=leer.nextInt();
        
        
        switch (opc){
            case 1: 
                resultado=cantidad *0.86;
                System.out.println("La moneda elegiga es libras ");
                break;
            
            case 2:
                resultado=cantidad*1.28;
                 System.out.println("La moneda elegiga es dolares ");
                break;
            case 3:
                resultado=cantidad*129.86;
                 System.out.println("La moneda elegiga es yenes ");
                break;
            default:
                System.out.println("La opcion ingresada no es valida");
            break;
          
        }
        if(correcto){
                System.out.println("La cantidad de euros "+ cantidad + " y la conversion equivalen a " + resultado);
                }
    }
       
        
    
