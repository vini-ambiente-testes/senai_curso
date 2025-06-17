import java.util.ArrayList;
import java.util.Scanner;

class Contato {
    String nome;
    String telefone;

    public Contato(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
}

public class ex10{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();

        while (true) {
            System.out.println("\n1. Adicionar contato");
            System.out.println("2. Listar contatos");
            System.out.println("3. Remover contato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();
                    contatos.add(new Contato(nome, telefone));
                    System.out.println("Contato adicionado!");
                    break;
                case 2:
                    System.out.println("\nLista de Contatos:");
                    for (int i = 0; i < contatos.size(); i++) {
                        System.out.println((i+1) + ". " + contatos.get(i).nome + " - " + contatos.get(i).telefone);
                    }
                    break;
                case 3:
                    System.out.print("Digite o número do contato a remover: ");
                    int indice = scanner.nextInt() - 1;
                    if (indice >= 0 && indice < contatos.size()) {
                        contatos.remove(indice);
                        System.out.println("Contato removido!");
                    } else {
                        System.out.println("Índice inválido!");
                    }
                    break;
                case 4:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}
