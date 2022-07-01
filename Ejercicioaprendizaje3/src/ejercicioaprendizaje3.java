
import java.util.Scanner;

/*
Ejercicio 3
 Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda 
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */

/**
 *
 * @author rober
 */
public class ejercicioaprendizaje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
     String Frase;
     
     System.out.println("Ingrese una frase");
       Frase = leer.nextLine();
        System.out.println(Frase.toUpperCase());
        System.out.println(Frase.toLowerCase());
        
    }
    
}

   
