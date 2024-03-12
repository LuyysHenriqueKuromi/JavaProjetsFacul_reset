import java.util.Scanner;

public class SenhaIf_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ditige a senha: ");
        String senha = s.nextLine();

        if (senha.equals("movidoACafe")) {
            System.out.println("ACESSO PERMITIDO");
        }else {
            System.out.println("ACESSO NEGADO");
        }
    }
}
