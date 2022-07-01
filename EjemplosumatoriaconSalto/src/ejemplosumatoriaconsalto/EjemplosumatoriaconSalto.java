/*
ESTE BUCLE ES COMO HACER-MIENTRAS.
 */
package ejemplosumatoriaconsalto;



/**
 *
 * @author rober
 */
public class EjemplosumatoriaconSalto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num;
        
        Scanner leer;
        
        
        leer = new Scanner(System.in).useDelimiter("\n");
        
        do   {
            System.out.println("ingrese un numero entero positivo");
            num = leer.nextInt();
            
        if (num>1000) {
            
            System.out.println("Este programa podria tardar, esta seguro? (s/n");
            String confirma = leer.next();
        
            
        if (confirma.equals("s")) {
            
        break;
        }

    }   while (num<= 0 || num > 1000)

    
        
       int j, suma;
    
       for(int i=1 ; i<=num ; i++)  {
           
           if (i%2 !=0)

               continue;
           
           suma =0 ;
           j=1;
           
           while (j<= i) {
               suma += j;
               j++;
           }
           System.out.println("la suma de los " + i + " numero naturales es " + suma);
           
               }
    
}
