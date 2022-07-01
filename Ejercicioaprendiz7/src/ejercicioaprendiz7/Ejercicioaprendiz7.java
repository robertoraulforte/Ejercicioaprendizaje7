/*Ejercicio 7

Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa 
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar 
la función equals() en Java.
 */
package ejercicioaprendiz7;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioaprendiz7 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        
     String Frase;
     
     System.out.println("Ingrese una frase");
       Frase = leer.nextLine();
   
        
        
        if(Frase.equals("eureka")){
            
            System.out.println("Es correcto");
            
            
        }else{
            
            System.out.println("Es incorrecto");
            
     
        
        
    }
    
}
