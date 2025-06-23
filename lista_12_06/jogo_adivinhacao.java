/*
Exercício 9: Jogo de Adivinhação
Crie um jogo onde o computador gera um número aleatório entre 1 e 100 e o usuário tenta
adivinhar.
*/
import java.util.Scanner;
import java.util.Random;
public class jogo_adivinhacao{
  public static  int processamento(int randomNumber){
    int meio=randomNumber/2;
    int fim=randomNumber;
    int inicio=0;
    meio = inicio + (fim - inicio) / 2;
  }
  public static void gerador(){
    Random random = new Random();
    int randomNumber = random.nextInt(100);
    processamento(randomNumber);
  }
  public static void main(String[] args) {
    System.out.println("Jogo de adivinhação");
    gerador();
  }
}