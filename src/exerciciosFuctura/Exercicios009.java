package exerciciosFuctura;

import java.util.Scanner;

public class Exercicios009 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double altura = 0;
		double largura = 0;
		
		System.out.println("=======================================");
        System.out.println("            CÁLCULO DE TINTA            ");
        System.out.println("=======================================\n");
        
        while(true) {
        	System.out.println("Digite a altura em metros da parede : ");
        	if(scanner.hasNextDouble()) {
        		altura = scanner.nextDouble();
        		if( altura>=0) {
        			break;
        		} else {
        			System.out.println("Erro: o valor informado deve ser positivo.");
        		}
        	} else {
        		System.out.println("Erro: Valor inválido, digite um número.");
        		scanner.next();
        	}
        }
        while(true) {
        	System.out.println("Digite a largura em metros da parede: ");
        	if(scanner.hasNextDouble()) {
        	largura = scanner.nextDouble();
        		if (largura>=0) {
        			break;
        		} else {
        			System.out.println("Erro: o valor informado deve ser positivo.");
        		}
        	} else {
        		System.out.println("Erro: Valor inválido, digite um número.");
        		scanner.next();
        	}
        }
        double area = altura*largura;
        
        double quantidadeDeTinta = area/2;
        
        System.out.println("=======================================");
        System.out.println("               RESULTADO               ");
        System.out.println("=======================================\n");
        System.out.println("A altura da parede é de: "+altura+" metros.");
        System.out.println("A largura da parede é de: "+largura+" metros.");
        System.out.printf("A área da parede é de: %.2f m²%n",area);
        System.out.println("Serão necessários "+quantidadeDeTinta+" Litros de tinta.");
		scanner.close();
        }
        }
