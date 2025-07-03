import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Usuario logado? (SIM/NÃO): ");
        String logado = leitura.nextLine();

        boolean estalogado = logado.equalsIgnoreCase("sim");

        if (!estalogado) {
            System.out.println("Acesso negado.");
        } else {
            System.out.println("Bem vindo.");
        }
    }
}
