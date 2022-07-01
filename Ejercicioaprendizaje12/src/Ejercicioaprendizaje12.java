
import java.util.Scanner;

/*Ejercicio 12
 
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals().

package ejercicioaprendizaje12;

/**
 *
 * @author rober
 */

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese una cadena : ");
        
        String cadena = cadena.length();
        
        int largo = cadena.length();
        
        if (largo <= 5)  {

        if (cadena.startsWith("X")) && cadena.endsWith("O")  {

        System.out.println("La cadena es correcta");

        } else {

        System.out.println("La cadena es incorrecta");

}


}

else {
      System.out.println("La cadena es muy larga");

        
        
    }
    
}
