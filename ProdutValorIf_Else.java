import java.util.Scanner;

public class ProdutValorIf_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = s.nextLine();

        System.out.print("Digite o valor do produto: ");
        float valor = s.nextFloat();
        float valor_des = 0;

        if (valor >= 50 && valor < 200) {
            valor_des = valor * (5/100);
        }else if (valor >= 200 && valor < 500) {
            valor_des = valor * (6/100);
        }else if (valor >= 500 && valor < 1000) {
            valor_des = valor * (7/100);
        }else if (valor < 50) {
            System.out.println("ERRO!");
        }else {
            valor_des = valor * (8/100);
        }

        System.out.printf("O produto %s, de R$%.2f ele recebeu um desconto e foi para R$%.2f ",
        nome, valor, valor_des);
    }
}
