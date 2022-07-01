/* Ejercicio extra 5
 *Una obra social tiene tres clases de socios: 
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
todos los tipos de tratamientos. 
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
los mismos tratamientos que los socios del tipo A. 
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
tratamientos. 
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
real que represente el costo del tratamiento (previo al descuento) y determine el 
importe en efectivo a pagar por dicho socio
 */
package ejercicioextra5;



import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioextra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
     Character clase;
     
     do {
     
         System.out.println("Ingrese una letra que representa la clase de un socio :");

         clase = leer.nextLine().charAt(0);    
        
}
      
     while (clase.equals("A") && clase.equals("B") && clase.equals("C"));
     
        System.out.println("Ingrese costo del tratamiento (previo al descuento)");
        
        double costo = leer.nextDouble();
        
        
        
        switch  (clase) {
        
          case "A":
        System.out.println("El importe a pagar por el socio A es " + (costo*.5));
        break;
          case "B":
        System.out.println("El importe a pagar por el socio B es " + (costo*.35));
        break;
        
          default:
          case "C":
        System.out.println("El importe a pagar por el socio C es " + costo);
        
     
     
     
    }
    
}

    
    }
