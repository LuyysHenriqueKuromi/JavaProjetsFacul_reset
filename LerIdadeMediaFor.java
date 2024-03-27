import java.util.Scanner;

public class LerIdadeMediaFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double idade, soma, media, quat_pessoa;

        soma = 0;
        quat_pessoa = 0;

        for (int i = 1; i < 5; i++) {
            System.out.printf("Digite a idade da %d° pessoa: ",
            i);
            
            idade = s.nextInt();

            soma = soma + idade;

            quat_pessoa = quat_pessoa + 1;
        }

        media = soma / quat_pessoa;

        System.out.printf("A media das idades é: %d",
        media);
    }
}
