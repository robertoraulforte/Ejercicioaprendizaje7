/* Ejercicio 16
 * Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le pida al 
usuario un numero a buscar en el vector. El programa mostrará donde se encuentra el 
numero y si se encuentra repetido
 */
package ejercicioaprendizaje16;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioaprendizaje16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del vector");
        int n = scanner.nextInt();

        System.out.println("Ingrese el numero a buscar");
        int numero = scanner.nextInt();

        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100);
        }

        int cantidad = 0;
        for (int i = 0; i < n; i++) {
            if (vector[i] == numero) {
                cantidad++;
            }
        }

        String mensaje = "";
        for (int i = 0; i < n; i++) {
            mensaje = mensaje+" "+vector[i];
        }

        System.out.println(mensaje);
        System.out.println("El numero "+numero+" se encuentra en el vector "+cantidad+" veces");

        scanner.close();
    }
}  
        
        
    }
    
}
