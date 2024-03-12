import java.util.Scanner;

public class SenhaIf_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ditige a senha: ");
        String senha = s.nextLine();

        if (senha.equals("Oi")) {
            System.out.println("Entrada aprovada");
        }else {
            System.out.println("Entrada negada");
        }
    }
}
