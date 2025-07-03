      /*
Exercício 9: Jogo de Adivinhação
Crie um jogo onde o computador gera um número aleatório entre 1 e 100 e o usuário tenta
adivinhar.
*/
import java.util.Random;
import java.util.Scanner;
public class jogo_adivinhacao{
  public static void processamento(int randomNumber){
    int fim=100;
    int inicio=1;
    int meio =0;
    meio = inicio + (fim - inicio) / 2;//formula padrao
    Scanner leitura = new Scanner(System.in);
    System.out.println("Digite o palpite : ");
    int palpite=leitura.nextInt();
    while(palpite==randomNumber){
      if(fim>randomNumber){
        fim=fim-1;
        System.out.println(fim);
      }
      if(inicio<randomNumber){
        inicio=inicio+1;
        System.out.println(inicio);
      }
    } 
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