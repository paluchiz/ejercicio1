/*
 Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
*/
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Ejer21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner leer=new Scanner(System.in,"ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    System.out.println("Ingrese el tamaño del vector");
    int num=leer.nextInt();
    int[] V=new int[num];
    cargar(V,num);
    buscar(V,num);
    mostrar(V,num);
    }
    public static void mostrar(int[] V, int num){
        for (int i=0;i<num; i++) {
           System.out.print(V[i]+ " ");
        }
    }
    public static void cargar(int[] V, int num){
        for(int i=0; i<num; i++){
            V[i]=(int) (Math.random()*10+1);
        }
    } 
    public static void buscar(int[] V,int num){
        Scanner leer=new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        int pos=0,cont=0;
        System.out.println("Ingrese el valor a buscar en el vector");
        int num1=leer.nextInt();
        for (int i=0;i<num1;i++){
            if (num1==V[i]){
                pos=i;
                cont++;
            }
        }
    if(cont==0){
        System.out.println("No se encontro el valor en el vector");
    }else if(cont==1){
        System.out.print("El valor " +num + " se encontro en el vector en la posicion "+ pos +" u no se repitio ");
    }else{
        System.out.println("El valor "+num +" se encontro en el vector en la posicion "+ pos +" y esta repetido");
    }
    }
    
    
    
}
