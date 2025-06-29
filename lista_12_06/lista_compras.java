/*
Exercício 6: Lista de Compras com ArrayList
Crie um programa que permita ao usuário adicionar itens a uma lista de compras e depois exiba todos os itens.
*/
import java.util.Scanner;
import java.util.ArrayList;
public class lista_compras{
  public static void mostrarCompras(){
    for(String indice: compras){
      System.out.println(indice);
    }
  }
  public static void criar_lista(String itemAdicionado){
    ArrayList<String> compras = new ArrayList<String>();
    compras.add(itemAdicionado);
  }
  public static void adicionar(){
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite o item? ");
    String itemAdicionado= leitura.next();
    criar_lista(itemAdicionado);
  }
  public static void processamento(int resposta){
    if(resposta==1){
      adicionar();
    };
    if(resposta==2){
      mostrarCompras();
    };
  }
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Lista de Compras");
    System.out.println("Digite:\n1º para adicionar um item;\n2º para ver o carrinho;\n3º para excluir um item;\n4º para excluir o carrinho;");
    int respostaUsuario= leitura.nextInt();
    processamento(respostaUsuario);
  }
}