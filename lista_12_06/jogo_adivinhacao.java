/*
Exercício 9: Jogo de Adivinhação
Crie um jogo onde o computador gera um número aleatório entre 1 e 100 e o usuário tenta
adivinhar.
*/
import java.util.Scanner;
import java.util.Random;
public class jogo_adivinhacao{
  public static void processamento(int palpite){

  }
  public static void resposta_usuario(int randomNumber){
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite o seu palpite");
    int palpite=leitura.nextInt();
    processamento(palpite);
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