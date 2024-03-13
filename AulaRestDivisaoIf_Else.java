import java.util.Scanner;

public class AulaRestDivisaoIf_Else {
    public static void main(String[] args) {
        int num1, num2, restoDivisao;
        Scanner s = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        num1 = s.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = s.nextInt();

        restoDivisao = num1 % num2;

        if (restoDivisao == 0) {
            System.out.printf
            ("O numero %d eh divisivel por %d!",
                    num1, num2);
        }else {
            System.out.printf
            ("O numero %d NÂO é divisivel por %d!",
                    num1, num2);
        }
    }
}
