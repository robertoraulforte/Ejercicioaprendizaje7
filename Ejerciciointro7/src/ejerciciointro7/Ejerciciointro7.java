/*
 EJERCICIO 7
Considera que estás desarrollando una web para una empresa que fabrica motores (suponemos 
que se trata del tipo de motor de una bomba para mover fluidos). Definir una variable tipoMotor y 
permitir que el usuario ingrese un valor entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es una bomba de agua”. 
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es una bomba de 
gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es una bomba de 
hormigón”. 
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es una bomba de pasta 
alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje “No existe un valor 
válido para tipo de bomba
 */
package ejerciciointro7;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejerciciointro7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in) ;
       
       int tipomotor;
       
        System.out.println("Ingrese una opcion de tipo de motor");
        tipomotor = leer.nextInt();
        
        switch (tipomotor) {
            
            case 1:
                System.out.println("La bomba es una bomba de agua ");
       
            break;
            case 2 :
                System.out.println("La bomba es una bomba de \n" +
"gasolina”.");
            break;
            
            case 3:
                System.out.println("La bomba es una bomba de \n" +
"hormigón”. ");
            break;
            case 4 :
                System.out.println("La bomba es una bomba de pasta \n" +
"alimenticia");
            break;
            default:
                System.out.println("No existe un valor \n" +
"válido para tipo de bomba");
        
        
        }

    }
    
        
        
    }
    

