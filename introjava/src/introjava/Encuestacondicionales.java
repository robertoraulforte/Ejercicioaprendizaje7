/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package introjava;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Encuestacondicionales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opinion;
        Scanner leer = new Scanner(System.in);
        System.out.println("Clasifique la pelicula de 1 a 5 estrellas");
        opinion = leer.nextInt();
        
        if (opinion>= 1 && opinion <=5) {
            
            switch (opinion) {
                
                case 1:
                case 2:
                    System.out.println("nos sentimos apenados que no te gusto");
                    break;
                case 3:
                    System.out.println("calificaste como buena");
                    break;
                case 4:
                    System.out.println("calificaste como muy buena");
                    break;
                case 5 :
                    System.out.println("calificaste como excelente");
                    break;
                    
                    
            }
        }
    }
    
}  else if (opinion < 0){
   System.out.println("opinion negavita");
}  else if (opinion == 0)¨{
   System.out.println("el valor " + opinion + " no es valido y no se tomara en cuenta");
}  else {
   System.out.println("gran calificacion de la pelicula");
}
System.out.println("hasta la proxima");


}
