/*Ejercicio 19
 Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una 
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de 
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se 
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package ejercicioaprendizaje19;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioaprendizaje19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Scanner scanner = new Scanner(System.in) ;
      
        System.out.println("Ingrese el tamaño del vector");
        
        int n = scanner.nextInt() ;
        scanner.close() ;
        
        int digitos = 5;
        int[] vector = new int[n] ;
        
        for (int i=0 ; i< n ; i++)     {
            
            vector [i] = (int) (Math.random() * Math.pow(10,digitos));
            
              
        }

        for (int i= 0 ; i < n ; i++)      {
 
             System.out.println(vector [i]);
             
        
    }
    
        int[] cantidad = new int[digitos];
        
        for (int i=0 ; i < digitos ; i++)    {
            
            
        }

        double numero ;
        int digito ;
        
        for (int i=0 ; i < n ; i++)         {

        numero = vector[i] ;
        digito = 0 ;
        
        while (numero >= 1)           {
         numero = numero / 10 ;
         digito ++;
        }
        
        cantidad[digito -1]++ ;
        }
         
    for (int i =0 ; i < digitos ; i++)    {
        
        System.out.println("Cantidad de numeros de " + (i + 1) " digitos : " + cantidad[i]);
            
    }
        
        
}
