import java.util.Scanner;

public class NumVerifPar_Impar {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = s.nextInt();

        if (num % 2 == 0) {
            System.out.printf("O número digitado %d é PAR",
            num);
        }else {
            System.out.printf("O número digitado %d é ÍPAR",
            num);
        }
    }
}
