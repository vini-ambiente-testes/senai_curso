import java.util.Scanner;

public class CalculadoraMediaPonderada {

    // Atributos da classe para armazenar notas e pesos
    private double[] notas;
    private int[] pesos;

    // Construtor da classe
    public CalculadoraMediaPonderada() {
        this.notas = new double[3];
        this.pesos = new int[3];
    }

    // Método para ler as notas e pesos do usuário
    public void lerDados() {
        Scanner leitura = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Fale a nota " + (i + 1) + "ª");
            this.notas[i] = leitura.nextDouble();
            System.out.println("Fale o peso " + (i + 1) + "º");
            this.pesos[i] = leitura.nextInt();
        }
        leitura.close(); // Fechar o scanner para liberar recursos
    }

    // Método para calcular a média ponderada
    public double calcularMediaPonderada() {
        double somaNotasPonderadas = 0;
        int somaPesos = 0;
        for (int i = 0; i < 3; i++) {
            somaNotasPonderadas += (this.notas[i] * this.pesos[i]);
            somaPesos += this.pesos[i];
        }
        // Evita divisão por zero caso a soma dos pesos seja zero
        if (somaPesos == 0) {
            return 0; // Ou lançar uma exceção, dependendo do requisito
        }
        return somaNotasPonderadas / somaPesos;
    }

    // Método para exibir o resultado
    public void exibirResultado() {
        double media = calcularMediaPonderada();
        System.out.println("A média ponderada é: " + media);
    }

    public static void main(String[] args) {
        // Cria uma instância (objeto) da classe CalculadoraMediaPonderada
        CalculadoraMediaPonderada calculadora = new CalculadoraMediaPonderada();

        // Chama os métodos do objeto para executar as ações
        calculadora.lerDados();
        calculadora.exibirResultado();
    }
}