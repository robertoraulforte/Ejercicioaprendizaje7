/* Ejercicio extra 4
 * Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su 
equivalente en romano.

 */
package ejercicioextra4;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioextra4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese un numero entre 1 y 10");
        
        int num = leer.nextInt();
       
        switch(num) {
            
           case 1:
               System.out.println("Corresponde I");
           break;
           case 2:
               System.out.println("Corresponde a II");
           break;
           case 3:
               System.out.println("Corresponde a III");
           break;
           case 4:
               System.out.println("Corresponde IV");
           break;
           case 5:
               System.out.println("Corresponde a V");
           break;
           case 6:
               System.out.println("Corresponde a VI");
           break;
           case 7:
               System.out.println("Corresponde VII");
           break;
           case 8:
               System.out.println("Corresponde a VIII");
           break;
           case 9:
               System.out.println("Corresponde a IX");
           break;
           case 10:
               System.out.println("Corresponde a X");
           break;   
               
           default:
               System.out.println("El numero es menor que 0 o mayor que 10");
}

        
        
        
    }
    
}
