import java.util.Scanner;
import java.util.ArrayList;
public class GerenciadorContatos {
    // Classe interna para representar um contato
     static class Contato {
        String nome;
        String telefone;

        Contato(String nome, String telefone) {
            this.nome = nome;
            this.telefone = telefone;
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Contato> contatos = new ArrayList<>();

        int opcao;;

        do {
            System.out.println("\n=== MENU DE CONTATOS ===");
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contatos");
            System.out.println("3 - Remover contato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = teclado.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = teclado.nextLine();
                    contatos.add(new Contato(nome, telefone));
                    System.out.println("Contato adicionado com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- Lista de Contatos ---");
                    if (contatos.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } else {
                        for (int i = 0; i < contatos.size(); i++) {
                            Contato c = contatos.get(i);
                            System.out.println((i + 1) + " - " + c.nome + " | " + c.telefone);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do contato para remover: ");
                    String nomeRemover = teclado.nextLine();
                    boolean removido = false;

                    for (int i = 0; i < contatos.size(); i++) {
                        if (contatos.get(i).nome.equalsIgnoreCase(nomeRemover)) {
                            contatos.remove(i);
                            removido = true;
                            System.out.println("Contato removido com sucesso.");
                            break;
                        }
                    }

                    if (!removido) {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        teclado.close();
    }
}