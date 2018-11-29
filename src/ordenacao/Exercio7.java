package ordenacao;

import java.util.Arrays;
import java.util.Scanner;

public class Exercio7 {

    public static void ordenarBolha(int vetor[]) {
        Scanner entrada = new Scanner(System.in);

        int aux;
        for (int i = 0; i < 6; i++) {

            System.out.println("digite numero");
            vetor[i] = entrada.nextInt();

        }

        System.out.println("ordenação normal");

        System.out.println(Arrays.toString(vetor));
        System.out.println("ordenação metodo bolha");
        for (int i = 0; i < vetor.length; i++) {

            for (int k = 0; k < vetor.length - 1; k++) {

                if (vetor[k] > vetor[k + 1]) {

                    aux = vetor[k];
                    vetor[k] = vetor[k + 1];
                    vetor[k + 1] = aux;
                }
            }
        }

    }

    public static void ordenarInsercao(int[] vet) {

        Scanner Entrada = new Scanner(System.in);

      
        for (int i = 0; i < 6; i++) {

            System.out.println("digite numero");
            vet[i] = Entrada.nextInt();

        }
        
          System.out.println("ordenação normal");
          System.out.println(Arrays.toString(vet));
       
        System.out.println("ordenação metodo de inserção");
        for (int i = 1; i < vet.length; i++) {

            int aux = vet[i];
            int y = i;

            while ((y > 0) && (vet[y - 1] > aux)) {
                vet[y] = vet[y - 1];
                y -= 1;
            }
            vet[y] = aux;

        }

    }
    
      public static void ordenarSelecao(int[] n){
          Scanner Entrada = new Scanner(System.in);

      
        for (int i = 0; i < 6; i++) {

            System.out.println("digite numero");
            n[i] = Entrada.nextInt();

        }
        
         System.out.println("ordenação normal");
          System.out.println(Arrays.toString(n));
      
        System.out.println("ordenação por seleção");
        for (int i = 0; i < n.length; i++) {
            
            for (int x = 0; x < n.length; x++) {
                
                if(n[i]<n[x]){
                    
                    int aux= n[i];
                    n[i]=n[x];
                    n[x]=aux;
                    
                }
                
            }
            
        }
    

    }

    public static void main(String[] args) {
        int[] vetor = new int[6];
        ordenarBolha(vetor);
        System.out.println(Arrays.toString(vetor));
        int[] vet = new int[6];
        ordenarInsercao(vet);
        System.out.println(Arrays.toString(vet));
           int[] n = new int[6];
           ordenarSelecao(n);
           System.out.println(Arrays.toString(n));

    }

}
