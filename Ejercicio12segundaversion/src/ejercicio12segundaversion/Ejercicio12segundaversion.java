/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12segundaversion;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class Ejercicio12segundaversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese una frase de 5 caracteres");
        String frase = Leer.next().toLowerCase();
        
       // if (frase.length()==5 && frase.startsWith("x") && frase.endsWith("o"))
       
       if  (frase.substring(0,1).equals("x") && frase.substring(4,5).equals("o") && frase.length()==5){                          
           System.out.println("Correcto");
           
       }
       else System.out.println("Incorrecto");

    }
}

        
    }
    
}
