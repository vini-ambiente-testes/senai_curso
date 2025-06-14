/*
2. Escreva um algoritmo que armazene um valor em uma variável A e outro valor em
uma variável B. Em seguida, utilizando apenas atribuições entre variáveis, troque os
conteúdos das variáveis, fazendo com que o valor que está em A passe para B e viceversa. Ao final, escreva os valores que ficaram armazenados nas variáveis.

*/
import java.util.Scanner;

public class ex2 {
  public static void processamento(String primeira_variavel, String segunda_variavel){
    String temp_primeira_variavel=primeira_variavel;
    String temp_segunda_variavel=segunda_variavel;
    primeira_variavel=temp_segunda_variavel;
    segunda_variavel=temp_primeira_variavel;
    System.out.println("O valor da 1ª váriavel: "+primeira_variavel);
    System.out.println("O valor da 2ª váriavel: "+segunda_variavel);
  }
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Informe o valor da 1ª váriavel: ");
    String primeira_variavel = leitura.next();
    System.out.println("Informe o valor da 2ª váriavel: ");
    String segunda_variavel = leitura.next();
    leitura.close();
    processamento(primeira_variavel,segunda_variavel);
    }
}
