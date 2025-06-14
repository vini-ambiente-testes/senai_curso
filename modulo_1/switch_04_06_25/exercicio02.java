/*
2) Crie um programa em Java que pergunte ao usuário um número de 1 a 12 e mostre o nome do mês correspondente.
Use a estrutura switch-case para verificar o número digitado e exibir o mês certo.
Se o número digitado estiver fora da faixa de 1 a 12, mostre a mensagem:
  -"Número inválido."
 */
import java.util.Scanner;

 public class exercicio02 {
    public static void resposta (String resposta){
       System.out.println("Mês é "+resposta);
    }
    public static void switch_meses(int faixa){
      String resposta=null;
      switch (faixa) {
        case 1:
          resposta="Janeiro";
        break;
        case 2:
          resposta="Fevereiro";
        break;
        case 3:
          resposta="Março";
        break;
        case 4:
          resposta="Abril";
        break;
        case 5:
          resposta="Maio";
        break;
        case 6:
          resposta="Junho";
        break;
        case 7:
          resposta="Julho";
        break;
        case 8:
          resposta="Agosto";
        break;
        case 9:
          resposta="Setembro";
        break;
        case 10:
          resposta="Outubro";
        break;
        case 11:
          resposta="Novembro";
        break;
        case 12:
          resposta="Dezembro";
        break;
        default:
          resposta = "Mês inválido";
      };
     resposta(resposta);
    }
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Me fale o número do mês que quer saber\n");
         int mes = scanner.nextInt();
         scanner.close();
         switch_meses(mes);

     }
 };