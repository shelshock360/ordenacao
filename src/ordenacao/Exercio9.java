package ordenacao;

import java.util.Arrays;
import java.util.Scanner;

public class Exercio9 {

    public static void selecao(int[] vetor) {
        Scanner Entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {

            System.out.println("digite numero");
            vetor[i] = Entrada.nextInt();

        }

        System.out.println("ordenação normal");
        System.out.println(Arrays.toString(vetor));

        System.out.println("ordenação por seleção");
        for (int i = 0; i < vetor.length; i++) {

            for (int x = 0; x < vetor.length; x++) {

                if (vetor[i] < vetor[x]) {

                    int aux = vetor[i];
                    vetor[i] = vetor[x];
                    vetor[x] = aux;

                }

            }

        }
        
       
        

    }

    public static int buscaBinaria(int[] vetor, int valor) {

        int inicio = 0;
        int fim = vetor.length - 1;

        while (inicio <= fim) {
            int media = (inicio + fim) / 2;

            if (vetor[media] == valor) {

                return media;
            }

            if (valor > vetor[media]) {

                inicio = media + 1;

            } else {

                fim = media - 1;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
          Scanner Entrada = new Scanner(System.in);   
         int valor;
        int[] vetor = new int[10];
        selecao(vetor);
        System.out.println(Arrays.toString(vetor));

        System.out.println("digite um numero");
        valor=Entrada.nextInt();
        int posicao = buscaBinaria(vetor,valor);
        
      System.out.println("o valor "+vetor[posicao]+" se encontra na "+posicao);
        

    }
}
