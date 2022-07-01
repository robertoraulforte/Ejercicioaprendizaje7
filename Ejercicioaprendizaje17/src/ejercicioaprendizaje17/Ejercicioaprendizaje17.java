/* Ejercicio 17
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos 
de 2 dígitos, etcétera (hasta 5 dígitos).
 * 
 */
package ejercicioaprendizaje17;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioaprendizaje17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        int n = scanner.nextInt();
        
        int digitos = 5;
        
        int [] vector = new int[n];
        
        for (int i =0 ; i< n ; i++) {
        
            vector [i] = (int) (Math.random()* Math.pow(10, digitos)  );
            
            for (int i= 0 ; i < n; i++) {
                
                System.out.println(vector[i]);
            }
        
        int[] cantidad = new int[digitos];
        
        for (int i=0 ; i < digitos ; i++) {
            
            cantidad[i] = 0 ;
        }
        
        double numero ;
        int digito ;
        
        for (int i=0; i<n ; i++) {
            
            numero = vector[i];
            digito = 0;
            
        while (numero >= 1)  {
            
            numero = numero / 10;
            digito++;
        }
            cantidad[digito-1]++;
        }
        for (int i = 0 ; i < digitos; i++) {
            
            System.out.println("Cantidad de numeros de " + (i+1) + " digitos: " + cantidad[i]);
        }
        
    }
        
        
    
}