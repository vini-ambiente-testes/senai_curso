/*
Exercício 1
    Cálculo de Combustível Gasto em uma Viagem
    Enunciado:
    Escreva um programa em Java que calcule a quantidade de litros de combustível gastos
    em uma viagem, com base no tempo de viagem, velocidade média e consumo do carro.
    O programa deve solicitar ao usuário:
      ● O tempo gasto na viagem (em horas),
      ● A velocidade média durante a viagem (em km/h),
      ● O consumo médio do carro (em km/litro).
    
    Com esses dados, calcule:
    1. A distância total percorrida (distância = tempo × velocidade),
    2. A quantidade de litros de combustível utilizados (litros = distância / consumo).
    
    Saída esperada:
    Exiba a quantidade de litros de combustível gastos na viagem.
*/
import java.util.Scanner;

public class exercicio01 {
    public static double distancia(double tempo_gasto, double velocidade_media){
      double resultado=tempo_gasto*velocidade_media;
      return resultado;
    }
    public static double consumo_litros(double resultado_distancia, double consumo_medio){
      double resultado=resultado_distancia/consumo_medio;
      return resultado;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cálculo de Combustível Gasto em uma Viagem\n");
        System.out.println("\nTempo gasto na viagem (em horas)\n");
        double tempo_gasto = scanner.nextDouble();
        System.out.println("\nVelocidade média durante a viagem (em km/h)\n");
        double velocidade_media = scanner.nextDouble();
        System.out.println("\nConsumo médio do carro (em km/litro).\n");
        double consumo_medio = scanner.nextDouble();
        scanner.close();
        double resultado_distancia=distancia(tempo_gasto,velocidade_media);
        System.out.println("\nA distância total percorrida: "+resultado_distancia+"\n");
        double resultado_consumo=consumo_litros(resultado_distancia,consumo_medio);
        System.out.println("\nQuantidade de litros de combustível utilizados: "+resultado_consumo);
    }
};