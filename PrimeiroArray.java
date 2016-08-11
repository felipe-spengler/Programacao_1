import java.util.Scanner;
// DECLARACAO E USO DE VETORES
public class PrimeiroArray {
	public static void main (String [] args){
		int [] vetor;
		int n, i, maior = 0, menor = 0, soma = 0;
		Scanner le = new Scanner (System.in);
		
		System.out.println(" Digite n:");
		n = le.nextInt();

		vetor = new int[n];
		System.out.println("Entre com " + n + " valores: ");
		for (i = 0; i < n; i++){
			
			vetor[i] = le.nextInt();
			if (i == 0){
				menor = maior = vetor[i];
				//maior = vetor[i];
			}
			
			if (vetor[i] > maior) maior = vetor[i];
			if (vetor[i] < menor) menor = vetor[i];
			
			soma += vetor[i];
		}
		System.out.println("Maior Valor = " + maior);
		System.out.println("Menor Valor = " + menor);
		System.out.println("Soma dos Valores = " + soma);
		
	}
}
