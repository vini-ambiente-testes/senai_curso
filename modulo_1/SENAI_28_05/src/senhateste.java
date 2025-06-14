import java.util.Scanner;

public class senhateste {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Vc sabe a senha? (S/N)");

        String resposta = scanner.nextLine();

        if (resposta.equalsIgnoreCase("N")) {
            System.out.println("Vc nao sabe a senha, portanto não pode acessar.");
 return;
        }

        System.out.println("Bem-vindo ao sistema");
        System.out.println("Digite a senha");
        String senha = scanner.nextLine();
        String senhaCorreta = "Admin1234";

        boolean senhaCorretaDigitada = senha.equals(senhaCorreta);
        boolean senhaErrada = !senhaCorretaDigitada;

        if (resposta.equalsIgnoreCase("s") && senhaCorretaDigitada) {
            System.out.println("Acesso Permitido");
        } else if (resposta.equalsIgnoreCase("s") && senhaErrada) {
            System.out.println("Acesso Negado");
        } else {
            System.out.println("Resposta Incorreta");
        }
    }
}
