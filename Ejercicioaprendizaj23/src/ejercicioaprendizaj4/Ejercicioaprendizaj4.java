/*Ejercicio 4
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados 
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5)
 */
package ejercicioaprendizaj4;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioaprendizaj4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double grados;
        System.out.println("ingrese los grados a convertir");
        grados = leer.nextDouble();
        System.out.println("grados en farenheit " + (32 + (9*grados/5))  );

        
        
        
    }
    
}
