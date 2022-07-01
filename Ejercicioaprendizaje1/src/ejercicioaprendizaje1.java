
import java.util.Scanner;

/* Ejercicio 1
 * Escribir un programa que pida dos números enteros por teclado y calcule la suma de los 
dos. El programa deberá después mostrar el resultado de la suma.
 */

/**
 *
 * @author rober
 */
public class ejercicioaprendizaje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
      Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
      int num2;
      
        System.out.println("ingrese el primer numero");
        
        int num1 = leer.nextInt();
        
        System.out.println("ingrese el segundo numero");
        
        num2 = leer.nextInt();
        
        System.out.println("la suma es " + (num1+num2));

    }
    
}
