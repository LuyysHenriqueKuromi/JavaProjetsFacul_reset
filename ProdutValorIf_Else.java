import java.util.Scanner;

public class ProdutValorIf_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double valor_prod, valor_c_desc, descont_prod;

        System.out.print("Digite o nome do produto: ");
        String nome_prod = s.nextLine();

        System.out.print("Digite o valor do produto: ");
        valor_prod = s.nextFloat();
        descont_prod = 0;

        if (valor_prod >= 50 && valor_prod < 200) {
            descont_prod = valor_prod * 0.05;
        }else if (valor_prod >= 200 && valor_prod < 500) {
            descont_prod = valor_prod * 0.06;
        }else if (valor_prod >= 500 && valor_prod < 1000) {
            descont_prod = valor_prod * 0.07;
        }else if (valor_prod >= 1000) {
            descont_prod = valor_prod * 0.08;
        }else {
            System.out.println("ERRO");
        }

        valor_c_desc = valor_prod - descont_prod;

        System.out.printf("O produto %s, de R$%2.2f ele recebeu um desconto e foi para R$%2.2f ",
        nome_prod, valor_prod, valor_c_desc);
    }
}
