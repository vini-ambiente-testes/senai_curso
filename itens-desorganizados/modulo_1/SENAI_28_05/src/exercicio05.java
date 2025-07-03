import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Qual sua idade? ");
        int idade = leitura.nextInt();
        leitura.nextLine(); // limpa o buffer

        System.out.print("Está acompanhado de um responsável? (SIM/NÃO): ");
        String resposta = leitura.nextLine();

        boolean acompanhado = resposta.equalsIgnoreCase("sim");

        if (idade >= 16 || acompanhado) {
            System.out.println("Entrada permitida no cinema.");
        } else {
            System.out.println("Entrada negada. Você precisa ter 16 anos ou estar acompanhado.");
        }
    }
}
