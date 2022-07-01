/*Ejercicio 5

Define una variable de tipo boolean, double y char. Guarda información en ellas a través del 
Scanner. 
 
 */
package ejerciciointro5;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejerciciointro5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        double n;
        
        System.out.println("ingrese el numero para double");
        n = leer.nextDouble();
        System.out.println("el numero para double es " + n);
        
        
        
        boolean logica;
        
        System.out.println("indique valor de boolean");
        
        logica = leer.nextBoolean();
        
        System.out.println("el valor de boolean es " + logica);
        
        
        char caracter;
        
        System.out.println("introduce una palabra para obtener un caracter");
        
        caracter = leer.next().charAt(0);
        
        System.out.println("el caracter es : " + caracter );
                
        
        
    }
    
}
