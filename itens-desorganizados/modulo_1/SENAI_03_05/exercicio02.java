/*
Exercício 2: Cálculo de Imposto de Renda Simples
  Enunciado:
    Crie um programa que receba o salário bruto mensal de um trabalhador e calcule o valor
    do imposto de renda mensal, com base nas faixas:
      ● Até R$ 2.000,00 → isento,
      ● De R$ 2.000,01 até R$ 3.500,00 → 7.5%,
      ● De R$ 3.500,01 até R$ 5.000,00 → 15%,
      ● Acima de R$ 5.000,00 → 22.5%.
  Cálculos:
    ● O programa deve identificar a faixa correta e aplicar o percentual sobre todo o
    salário bruto (simplificação didática).
*/
import java.util.Scanner;

public class exercicio02 {
    public static double calculo_imposto_renda(double salario_bruto_mensal){
      if(salario_bruto_mensal>5000){
        
      }
      return resultado;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Salário bruto mensal\n");
        double salario_bruto_mensal = scanner.nextDouble();
        scanner.close();
        calculo_imposto_renda(salario_bruto_mensal);
      
    }
};