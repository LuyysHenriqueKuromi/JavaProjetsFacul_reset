import java.util.Scanner;

public class LerNumTabuadaFor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = s.nextInt();

        for (int i = 1; i < num; i++) {
            System.out.printf("%d x 9 = %d\n",
            i, i * 9);
        }
    }
}
