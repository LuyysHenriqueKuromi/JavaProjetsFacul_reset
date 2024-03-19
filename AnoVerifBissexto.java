import java.util.Scanner;

public class AnoVerifBissexto {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite um ano: ");
        int ano = s.nextInt();

        if (ano % 4 == 0) {
            System.out.printf("O ano digitado %d é BISSEXTO",
            ano);
        }else {
            System.out.printf("O ano digitado %d NÃO É BISSEXTO",
            ano);
        }
    }
}