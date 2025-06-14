import java.util.Scanner;

public class exercicio8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("voce não esta logado");

        String bloqueadoNegado = teclado.nextLine();
        boolean bloqueado = bloqueadoNegado.equalsIgnoreCase("sim");


        if (bloqueado ) {
            System.out.println("acesso negado");

        }else {
            System.out.println(" bem-vindo");
        }

    }
}


