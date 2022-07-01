/*
Ejercicio 8
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se 
pedirá de nuevo hasta que la nota sea correcta.

 */
package ejerciciointro8;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejerciciointro8 {

    /**
     * @param args the command line arguments
     * @return 
     * 
     * 
     */
    
    public static void main(String[] args)     {

        int retorno = funcion();
    }
            
            
            
    public static int funcion() {
        
         Scanner s = new Scanner(System.in);
    int numero;
    while (true) {
             boolean mensaje = false;
        System.out.println(mensaje);
        if (s.hasNextInt()) {
            numero = s.nextInt();
                 int maximo = 10;
                 int minimo = 0;
            if (numero >= minimo && numero <= maximo) {
                return numero;
            } else {
                System.out.println("Número fuera de rango. Intente de nuevo");
            }
        } else {
            s.next();
        
        
        
        }
    }
    
    }
        
    }
    


