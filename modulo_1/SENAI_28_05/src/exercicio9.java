import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("qual a sua idade");
        int idade = teclado.nextInt();
        teclado.nextLine();

        if (idade >=16){
            System.out.println("pode votar");

        }  if (idade >=18 && idade <=70) {
            System.out.println("voto obrigatorio");

        }  if (idade == 16 || idade ==17 || idade >70) {
            System.out.println("voto facultativo");

        }  if (idade <16) {
            System.out.println("não pode votar");
        }
    }
}
