/*
Exercício 9: Jogo de Adivinhação
Crie um jogo onde o computador gera um número aleatório entre 1 e 100 e o usuário tenta
adivinhar.
*/
import java.util.Scanner;
import java.util.Random;
public class jogo_adivinhacao{
  public static void processamento(int [] lista_binaria, int randomNumber){
    System.out.println(randomNumber);
    for(int indice: lista_binaria){
      System.out.println(indice);
    }
  }
  public static void valores(int randomNumber){
    int[] lista_binaria=new int[99];
    processamento(lista_binaria,randomNumber);
  }
  public static void gerador(){
    Random random = new Random();
    int randomNumber = random.nextInt(100);
    valores(randomNumber);
  }
  public static void main(String[] args) {
    System.out.println("Jogo de adivinhação");
    gerador();
  }
}