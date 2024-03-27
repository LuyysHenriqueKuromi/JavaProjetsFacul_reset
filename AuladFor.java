import java.util.Scanner;

public class AuladFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nome = "nulo";

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite seu nome: ");
            nome = s.nextLine();
        }

        System.out.printf("Seu nome é %s", nome);
    }
}
