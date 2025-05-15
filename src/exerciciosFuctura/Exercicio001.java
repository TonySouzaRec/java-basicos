package exerciciosFuctura;

	import java.util.Scanner;

public class Exercicio001 {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite seu nome: ");
	        
	        String nome = scanner.nextLine();

	        System.out.println("Olá, " + nome + "! Bem-vindo ao nosso programa!");

	        scanner.close();
	    }
	}
