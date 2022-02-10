package listas;

public class SelectionSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vetor = {3,6,8,1,4,9,0};
		
		int posicao_menor, aux;
		System.out.println("-------------- SELECTION SORT --------------");
		System.out.println("-Desordenado");
		for(int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + " ");
		}
		
		for(int i = 0; i < vetor.length; i++) {
			posicao_menor = i;
			for(int j = i+1; j <vetor.length; j++) {

				
				if (vetor[j] < vetor[posicao_menor]) { // se o numero for menor que na posição seguinte
					
					posicao_menor = j; // troca sua posição, ordenando
					
				};
			};
			aux = vetor[posicao_menor];
			vetor[posicao_menor] = vetor[i];
			vetor[i] = aux;
		};
		
		System.out.println("\n\n-Ordenado ");
		for(int i =0; i < vetor.length; i++ ) {
			System.out.print(vetor[i] + " ");
		}
	
	}
}
