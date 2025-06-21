/*
Exercício 9: Jogo de Adivinhação
Crie um jogo onde o computador gera um número aleatório entre 1 e 100 e o usuário tenta
adivinhar.
*/
//Scanner leitura = new Scanner(System.in);
import java.util.Scanner;
import java.util.Random;
public class jogo_adivinhacao{
  public static void resposta_usuario(int randomNumber){

  }
  public static void gerador(){
    Random random = new Random();
    int randomNumber = random.nextInt(100);
    resposta_usuario(randomNumber);
  }
  public static void main(String[] args) {
    System.out.println("Jogo de adivinhação");
    gerador();
  }
}