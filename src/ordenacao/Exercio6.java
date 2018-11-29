
package ordenacao;

import java.util.Arrays;
import java.util.Scanner;


public class Exercio6 {

  
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
 
         int[] vetor = new int[6];
            
            for (int i = 0; i < 6; i++) {
            
           System.out.println("digite numero");
            vetor[i] = entrada.nextInt();
        }
            
            
        for (int i = 0; i < vetor.length; i++) {
           
            System.out.println(vetor[i]); 
        }
              System.out.println("ordenação normal");
          System.out.println(Arrays.toString(vetor));
          System.out.println("ordenação metodo de seleçao");
          
                  for (int i = 0; i < vetor.length; i++) {
            
            for (int j = 0; j < vetor.length; j++) {
                
                if(vetor[i]<vetor[j]){
                    
                    int aux= vetor[i];
                    vetor[i]=vetor[j];
                    vetor[j]=aux;
                    
                }
  
            }
            
       
            
        }
                 System.out.println(Arrays.toString(vetor));
          
    }
    
}
