/* Ejercicio 10 : Bucles y sentencias de salto, break y continue
 Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite 
números al usuario hasta que la suma de los números introducidos supere el límite inicial. 
 */
package ejercicioaprendizaje10;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioaprendizaje10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
             int num;
        int suma;
        int num2;
        suma=0;
        do{
        System.out.println("Ingrese un valor limite positivo");
        num=leer.nextInt();
        }
        while(num<=0);
        
        do{
            System.out.println("Ingrese un numero entero");    
            num2=leer.nextInt();
            suma=suma+num2;
            System.out.println("La suma es: "+suma);
        }
        while(suma<num);
    
}
}

        
        
        
        
        
    }
    
}
