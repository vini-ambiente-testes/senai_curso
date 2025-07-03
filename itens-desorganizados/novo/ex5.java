/*
Escreva um algoritmo que leia três notas (N1, N2 e N3) e seus respectivos pesos (P1,
P2 e P3). Calcule a média ponderada das notas utilizando a fórmula:
média ponderada=P1+P2+P3(N1×P1)+(N2×P2)+(N3×P3). Escreva o resultado da
média ponderada.
*/
import java.util.Scanner;

public class ex5 {
  public static void processamento(double[] notas, int[]pesos){
    double media_ponderada=((notas[0]*pesos[0])+(notas[1]*pesos[1])+(notas[2]*pesos[2]))/(pesos[0]+pesos[1]+pesos[2]);
    System.out.println("A média ponderada é: "+media_ponderada);
  }
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    double[] notas = new double[3];
    int[] pesos = new int[3];
    int contador=0;
    while(contador<=2){
      System.out.println("Fale a nota "+(contador+1)+"ª");
      notas[contador]=leitura.nextDouble();
      System.out.println("Fale o peso "+(contador+1)+"º");
      pesos[contador]=leitura.nextInt();
      contador=contador+1;
    }; 
    processamento(notas,pesos);
  }
}