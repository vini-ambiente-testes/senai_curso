/*
Escreva um algoritmo que leia três notas (N1, N2 e N3) e seus respectivos pesos (P1,
P2 e P3). Calcule a média ponderada das notas utilizando a fórmula:
média ponderada=P1+P2+P3(N1×P1)+(N2×P2)+(N3×P3). Escreva o resultado da
média ponderada.
*/

import java.util.Scanner;

public class ex4 {
  public static void processamento(int idade){
    int mes=idade*12; //300
    int dias=mes*30; //9000
    System.out.println("Você tem de meses de vida até agora: "+mes);
    System.out.println("Você tem de dias de vida até agora: "+dias);
  }
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Informe sua idade: ");
    int idade=leitura.nextInt();
    processamento(idade);
  }
}