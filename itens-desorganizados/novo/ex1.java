/*
1. Crie um programa que solicite a idade de uma pessoa e informe se ela é maior de
idade ou não.
*/
import java.util.Scanner;

public class ex1 {
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.print("Informe sua idade: ");
    int idade = leitura.nextInt();
    if(idade>=18){
      System.out.println("Você é maior de idade");
    }else{
      System.out.println("Você é menor de idade");
    }
  }
}
