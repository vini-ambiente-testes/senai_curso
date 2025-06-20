/*
Exercício 8: Contador de Vogais
Peça ao usuário uma palavra e conte quantas vogais (a, e, i, o, u) ela possui.
*/
import java.util.Scanner;
public class contador_vogais{
  public static void  processamento(String palavra){
    char[] lista_letras=palavra.toCharArray();
    String vogais="aeiou";
    char[] lista_vogais=vogais.toCharArray();
    int resultado=0;
    for(char vogal: lista_vogais){
      for(char letra: lista_letras){
        if(letra==vogal){
          resultado=resultado+1;
        }
      }
    }
    System.out.println("O número de vogais é: "+resultado);
  }  
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Contador de vogais");
    System.out.println("Digite a palavra que ver quantas vogais têm ela : ");
    String palavra=leitura.next().toLowerCase();
    processamento(palavra);
  }
}