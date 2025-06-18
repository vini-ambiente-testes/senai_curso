/*
Exercício 4: Tabuada
Peça ao usuário um número e mostre a tabuada de 1 a 10 desse número.
*/
import java.util.Scanner;
public class mostrar_tabuada{
  public static void numeros(int numero){
    int contador=0;
    int operacao=0;
    while(contador<=9 && contador>=0){
      contador=contador+1;
      operacao=numero*contador;
      System.out.println(numero+"x"+contador+" = "+operacao);
    }
  }
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Tabuada Básica");
    System.out.print("Digite o número para ver tabuada: ");
    int numero=leitura.nextInt();
    System.out.println("\nTabuada do " + numero + ":\n");
    leitura.close();
    numeros(numero);  
  }
}