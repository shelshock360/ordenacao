package ordenacao;

import java.util.Arrays;

public class Exercio8 {

    public static  int buscaSequencial(int vetor[],int tamanho,int valor){
        int i=0;
        
        while ((i<tamanho)&& (vetor[i])!=valor) {            
            
            i++;
        }
        if((tamanho==0)||(i>=tamanho)){
     
            i=-1;
        }
        
        return i;
    }
    public static void main(String[] args) {

        int vetor[] = new int[10];
        int tamanho=10;
        vetor[0] = 12;
        vetor[1] = 11;
        vetor[2] = 78;
        vetor[3] = 2;
        vetor[4] = 100;
        vetor[5]=90;
        vetor[6]=91;
        vetor[7]=50;
        vetor[8]=20;
        vetor[9]=32;
        
        int posicao=buscaSequencial(vetor, tamanho, 11);
        
        System.out.println("o valor "+vetor[posicao]+" se encontra na "+posicao);
        
    }

}
