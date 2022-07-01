/*Ejerjcicio 5
Escribir un programa que lea un número entero por teclado y muestre por pantalla el 
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package ejercicioaprendizaje5;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioaprendizaje5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numero;
        numero = leer.nextInt();
        System.out.println( "el"
                + " doble del numero es " + ( numero*2));
        System.out.println( " el triple es " +(numero*3));
        System.out.println( "la raiz cuadrada es " + Math.sqrt(numero));

        
        
    }
    
}
