/*
1)Crie um programa em Java que pergunte a idade da pessoa e, com base nesse valor, identifique a faixa etária dela. O programa deve mostrar uma mensagem dizendo se a pessoa é:

  - Criança (0 a 12 anos)
  
  
  -Adolescente (13 a 17 anos)
  
  
  -Adulto (18 a 59 anos)
  
  
  -Idoso (60 anos ou mais)


 Use uma estrutura switch-case para exibir a mensagem certa de acordo com a faixa da idade. Você pode usar uma variável auxiliar para guardar o número da faixa (1, 2, 3 ou 4) antes de usar o switch.
*/
import java.util.Scanner;

 public class exercicio01 {
    public static void resposta (String resposta){
       System.out.println("Você é "+resposta);

    }
    public static void switch_idade(int faixa){
      String resposta=null;
      switch (faixa) {
        case 1:
          resposta="Criança";
        break;
        case 2:
          resposta="Adolescente";
        break;
        case 3:
          resposta="Adulto";
        break;
        case 4:
          resposta="Idoso";
        break;
         
      };
     resposta(resposta);
    }
     public static void faixa_etaria(int idade){
       int faixa=0;
       if(idade<=12) {
         faixa=1;
       }
       if (idade>13 && idade<17){
         faixa=2;
       }
       if(idade>17 && idade<=59){
          faixa=3;
        }
        if(idade>59){
          faixa=4;
        }
       switch_idade(faixa);
     }
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Me fale sua idade para saber sua faixa etária\n");
         int idade = scanner.nextInt();
         scanner.close();
         faixa_etaria(idade);

     }
 };