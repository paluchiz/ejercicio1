/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo
se utilizan las siguientes funciones de Java Substring(), Length(), equals().

 */
package ejerciciosjavaguia5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author SAMSUNG
 */
public class Ejer16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    String frase;
    int contador,inc;
    contador=0;
    inc=0;
    do{
        System.out.println("Ingrese su codigo");
        frase=leer.next();
        if(frase.length()==5 && frase.substring(0,1).equals("X") && frase.substring(4,5).equals("O")){
            System.out.println("El codigo es correcto");
            contador++;
        } else if(!frase.equals("&&&&&")){
            inc++;
        }
    }while(!frase.equals("&&&&&"));
    System.out.println("La cantidad de veces que ingreso el codigo "+ contador + "y las incorrectas "+ inc);
    
  }
    
}
