package exerciciosFuctura;

import java.util.Scanner;

public class Exercicio006 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double valorDoLitroDeAgua = 0.02;
		
		System.out.println("=== Cálculo do Valor da Conta de Água ===");
		
		System.out.println("Digite a quantidade de litros de água consumidos no mês:");
		double aguaConsumida = scanner.nextDouble();
		
		if(aguaConsumida <= 0) {
			System.out.println("Erro: o valor informado deve ser positivo.");
		} else {
		double valorContaDeAgua = aguaConsumida * valorDoLitroDeAgua;
		
		System.out.println("\n===== Resultado =====");
		System.out.println("Quantidade de água consumida no mês: " + aguaConsumida + " Litros");
		System.out.println("Valor do litro de água: R$ "+ valorDoLitroDeAgua);
		System.out.println("O valor total da conta de água é de: R$ " + String.format("%.2f", valorContaDeAgua));
		
		scanner.close();
		}
	}

}
