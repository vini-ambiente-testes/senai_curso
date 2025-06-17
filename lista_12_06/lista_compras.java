/*
Exercício 6: Lista de Compras com ArrayList
Crie um programa que permita ao usuário adicionar itens a uma lista de compras e depois exiba todos os itens.
*/
import java.util.Scanner;
public class lista_compras{
  public static void adicao_items(String item){
    String[] lista = {item};
    for (String i : lista) {
      System.out.println(i);
    }
  }
  public static void verificar(int contador){
    Scanner leitura = new Scanner(System.in);
    int limite=contador;
    while(contador<=limite && contador>=0){
      contador=contador+1;
      System.out.println("Digite o item para adicionar a lista de compras: ");
      String item=leitura.next();
      adicao_items(item);
    }
  }
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Lista de Compras");
    System.out.println("Defina o número de itens que deve ter na lista: ");
    int contador=leitura.nextInt();
    verificar(contador);
  }
}