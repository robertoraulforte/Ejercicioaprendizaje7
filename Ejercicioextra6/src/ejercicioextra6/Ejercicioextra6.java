/* Ejercicio extra 6
    Leer la altura de N personas y determinar el promedio de estaturas que se encuentran por 
debajo de 1.60 mts. y el promedio de estaturas en general
 */
package ejercicioextra6;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioextra6 {

    /**
     * 
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in).useDelimiter("\n");
        
        int cantidad =0;
        double altura;
        int n = 0;
        double suma= 0;
        double sumacantidad = 0 ;
        
        System.out.println("Ingrese la cantidad de personas ");
        
        n = scanner.nextInt();
        
        for (int i=0; i<n ; i++) {
            
            System.out.println("Ingrese la altura de la persona " + (i+1)+ ": ");
            
            altura = scanner.nextDouble();
            
            suma += altura;
            
            if (altura < 1.6) {
                
                cantidad++;
                sumacantidad += altura;
                
            }
            
        }
       
        scanner.close();
        System.out.println("El promedio de la altura general es " + (suma/n));
        System.out.println("El promedio de la altura por debajo de 1.6 m es " + (sumacantidad/cantidad));
     
    }
    
}
