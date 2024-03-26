import java.util.Scanner;

public class LerDiaSemanSwith_c {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número para ser o dia da semana: ");
        int dia = s.nextInt();

        String dia_name = "nulo";

        switch (dia) {
            case 1:
                dia_name = "Domingo";
                break;
            case 2:
                dia_name = "Segunda";
                break;
            case 3:
                dia_name = "Terça";
                break;
            case 4:
                dia_name = "Quarta";
                break;
            case 5:
                dia_name = "Quinta";
                break;
            case 6:
                dia_name = "Sábado";
                break;
            default:
                System.out.print("Digite um número de 1 a 7");
                break;
        }

        System.out.printf("Você digitou o dia de: %s",
        dia_name);

    }
}
