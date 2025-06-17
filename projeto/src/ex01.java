import java.util.Scanner;
public class ex01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0;

        if (operacao == '+') {
            resultado = num1 + num2;
        } else if (operacao == '-') {
            resultado = num1 - num2;
        } else if (operacao == '*') {
            resultado = num1 * num2;
        } else if (operacao == '/') {
            if (num2 != 0) {
                resultado = num1 / num2;
            } else {
                System.out.println("Erro: divisão por zero!");
                return;
            }
        } else {
            System.out.println("Operação inválida!");
            return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
