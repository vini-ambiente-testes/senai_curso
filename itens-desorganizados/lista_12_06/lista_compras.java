/*
Exercício 6: Lista de Compras com ArrayList
Crie um programa que permita ao usuário adicionar itens a uma lista de compras e depois exiba todos os itens.
*/
import java.util.Scanner;
import java.util.ArrayList;
public class lista_compras{
  public static void mostrarCompras(ArrayList<String>compras){
    for(String indice: compras){
      System.out.println(indice);
    }
  }
  public static void verificar_lista(String itemAdicionado){
    ArrayList<String> compras = new ArrayList<String>();
    compras.add(itemAdicionado);
    mostrarCompras(compras);
  }
  public static void adicionar(){
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite o item? ");
    String itemAdicionado= leitura.next();
    verificar_lista(itemAdicionado);
  }
  public static void processamento(int resposta){
    if(resposta==1){
      adicionar();
    }

  }
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Lista de Compras");
    System.out.println("Digite:\n1º Adicionar um item;\n2ºVer o carrinho de compras;");
    int respostaUsuario= leitura.nextInt();
    processamento(respostaUsuario);
  }
}