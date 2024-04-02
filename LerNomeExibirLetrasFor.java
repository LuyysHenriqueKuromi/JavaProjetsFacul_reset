import java.util.Scanner;

public class LerNomeExibirLetrasFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um nome: ");
        String nome = s.nextLine();

        int quant = nome.length();

        for (int i = 0; i < quant; i++) {
            System.out.println(nome.charAt(i));;
        }
    }
}
