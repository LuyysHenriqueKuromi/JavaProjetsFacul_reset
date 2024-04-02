import java.util.Scanner;

public class LerIdadeQuantdMaiorFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int idade_maior = 0;

        for (int i = 1; i < 6; i++) {
            System.out.printf("Digite a idade da %d° pessoa: ", i);
            int idade = s.nextInt();
            
            if (idade >= 18) {
            idade_maior += 1;
            }
        }

        System.out.printf("Nesse grupo existem %d pessoa(s) alcançaram a maioridade",
        idade_maior);
    }
}
