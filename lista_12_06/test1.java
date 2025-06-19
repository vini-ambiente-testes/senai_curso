import java.util.Scanner;

public class AppCalculadora {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Calculadora Básica");

        System.out.print("Digite o 1° número: ");
        double primeiro = leitura.nextDouble();

        System.out.print("Digite o 2° número: ");
        double segundo = leitura.nextDouble();

        System.out.print("Digite a operação (+, -, *, /): ");
        String simbolo = leitura.next();

        leitura.close();

        Calculadora calc = new Calculadora(primeiro, segundo, simbolo);
        calc.calcular();
    }
}