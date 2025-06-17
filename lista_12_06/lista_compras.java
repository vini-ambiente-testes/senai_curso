/*
Exercício 6: Lista de Compras com ArrayList
Crie um programa que permita ao usuário adicionar itens a uma lista de compras e depois exiba todos os itens.
*/
import java.util.Scanner;
import java.util.ArrayList;
public class lista_compras{
  public static void adicao_items(String lista[]){
    
    for (String i : lista) {
      System.out.println(i);
    }
  }
  public static void verificar(int contador){
    Scanner leitura = new Scanner(System.in);
    int limite=contador;
    String item="";
    int index=1;
    String[] lista = new String[contador];
    
    while(contador<=limite && contador>0){
      contador=contador-1;
      
      System.out.println("Digite o item "+index+" para adicionar a lista de compras: ");
      index=index+1;
      item=leitura.next();
      lista[index+1]=item;
    }
    adicao_items(lista);
  }
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Lista de Compras");
    System.out.println("Defina o número de itens que deve ter na lista: ");
    int contador=leitura.nextInt();
    verificar(contador);
  }
}