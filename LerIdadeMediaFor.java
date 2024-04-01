import java.util.Scanner;

public class LerIdadeMediaFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double idade, soma, media;

        soma = 0;

        for (int i = 1; i < 6; i++) {
            System.out.printf("Digite a idade da %d° pessoa: ", i);
            idade = s.nextDouble();

            soma += idade;
        }

        media = soma / 5;

        System.out.printf("A media das idades é %1.2f",
        media);
    }
}
