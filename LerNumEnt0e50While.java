import java.util.Scanner;

public class LerNumEnt0e50While {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num_entre = 0;
        int repet = 1;

        while (repet < 6) {
            System.out.printf("Digite o %d° número: ", repet);
            int num = s.nextInt();

            if (num > 0 && num < 50) {
                num_entre++;
            }

            repet++;
        }

        System.out.printf("Existem %d números entre 0 e 50",
        num_entre);
    }
}
