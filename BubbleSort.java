package listas;

public class BubbleSort {
	public static void main(String[] args) {
		int[] vetor = {3,6,8,1,4,9,0};
		int aux = 0;
		int i = 0;

		System.out.println("Desordenado: ");
		for(i = 0; i < vetor.length; i++){
			System.out.print(" "+vetor[i]);
		}
		System.out.println(" ");
		System.out.println(" ");

		for(i = 0; i < vetor.length -1; i++){
			for(int j = 0; j < vetor.length -1; j++){ // "vetor.lenght -1" pois quando chega no index 7, ele iria tentar puxar um numero que ultrapassad uma vez que a lista vai do 0 ao 6
				if(vetor[j] > vetor[j + 1]){ // se o vetor j=0 na posição 0 for maior que o vetor na posição +1
					aux = vetor[j];
					vetor[j] = vetor[j+1]; // troca de posição
					vetor[j+1] = aux;
				}
			}
		}
		System.out.println("Organizado:");
		for(i = 0; i < vetor.length; i++){
			System.out.print(" "+vetor[i]);
		}
	}
}
