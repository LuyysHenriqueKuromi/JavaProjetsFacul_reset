import java.util.Scanner;

public class ProdutComisVendido {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o nome do funcionario: ");
        String nome_func = s.nextLine();

        System.out.print("Digite quantos produtos ele vendeu: ");
        int prod_vend = s.nextInt();

        double comi = 0;

        if (prod_vend <= 250) {
            comi = 1;
        }else if (prod_vend > 250 && prod_vend <= 500) {
            comi = 1.50;
        }else if (prod_vend > 500) {
            comi = 2;
        }

        double total_com = prod_vend * comi;

        System.out.printf("O funcionario %s vai receber R$%2.2f de comição",
        nome_func, total_com);
    }
}
