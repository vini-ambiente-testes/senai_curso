/*
Exercício 1: Calculadora Básica
Crie um programa que receba dois números do usuário e permita realizar as 4 operações básicas (+, -, *, /) conforme a escolha do usuário.
*/
import java.util.Scanner;
public class calculadora_basica{
  public static void numeros(double primeiro, double segundo, String simbolo){
    double operacao=0;
    switch (simbolo) {
      case "+":
        operacao=primeiro+segundo;
        System.out.println("A soma dos números é: "+operacao);
      break;
      case "-":
        operacao=primeiro-segundo;
        System.out.println("A Diferença dos números é: "+operacao);
      break;
      case "*":
        operacao=primeiro*segundo;
        System.out.println("A Multiplicação dos números é: "+operacao);
      break;
      case "/":
        operacao=primeiro/segundo;
        double resto=primeiro%segundo;
        if(resto==0){
          System.out.println("A Divisão dos números é: "+operacao);
        }else{
          System.out.println("Invalido: divisão por zero");
          break;
        }
        break;
    }
  };  
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Calculadora Básica");
    System.out.println("Digite o 1° número: ");
    double primeiro=leitura.nextDouble();
    System.out.println("Digite o 2° número: ");
    double segundo=leitura.nextDouble();
    System.out.println("Digite a operação que quer fazer com esses números (+, -, *, /)? ");
    String simbolo=leitura.next();
    leitura.close();
    numeros(primeiro,segundo,simbolo);  
  }
}