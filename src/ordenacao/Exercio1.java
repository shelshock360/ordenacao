package ordenacao;

import java.util.Arrays;

public class Exercio1 {

    public static void buble( int n[]) {
      
        int aux;
   
        System.out.println("ordenação normal");
        for (int i = 0; i < n.length; i++) {
            
            System.out.println(n[i]);
        }
        
        System.out.println("ordenação metodo bolha");
        for (int i = 0; i <n.length; i++) {
           
            for (int x = 0; x < n.length -1; x++) {
              
                if(n[x] > n[x+1]){
                    
                    aux=n [x];
                    n[x]=n[x+1];
                    n[x+1]=aux;
                }
            }
        }
        
       
    }

 
    public static void insertionSort(int[] vetor){
		
        System.out.println("ordenação normal");
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
            
        }
        System.out.println("ordenação metodo de inserção");
		for (int i = 1; i < vetor.length; i++){
			
			int aux = vetor[i];
			int j = i;
			
			while ((j > 0) && (vetor[j-1] > aux)){
				vetor[j] = vetor[j-1];
				j -= 1;
			}
			vetor[j] = aux;
                
		}
	
	}
    
    
    public static void selecao(int[] v){
         System.out.println("ordenação normal");
           for (int i = 0; i < v.length; i++) {
            System.out.println(v[i]);
            
        }
        
        System.out.println("ordenação por seleção");
        for (int i = 0; i < v.length; i++) {
            
            for (int j = 0; j < v.length; j++) {
                
                if(v[i]<v[j]){
                    
                    int aux= v[i];
                    v[i]=v[j];
                    v[j]=aux;
                    
                }
                
            }
            
        }
    

    }

    public static void main(String[] args) {
        
          int[] n = {90, 34, 97, 9, 32};
          buble(n);
           System.out.println(Arrays.toString(n)); 
           
        int[] vetor = {60,70,80,10};
       insertionSort(vetor); 
        System.out.println(Arrays.toString(vetor));
        
        
         int[] v = {92, 15, 10, 15,90};
         selecao(v);
         System.out.println(Arrays.toString(v));
        
       
     

    }

}


