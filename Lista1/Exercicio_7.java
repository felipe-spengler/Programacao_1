import java.util.Scanner;
class Exercicio7{

	public static void main (String [] args){
		
		Scanner le = new Scanner(System.in);

		int x, numAtual = 1, numAnterior = 0, aux;

		x = le.nextInt();

		System.out.print(x + " > ");

		do{
			if (x % 2 == 0)
				x /= 2;
			else
				x = 3 * x + 1;
			// ver se e ultima execucao > colocar \n
			System.out.print(x);
			System.out.print((x == 1)? "\n" : " > " );
		}while (x != 1);
		
	}

}
