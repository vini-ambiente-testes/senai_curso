/*
Exercício 8: Contador de Vogais
Peça ao usuário uma palavra e conte quantas vogais (a, e, i, o, u) ela possui.
*/
import java.util.Scanner;
public class contador_vogais{
  public static void resposta (String resposta){
     System.out.println("O número de vogais é: "+resposta);
  }
  public static void captura_vogais(char indice){
    String indice_str=Character.toString(indice);
    int resultado=0;
    switch (indice_str) {
      case "a":
        resultado=resultado+1;
      break;
      case "e":
        resultado=resultado+1;
      break;
      case "i":
        resultado=resultado+1;
      break;
      case "o":
        resultado=resultado+1;
      break;
      case "u":
        resultado=resultado+1;
      break;      
    }
    resposta(Integer.toString(resultado));
 }
  public static void  criador_array(String palavra){
    char[] lista_palavra=palavra.toCharArray(); 
    for(char indice: lista_palavra){
      captura_vogais(indice);
    }
  }  
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Contador de vogais");
    System.out.println("Digite a palavra que ver quantas vogais têm ela : ");
    String palavra=leitura.next();
    criador_array(palavra);
  }
}