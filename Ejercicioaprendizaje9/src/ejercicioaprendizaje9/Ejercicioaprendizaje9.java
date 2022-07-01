/*Ejercicio 9
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase 
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que 
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar 
la función Substring y equals() de Java.
 */
package ejercicioaprendizaje9;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioaprendizaje9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una palabra o frase empezada en A");
        String frase = leer.next();
        if(frase.substring(0,1).toUpperCase().equals("A"))
        // if(frase.toUpperCase().startsWith("A"))
        {
            System.out.println("CORRECTO!");
        }
        else
        {
            System.out.println("INCORRECTO");
        }
    }

     
     
            
            
        
    
      }  

    
}
    
