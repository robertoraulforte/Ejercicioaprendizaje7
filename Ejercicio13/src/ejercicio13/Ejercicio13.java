/*EJERCICIO 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y 
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante. 
 *
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese la cantidad de personas en el equipo: ");
       int x = leer.nextInt();
       String [] equipo = new String [x];
        for (int i = 0; i < x; i++) {
            System.out.print("Ingrese el nombre del participante " + (i+1) + ": ");
            equipo[i] = leer.next();
        }
        System.out.println("El equipo esta formado por: ");
        for (int j = 0; j < x; j++) {
            System.out.println(j + "- " + equipo[j]);
                      
        }
    }
    
}

        
    }
    
}
