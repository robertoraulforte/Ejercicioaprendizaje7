/*Ejercicio 13
 * Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo, si el 
cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * * 
*     *
*     *
* * * *

 */
package ejercicioaprendizaje13;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioaprendizaje13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de elementos del cuadrado");
        
        int n = scanner.nextInt();
        
        
        for (int i= 0 ; i < n; i++) {
         for(int j=0; j< n; j++) {
             
             if (i==0 ||  i == n -1 || j==0 || j == n-1) {
             
             System.out.println("*");
         } else{
             System.out.println(" ");

             
         }
             System.out.println();
    }
    
}
