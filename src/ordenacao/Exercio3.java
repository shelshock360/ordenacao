package ordenacao;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Exercio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] vetor = new int[6];

        int aux;
        
        for (int i = 0; i < 6; i++) {

            System.out.println("digite numero");
            vetor[i] = entrada.nextInt();
            
          

        }
        System.out.println("ordenação normal");        
            System.out.println(Arrays.toString(vetor));
        
        System.out.println("metodo bolha");
        
               for (int j = 0; j <vetor.length; j++) {
           
            for (int x = 0; x < vetor.length -1; x++) {
              
                if(vetor[x] > vetor[x+1]){
                    
                    aux=vetor [x];
                    vetor[x]=vetor[x+1];
                    vetor[x+1]=aux;
                }
            }
        }
        
               System.out.println(Arrays.toString(vetor));
    }

}
