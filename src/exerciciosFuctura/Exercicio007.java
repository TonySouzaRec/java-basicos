package exerciciosFuctura;

import java.util.Scanner;

public class Exercicio007 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Calculadora de Frete ===");
        
        double valorDoKG = 5;
        
        System.out.println("Digite o peso da encomenda (kg):");
        double pesoEncomenda = scanner.nextDouble();

        // Validação do peso da encomenda: não pode ser negativo ou zero
        // Pendencia: Necessaria a verificação caso o usuário insira algo diferente de numeros;
        if (pesoEncomenda <= 0) {
            System.out.println("Erro: O peso informado deve ser positivo e maior que zero.");
        } else {
            double valorDoFrete = pesoEncomenda * valorDoKG;
            
            System.out.println("=== Resultado ===");
            // Aqui, estamos exibindo o peso da encomenda, o valor do frete por KG e o valor total do frete, tudo formatado com 2 casas decimais
            System.out.println("Peso da encomenda: " + pesoEncomenda + " KG");
            System.out.println("Valor do frete por KG: R$ " + String.format("%.2f", valorDoKG));  // Formatação para 2 casas decimais
            System.out.println("O VALOR TOTAL DO FRETE É DE: R$ " + String.format("%.2f", valorDoFrete));  // Formatação do valor final do frete
            
            scanner.close();
        }
    }
}
