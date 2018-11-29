
package ordenacao;

import java.util.Arrays;
import java.util.Scanner;


public class Exercio5 {

   
    public static void main(String[] args) {
        Scanner Entrada = new Scanner (System.in);
            int[] vet = new int[6];
            
            for (int i = 0; i < 6; i++) {
            
           System.out.println("digite numero");
            vet[i] = Entrada.nextInt();
        }
            
             System.out.println("ordenação normal");        
            System.out.println(Arrays.toString(vet));
            
            System.out.println("ordenação metodo incerção");
            for (int i = 1; i < vet.length; i++){
			
			int aux = vet[i];
			int y = i;
			
			while ((y > 0) && (vet[y-1] > aux)){
				vet[y] = vet[y-1];
				y -= 1;
			}
			vet[y] = aux;
                
                        
		}
            
            System.out.println(Arrays.toString(vet));
    }
    
}
