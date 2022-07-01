/*Ejercicio 4
 * Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por 
pantalla

incorpora el uso de .useDelimiter("\n")

 */
package ejerciciointro4;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejerciciointro4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
      Scanner leer = new Scanner(System.in).useDelimiter("\n");
  
System.out.println("Ingresa tu edad");
 int edad = leer.nextInt();
 
 System.out.println("Ingresa tu nombre");
 String nombre = leer.next();

    }
    
}
