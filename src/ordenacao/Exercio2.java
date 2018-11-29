
package ordenacao;

import java.util.Arrays;

/**
 *
 * @author ASUS
 */
public class Exercio2 {

    
    /*
    nesse caso especifico seria busca binaria  que parte do presuposto que o vetor
    ja esta ordenado como é nesse caso [1] [5] [10] [90] [1500] ele vai fazer
    sucessivas divisoes do espaço de busca comparando o elemento buscado com a media;
    ou seja o elemento do meio do vetor abaixo se encontra um exemplo de como tudo isso acontece.
    */
    
    
    
public static int buscaBinaria(int[] vetor, int valor){
		int inicio = 0;
		int fim = vetor.length-1;
		
		while(inicio <= fim){
			int media = (inicio+fim)/2;
			
			if(vetor[media] == valor){
                            
                            
				return media;
			}
			
			if(valor > vetor[media]){
                            
				inicio = media+1;
                                
                        
                               
			} else {
                            
				fim = media-1;
                               
			}
		}
		return -1;
	}
    
   
    
    public static void main(String[] args) {
       
       
          int[] vetor = {1, 5, 10, 90, 1500};
          int mostrar=buscaBinaria(vetor,0);
         
                 
             
          
            
        }
        
        
        
    }
    

