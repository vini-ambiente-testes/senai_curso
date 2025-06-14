import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = leitura.nextInt();

        if (idade >= 16) {
            System.out.println("Você é uma criança.");
        } else if (idade <= 17) {
            System.out.println("Você é um adolescente.");
        } else if (idade <= 59) {
            System.out.println("Você é um adulto.");
        } else {S
            System.out.println("Você é um idoso.");
        }


    }
}
