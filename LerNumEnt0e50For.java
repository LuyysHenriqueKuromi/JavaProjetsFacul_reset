import java.util.Scanner;

public class LerNumEnt0e50For {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num_entre = 0;

        for (int i = 1; i < 6; i++) {
            System.out.printf("Digite o %d° número: ", i);
            int num = s.nextInt();

            if (num > 0 && num < 50) {
                num_entre += 1;
            }
        }

        System.out.printf("Existem %d número(s) entre 0 e 50",
        num_entre);
    }
}
