/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioaprendizaje11segundaopcion;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioaprendizaje11segundaopcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 2 numeros enteros positivos");
        int numero1 = scanner.nextInt();
        int numero2 = scanner.nextInt();
        int opcion;

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción");
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (numero1 + numero2));
                    break;
                case 2:
                    System.out.println("La resta es: " + (numero1 - numero2));
                    break;
                case 3:
                    System.out.println("La multiplicacion es: " + (numero1 * numero2));
                    break;
                case 4:
                    System.out.println("La division es: " + (numero1 / numero2));
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir del programa (S/N)?");
                    String confirmacion = scanner.next();
                    if (confirmacion.equals("S")) {
                        System.out.println("Saliendo del programa");
                        break;
                    } else {
                        System.out.println("Vuelva a intentarlo");
                    }
                default:
                    System.out.println("Opcion no valida");
                    opcion = 0;
                    break;
            }
        } while (opcion != 5);

        scanner.close();
        
    }
}
        
        
        
    }
    
}
