import java.util.Scanner;

public class IdadeMaisNova {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nome_1, nome_2;
        int ano_1, ano_2, idade_1, idade_2;

        System.out.println("Digite o nome da primeira pessoa: ");
        nome_1 = s.nextLine();

        System.out.println("Digite o ano que essa pessoa nasceu: ");
        ano_1 = s.nextInt();
        s.nextLine();

        System.out.println("Digite o nome da primeira pessoa: ");
        nome_2 = s.nextLine();

        System.out.println("Digite o ano que essa pessoa nasceu: ");
        ano_2 = s.nextInt();

        idade_1 = 2024 - ano_1;
        idade_2 = 2024 - ano_2;

        System.out.printf("A primeira pessoa se chama %s e nasceu em %d\n",
        nome_1, ano_1);
        System.out.printf("A segunda pessoa se chama %s e nasceu em %d\n",
        nome_2, ano_2);

        if (idade_1 < idade_2) {
            System.out.print("A primeia pessoa é mais nova");
        }else if (idade_1 > idade_2) {
            System.out.print("A segunda pessoa é a mais nova");
        }else {
            System.out.print("Não tem uma pessoa mais nova, ambas nasceram no mesmo ano");
        }
    }
}
