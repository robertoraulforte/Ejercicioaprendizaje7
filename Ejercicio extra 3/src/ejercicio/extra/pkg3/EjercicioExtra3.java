/* Ejercicio extra 3
 * Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal. 
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase String.
 */
package ejercicio.extra.pkg3;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class EjercicioExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese una letra ");
        
        String letra = leer.nextLine();
        
        switch(letra) {
            case "a" :
                System.out.println("Ingresaste una A ");
                break;
            case "e" :
                System.out.println("Ingresaste una E");
                break;
                
            case "i":
                System.out.println("Ingresaste una I");
                break;
                
            case "o"   : 
                System.out.println("Ingresaste una O");
                break ;
                
            case "u":
                System.out.println("Ingresaste una U");
                
                default:
                    System.out.println("No ingresaste una ingresaste una vocal");
                            
                        
}

        
    }
    
}
