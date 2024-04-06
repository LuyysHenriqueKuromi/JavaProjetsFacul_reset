import java.util.Scanner;

public class LerIdadeMediaWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double idade, soma, media;

        soma = 0;
        int repet = 0;

        while (repet < 5) {
            System.out.print("Digite a idade da pessoa: ");
            idade = s.nextInt();

            soma += idade;

            repet++;
        }

        media = soma / 5;

        System.out.printf("A media das idades é %1.2f",
        media);
    }
}
