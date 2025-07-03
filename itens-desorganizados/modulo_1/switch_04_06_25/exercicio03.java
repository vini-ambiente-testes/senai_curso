/*
3) Crie um programa em Java que pergunte ao aluno em qual turno ele estuda, digitando uma das opções:
Manhã para Matutino


Tarde para Vespertino


Noite para Noturno


Com base na letra digitada, o programa deve exibir a seguinte mensagem:
"Bom dia!" se for Manhã


"Boa tarde!" se for Tarde


"Boa noite!" se for Noturno


Caso o usuário digite outra letra, o programa deve mostrar:
 "Turno inválido."

*/
import java.util.Scanner;

public class exercicio03 {
  public static void resposta (String resposta){
     System.out.println(resposta+"!S");
  }
  public static void switch_turno(String turno){
    String resposta=null;
    switch (turno) {
      case 1:
        resposta="Bom Dia";
      break;
      case 2:
        resposta="Boa Tarde";
      break;
      case 3:
        resposta="Boa noite";
      break;
      default:
        resposta = "Turno inválido";
    };
    resposta(resposta);
  }
  public static void validar_resposta(String turno){

    String vespertino = "MANHA";
    String myStr2 = "HELLO";
    String myStr3 = "Another String";
    System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
    System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false
    switch_turno(turno);
    
  }
  public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.print("Me fale o turno que quer estudar?\n");
       System.out.print("Manhã | Tarde | Noite \n");
       String turno = scanner.toString();
       scanner.close();
       validar_resposta(turno);
    }
}
  