import java.util.Scanner;

public class LerNumSomaEncerWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Para parar digite um número negativo\n");

        int soma = 0;
        int cont = 0;

        while (cont < 10) {
            System.out.print("Digite um número: ");
            int num = s.nextInt();

            if (num > 0) {
                soma += num;
            }else {
                break;
            }
        }

        System.out.printf("O resultado das somas foi: %d",
            soma);
    }
}
