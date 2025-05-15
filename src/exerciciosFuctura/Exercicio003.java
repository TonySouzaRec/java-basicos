package exerciciosFuctura;

	import java.util.Scanner;
	
public class Exercicio003 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a distância percorrida pelo carro (em km):");
		double distanciakm = scanner.nextInt();
		
		System.out.println("Digite o tempo gasto (em horas):");
		double tempohoras = scanner.nextInt();
		
		double temposegundos = tempohoras * 3600;
		double distanciametros = distanciakm * 1000;
		
		double velocidademedia = distanciametros/temposegundos;
		
		// String.format("%.2f", velocidadeMedia) formata o valor para ter apenas 2 casas decimais,
		// transformando o número em uma string antes de concatenar com o texto final.
		// Exemplo: 16.6666 vira "16.67"
		
		System.out.println("A velocidade média do carro foi de: "+ String.format("%.2f", velocidademedia) + " m/s");
						
		scanner.close();
	}

}
