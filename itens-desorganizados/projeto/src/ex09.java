import java.util.Scanner;

public class ex09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double TAXA_DOLAR = 5.30;
        final double TAXA_EURO = 6.20;

        System.out.println("1. Real para Dólar");
        System.out.println("2. Dólar para Real");
        System.out.println("3. Real para Euro");
        System.out.println("4. Euro para Real");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o valor: ");
        double valor = scanner.nextDouble();
        double resultado = 0;

        switch (opcao) {
            case 1:
                resultado = valor / TAXA_DOLAR;
                System.out.printf("R$%.2f = $%.2f%n", valor, resultado);
                break;
            case 2:
                resultado = valor * TAXA_DOLAR;
                System.out.printf("$%.2f = R$%.2f%n", valor, resultado);
                break;
            case 3:
                resultado = valor / TAXA_EURO;
                System.out.printf("R$%.2f = €%.2f%n", valor, resultado);
                break;
            case 4:
                resultado = valor * TAXA_EURO;
                System.out.printf("€%.2f = R$%.2f%n", valor, resultado);
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }
}
