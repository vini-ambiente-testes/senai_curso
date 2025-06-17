import java.util.Scanner;
import java.util.Arrays;

public class ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        System.out.println("\nNúmeros ordenados:");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}
