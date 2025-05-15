package exerciciosFuctura;

	import java.util.Scanner;
	
public class Exercicio002 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do Produto 1: ");
		
		Double preço1 = (double) scanner.nextDouble();
		
		System.out.println("Digite o valor do Produto 2: ");
		
		Double preço2 = (double) scanner.nextDouble();
		
		Double soma = preço1 + preço2;
		
		System.out.println("Valor total da compra: R$ "+soma);
		
		scanner.close();
	}

}
