
/*
 public static void main(String[] args) { 
 Scanner leer = new Scanner(); 
 System.out.println("Ingresa tu edad");
 String nombre = leer.nextInt();
 
 System.out.println("Ingresa tu nombre");
 int edad = leer.next()


 */
package deteccionerroresejerc5intro;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class DeteccionerroresEjerc5intro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         
         Scanner leer = new Scanner(System.in).useDelimiter("\n")
                 
 
         System.out.println("Ingresa tu edad");
        int edad = leer.nextInt();
 
 System.out.println("Ingresa tu nombre");
        String nombre = leer.next()
        
        
        
    }
    
}
