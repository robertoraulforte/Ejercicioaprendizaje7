/* Ejercicio extra 2
 *Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada 
una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C, C
tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores 
iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar
 */
package ejercicioextra2;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioextra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int A;
        int B;
        int C;
        int D;
        
        
        System.out.println("Ingrese un valor para A ");
        
        A = leer.nextInt(); 
        
        
        System.out.println("Ingrese un valor para B ");
        
        B = leer.nextInt();
          
        
        System.out.println("Ingrese un valor para C ");
        
        C = leer.nextInt() ;
        
        
        System.out.println("Ingrese un valor para D ");
    
       
        D = leer.nextInt() ;
        
        B = C;
        C = A;
        A = D;
        D = B;
        
        System.out.println("El Valor de A es :" + A);
        
        System.out.println("El valor de B es :" + B);
        
        System.out.println("El valor de C es " + C);
        
        System.out.println("El valor de D es " + D);
    }
    
    
    
}
