/*
 Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
* *
* *
* * * *
 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Ejer17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        System.out.println("Ingrese el tamaño de su cuadrado");
        int n=leer.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i>0 &&j>0&&i<n-1&&j<n-1){
                    System.out.print("  ");
                }else {
                   System.out.print("* ");
                }
            }System.out.println(" ");
            
        }
    }
    
}
