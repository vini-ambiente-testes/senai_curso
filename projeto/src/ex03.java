import java.util.ArrayList;
import java.util.Scanner;

public class ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Adicionar item");
            System.out.println("2. Ver lista");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            if (opcao == 1) {
                System.out.print("Digite o item: ");
                String item = scanner.nextLine();
                lista.add(item);
                System.out.println("Item adicionado!");
            } else if (opcao == 2) {
                System.out.println("\nLista de Compras:");
                for (int i = 0; i < lista.size(); i++) {
                    System.out.println((i+1) + ". " + lista.get(i));
                }
            } else if (opcao == 3) {
                System.out.println("Saindo...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
