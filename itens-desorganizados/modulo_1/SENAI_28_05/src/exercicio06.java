import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe seu peso (em kg): ");
        double peso = leitura.nextDouble();

        System.out.print("Informe sua altura (em metros): ");
        double altura = leitura.nextDouble();

        double imc = peso / (altura * altura);

        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc < 18.5) {
            System.out.println("Classificação: Abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("Classificação: Peso normal.");
        } else if (imc < 30) {
            System.out.println("Classificação: Sobrepeso.");
        } else {
            System.out.println("Classificação: Obesidade.");
        }
    }
}
