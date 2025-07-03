import java.util.Scanner;

public class exercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("quantas horas de trabalho");

        double hora = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("você esta de folaga");
        String diaFolga = teclado.nextLine();

        boolean folga = diaFolga.equalsIgnoreCase("sim");

        if (!folga && hora <8) {
            System.out.println("pode fazer hora extra");
        }else {
            System.out.println("não pode fazer hora");
        }
    }
}
