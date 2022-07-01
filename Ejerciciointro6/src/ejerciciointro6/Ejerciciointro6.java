/*
 Ejercicio 6
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o 
alguno de ellos es mayor a 25
 */
package ejerciciointro6;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejerciciointro6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        
        Scanner leer = new Scanner(System.in);
        int numero1 = 0;
        int numero2 = 0;
        
        do {

        System.out.println("Ingrese el primer numero");
    
        numero1 = leer.nextInt();
       
        
         
        System.out.println("Ingrese el segundo numero");
    
        numero2 = leer.nextInt();
        
        
        
        if(numero1 > 25 || numero2 > 25) {
            System.out.println("El primer numero y el segundo numero son mayores que 25");
        }
        
        
        }  while (numero1 <25 || numero2 <25)
         
         {System.out.println("El primer numero y el seguno numero son menores que 25");
         
         
         
    


    }


