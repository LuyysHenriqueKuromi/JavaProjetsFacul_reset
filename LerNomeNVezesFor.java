import java.util.Scanner;

;public class LerNomeNVezesFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = s.nextLine();

        System.out.print("Quantas vezes quer que apareça? ");
        int vezes = s.nextInt();

        for (int i = 0; i < vezes; i++) {
            System.out.printf("%s\n",
            nome);
        }
    }
}
