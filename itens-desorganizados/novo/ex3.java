/*
Escreva um algoritmo para ler as dimensões de um triângulo (base e altura), calcular
e escrever a área do triângulo. Use a fórmula: area=2*base*altura
*/
import java.util.Scanner;

public class ex3 {
  public static void processamento(double base, double altura){
    double area=2*base*altura;
    System.out.println("A área do triângulo é: "+area);
    
  }
  public static void main(String[] args) {
    Scanner leitura = new Scanner(System.in);
    System.out.println("Informe o valor da base do triângulo: ");
    double base = leitura.nextDouble();
    System.out.println("Informe o valor da altura do triângulo: ");
    double altura = leitura.nextDouble();
    leitura.close();
    processamento(base, altura);
  }
}
