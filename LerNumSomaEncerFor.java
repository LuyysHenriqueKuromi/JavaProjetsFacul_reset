import java.util.Scanner;

public class LerNumSomaEncerFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Para parar digite um número negativo\n");

        int soma = 0;

        for (int i = 1; i < 999; i++) {
            System.out.print("Digite um número: ");
            int num = s.nextInt();

            if (num > 0) {
                soma += num;
            }else {
                break;
            }
        }

        System.out.printf("A resultado das somas foi: %d",
        soma);
    }
}
