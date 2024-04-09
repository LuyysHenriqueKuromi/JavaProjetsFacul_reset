import java.util.Scanner;

public class TabuadaWhile {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Digite um número para saber sua tabuada: ");
        int valor = s.nextInt();
        int repet = 1;

        while (repet <= 10) {
            System.out.printf("%d x %d = %d \n", valor, repet, valor * repet);
            repet++;
        }
    }
}
