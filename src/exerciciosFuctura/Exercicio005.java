package exerciciosFuctura;

import java.util.Scanner;

public class Exercicio005 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Cálculo de Empréstimo com Juros Simples ===");
        
        System.out.println("Digite o valor do empréstimo:");
        double valorEmprestimo = scanner.nextDouble();
        
        System.out.println("Digite a taxa de juros mensal do empréstimo (%):");
        double taxaDeJuros = scanner.nextDouble();
        
        System.out.println("Digite o número de meses que deseja pagar o empréstimo:");
        int tempo = scanner.nextInt();
        
        // Valida se algum valor está incorreto (menor ou igual a zero)
        if (valorEmprestimo <= 0 || taxaDeJuros < 0 || tempo <= 0) {
            // Caso algum valor seja inválido, exibe uma mensagem de erro
            System.out.println("Erro: todos os valores devem ser positivos.");
        } else {
            // Realiza o cálculo dos juros simples
            // Fórmula: Juros = Valor Emprestado * Taxa de Juros * Tempo (em meses)
            double juros = valorEmprestimo * (taxaDeJuros / 100) * tempo;
            
            // Calcula o valor total a ser pago, incluindo os juros
            double valorFinal = valorEmprestimo + juros;
            
            // Calcula o valor de cada parcela mensal
            double parcelaMensal = valorFinal / tempo;
            
            // Exibe os resultados com 2 casas decimais
            System.out.println("\n===== Resultado =====");
            System.out.println("Juros totais: " + String.format("%.2f", juros)); // Exibe os juros totais
            System.out.println("Valor final a pagar: " + String.format("%.2f", valorFinal)); // Exibe o valor total com juros
            System.out.println("Parcela mensal: " + String.format("%.2f", parcelaMensal)); // Exibe o valor de cada parcela mensal
        }
        
        // Fecha o scanner para liberar o recurso utilizado
        scanner.close();
    }
}
