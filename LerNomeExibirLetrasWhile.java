import java.util.Scanner;

public class LerNomeExibirLetrasWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = s.nextLine();

        int quant = nome.length();
        int repet = 0;

        while (repet < quant) {
            System.out.println(nome.charAt(repet));
            repet++;
        }
    }
}
