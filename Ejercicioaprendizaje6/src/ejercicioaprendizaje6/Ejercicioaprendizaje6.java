/*
 Ejercicio 6
Crear un programa que dado un numero determine si es par o impar
 */
package ejercicioaprendizaje6;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioaprendizaje6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese un numero entero");
        int num = leer.nextInt();
        if (num%2==0)
        {
            System.out.println("El numero es par");
        }
        else
        {
            System.out.println("El numero es impar");
        }
    }
    
}

        
    }
    
}
