import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.print("A conta de luz está paga? (SIM/NÃO): ");
        String respostaPago = leitura.nextLine();

        System.out.print("A conta ainda está no prazo de vencimento? (SIM/NÃO): ");
        String respostaVencimento = leitura.nextLine();

        boolean estaPaga = respostaPago.equalsIgnoreCase("sim");
        boolean dentroDoPrazo = respostaVencimento.equalsIgnoreCase("sim");

        if (estaPaga && dentroDoPrazo) {
            System.out.println("Conta regular.");
        } else {
            System.out.println("Conta irregular.");
        }
    }
}
