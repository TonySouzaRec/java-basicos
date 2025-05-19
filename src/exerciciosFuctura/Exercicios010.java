package exerciciosFuctura;

import java.util.Scanner;

public class Exercicios010 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	double precoAVista = 0;
	int parcelas = 0;
	
	System.out.println("========================================");
	System.out.println("         SIMULADOR DE PARCELAMENTO      ");
	System.out.println("========================================\n");
	
	while(true) {
		System.out.println("Digite o preço à vista do produto (R$): ");
		if(scanner.hasNextDouble()) {
			precoAVista = scanner.nextDouble();
			if(precoAVista>=0) {
				break;
			} else {
				System.out.println("Erro: o valor informado deve ser positivo.");
			}
		} else {
			System.out.println("Valor inválido, digite um número.");
			scanner.next();
		}	
	}
	
	while(true) {
		System.out.println("Digite o número de parcelas: ");
		if(scanner.hasNextInt()) {
			parcelas = scanner.nextInt();
			if(parcelas>0) {
				break;
			} else {
				System.out.println("Erro: o valor informado deve ser positivo.");
			}
		} else {
			System.out.println("Valor inválido, digite um número");
			scanner.next();
		}
	}
	double taxaJuros = 0.02;
	double juros = precoAVista * taxaJuros * parcelas;
	double precoParcelado = (precoAVista+juros)/parcelas;
	
	System.out.printf("O preço à vista do produto é de: R$ %.2f%n", precoAVista);
	System.out.printf("A taxa de juros é de %.2f%%%n", taxaJuros*100);
	System.out.printf("Você vai pagar %dx%.2f, total de R$ %.2f%n", parcelas, precoParcelado, precoParcelado*parcelas);

    scanner.close();
	}

}
