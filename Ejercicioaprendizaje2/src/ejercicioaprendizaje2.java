
import java.util.Scanner;

/*
Ejercicio 2
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por 
pantalla.
 
 */

/**
 *
 * @author rober
 */
public class ejercicioaprendizaje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
         Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("El nombre ingresado es " + nombre);        
    }
    
}

        
        
    }
    
}
