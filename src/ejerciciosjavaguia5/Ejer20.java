/*
 Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden descendente.
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Ejer20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int num = 101;
        int V[] = new int[num];
        cargar(V);
        mostrar(V);
    }

    public static void cargar(int V[]) {

        for (int i = 0; i < V.length; i++) {
            V[i] = i;
        }
    }
    
public static void mostrar(int V[]) {

        for (int i = V.length-1; i >=0; i--) {
            System.out.println(V[i]+" ");
        }
    }
    
    


