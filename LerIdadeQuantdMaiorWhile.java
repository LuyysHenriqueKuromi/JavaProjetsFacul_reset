import java.util.Scanner;

public class LerIdadeQuantdMaiorWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int idade_maior = 0;
        int repet = 1;

        while (repet < 6) {
            System.out.printf("Digite a idade da %d° pessoa: ", repet);
            int idade = s.nextInt();

            if (idade >= 18) {
                idade_maior++;
            }

            repet++;
        }

        System.out.printf("Nesse grupo existem %d pessoa(s) alcançaram a maioridade",
        idade_maior);
    }
}
