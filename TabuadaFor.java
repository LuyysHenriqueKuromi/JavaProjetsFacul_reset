import java.util.Scanner;

public class TabuadaFor {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Digite um número para saber sua tabuada: ");
        float valor = s.nextFloat();
        
        for (float i = 1; i <= 10; i++) {
            System.out.printf("%.0f x %.0f = %.0f \n", valor, i, valor * i);
        }
    }
}
