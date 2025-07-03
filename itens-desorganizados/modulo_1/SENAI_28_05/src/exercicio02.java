import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Você tem ingresso? (SIM/NÃO): ");
        String temIngresso = leitura.nextLine();

        System.out.print("Você está com pulseira VIP? (SIM/NÃO): ");
        String temPulseira = leitura.nextLine();

        boolean ingressoValido = temIngresso.equalsIgnoreCase("sim");
        boolean pulseiraValida = temPulseira.equalsIgnoreCase("sim");

        if (ingressoValido && pulseiraValida) {
            System.out.println("Entrada liberada para área VIP.");
        } else {
            System.out.println("Você não pode entrar na área VIP.");
        }
    }
}
