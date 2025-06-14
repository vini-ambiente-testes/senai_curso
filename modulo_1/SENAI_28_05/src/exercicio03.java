import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("Você entregou o trabalho? (SIM/NÃO): ");
        String entregouTrabalho = leitura.nextLine();

        System.out.print("Você participou da atividade em aula? (SIM/NÃO): ");
        String participouAula = leitura.nextLine();

        boolean trabalho = entregouTrabalho.equalsIgnoreCase("sim");
        boolean participacao = participouAula.equalsIgnoreCase("sim");

        if (trabalho || participacao) {
            System.out.println("Presença registrada.");
        } else {
            System.out.println("Falta registrada.");
        }
    }
}
