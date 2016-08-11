class Exercicio6 {
	public static void main (String [] args){

		int i, numAtual = 1, numAnterior = 0, aux;

		System.out.println(" Sequencia de Fibonacci:");

		System.out.print(numAnterior + " , " +  numAtual);

		while (numAtual < 100){

			aux = numAtual;
			numAtual += numAnterior;
			numAnterior = aux;
			
			System.out.print (" , " +  numAtual);
					
		}
		System.out.println("");
	}

}
