package exerciciosFuctura;

import java.util.Scanner;

public class Exercicio004 {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Digite o número de horas trabalhadas:");
	int horasTrabalhadas = scanner.nextInt();

	System.out.println("Digite o valor da hora de trabalho:");
	double valorHoraTrabalhada = scanner.nextDouble();
	
	double salarioBruto = horasTrabalhadas * valorHoraTrabalhada;
	
	System.out.println("Salário Bruto: R$ "+ salarioBruto);
	
		scanner.close();
	}

}
