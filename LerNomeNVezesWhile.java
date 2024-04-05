import java.util.Scanner;

public class LerNomeNVezesWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = s.nextLine();

        System.out.print("Quantas vezes quer que apareça? ");
        int vezes = s.nextInt();

        int repet = 0;

        while (repet < vezes) {
            System.out.println(nome);
            repet++;
        }
    }
}
