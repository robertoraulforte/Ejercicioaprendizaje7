/*Ejercicio manos a la obra 9
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del 
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el 
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse. 
Nota: recordar el uso de la sentencia break

 */
package ejerciciointro9;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejerciciointro9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese 20 numeros enteros");
        int num = leer.nextInt();
        
        if  (num.equalsIgnoreCase("0"))  {

        System.out.println("Se capturo el numero 0");
    }   
        else {
            System.out.println("Siga ingresando numeros");
        }
}
