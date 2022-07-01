/* Ejercicio extra 1
 *Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el 
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas
 */
package ejercicioextra1;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicioextra1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int minutos;
        int horas;
        int dias;
        
        System.out.println("Ingrese el tiempo en minutos ");
        
        minutos = leer.nextInt();
        
        dias = minutos / (60*24)
                
        horas = minutos % (60*24) / 60;
        
        minutos = minutos - (dias * 60 * 24)- (horas * 60);
        
        System.out.println("Transcurrieron " + dias + " dias y "+ horas y "+ minutos+ " minutos"); horas" );
        
       
        
        
    }
    
}
