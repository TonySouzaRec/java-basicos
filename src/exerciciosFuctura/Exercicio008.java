package exerciciosFuctura;

import java.util.Scanner;

public class Exercicio008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cotacaoDoDolar = 0.0;
        double valorReais = 0.0;

        System.out.println("=======================================");
        System.out.println("      CONVERSOR DE REAL PARA DÓLAR     ");
        System.out.println("=======================================\n");

        // Entrada e validação da cotação do dólar
        while (true) {
            System.out.print("Digite a cotação atual do dólar: ");
            if (scanner.hasNextDouble()) {
                cotacaoDoDolar = scanner.nextDouble();
                if (cotacaoDoDolar > 0) {
                    break;
                } else {
                    System.out.println("Erro: A cotação deve ser maior que zero.\n");
                }
            } else {
                System.out.println("Erro: Valor inválido. Digite um número.\n");
                scanner.next(); // descarta entrada inválida
            }
        }

        // Entrada e validação do valor em reais
        while (true) {
            System.out.print("Digite o valor em reais (R$) que deseja converter: ");
            if (scanner.hasNextDouble()) {
                valorReais = scanner.nextDouble();
                if (valorReais >= 0) {
                    break;
                } else {
                    System.out.println("Erro: O valor em reais não pode ser negativo.\n");
                }
            } else {
                System.out.println("Erro: Valor inválido. Digite um número.\n");
                scanner.next(); // descarta entrada inválida
            }
        }

        // Cálculo da conversão
        double valorConvertido = valorReais / cotacaoDoDolar;

        // Exibição dos resultados
        System.out.println("\n=======================================");
        System.out.println("               RESULTADO               ");
        System.out.println("=======================================");
        System.out.println("Cotação atual do dólar:        R$ " + String.format("%.2f", cotacaoDoDolar));
        System.out.println("Valor informado em reais:      R$ " + String.format("%.2f", valorReais));
        System.out.println("Valor convertido em dólares:   US$ " + String.format("%.2f", valorConvertido));
        System.out.println("=======================================\n");

        scanner.close();
    }
}
