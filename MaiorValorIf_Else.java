import java.util.Scanner;

public class MaiorValorIf_Else {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        int valor1 = s.nextInt();

        System.out.print("Digite o segundo valor: ");
        int valor2 = s.nextInt();

        System.out.print("Digite o terceiro valor: ");
        int valor3 = s.nextInt();

        if (valor1 > valor2) {
            if (valor1 > valor3) {
                System.out.print("O maior valor é " + valor1);
            }
        }else if (valor2 > valor3) {
            if (valor2 > valor1) {
                System.out.print("O maior valor é " + valor2);
            }
        }else {
            System.out.print("O maior valor é " + valor3);
        }
    }
}
